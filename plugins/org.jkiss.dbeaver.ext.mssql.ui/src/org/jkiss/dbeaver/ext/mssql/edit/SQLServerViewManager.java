/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2019 Serge Rider (serge@jkiss.org)
 * Copyright (C) 2011-2012 Eugene Fradkin (eugene.fradkin@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ext.mssql.edit;

import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerDatabase;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerSchema;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerView;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.dbeaver.model.impl.DBSObjectCache;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.utils.CommonUtils;

import java.util.List;
import java.util.Map;

/**
 * SQLServerViewManager
 */
public class SQLServerViewManager extends SQLTableManager<SQLServerView, SQLServerSchema> implements DBEObjectRenamer<SQLServerView> {

    @Override
    public Class<?>[] getChildTypes() {
        return new Class[0];
    }

    @Nullable
    @Override
    public DBSObjectCache<SQLServerSchema, SQLServerView> getObjectsCache(SQLServerView object) {
        return (DBSObjectCache) object.getSchema().getTableCache();
    }

    @Override
    protected void validateObjectProperty(SQLServerView object, DBPPropertyDescriptor property, Object value) throws DBException {
        if (CommonUtils.isEmpty(object.getName())) {
            throw new DBException("View name cannot be empty");
        }
        if (CommonUtils.isEmpty(object.getDDL())) {
            throw new DBException("View definition cannot be empty");
        }
    }

    @Override
    protected SQLServerView createDatabaseObject(DBRProgressMonitor monitor, DBECommandContext context, SQLServerSchema parent, Object copyFrom)
    {
        SQLServerView newView = new SQLServerView(parent);
        try {
            newView.setName(getNewChildName(monitor, parent, "new_view"));
        } catch (DBException e) {
            // Never be here
            log.error(e);
        }
        return newView;
    }

    @Override
    protected void addStructObjectCreateActions(DBRProgressMonitor monitor, List<DBEPersistAction> actions, StructCreateCommand command, Map<String, Object> options) throws DBException {
        createOrReplaceViewQuery(actions, (SQLServerView) command.getObject());
    }

    @Override
    protected void addObjectModifyActions(DBRProgressMonitor monitor, List<DBEPersistAction> actionList, ObjectChangeCommand command, Map<String, Object> options) throws DBException {
        createOrReplaceViewQuery(actionList, (SQLServerView) command.getObject());
    }

    @Override
    protected void addObjectDeleteActions(List<DBEPersistAction> actions, ObjectDeleteCommand command, Map<String, Object> options) {
        actions.add(
            new SQLDatabasePersistAction("Drop view", "DROP VIEW " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-2$
        );
    }

    private void createOrReplaceViewQuery(List<DBEPersistAction> actions, SQLServerView view)
    {
        SQLServerDatabase procDatabase = view.getContainer().getDatabase();
        SQLServerDatabase defaultDatabase = procDatabase.getDataSource().getDefaultObject();
        if (defaultDatabase != procDatabase) {
            actions.add(new SQLDatabasePersistAction("Set current database", "USE " + DBUtils.getQuotedIdentifier(procDatabase), false)); //$NON-NLS-2$
        }

        actions.add(
            new SQLDatabasePersistAction("Drop view", "DROP VIEW IF EXISTS " + view.getFullyQualifiedName(DBPEvaluationContext.DDL))); //$NON-NLS-2$ //$NON-NLS-3$
        actions.add(
            new SQLDatabasePersistAction("Create view", view.getDDL()));

        if (defaultDatabase != procDatabase) {
            actions.add(new SQLDatabasePersistAction("Set current database ", "USE " + DBUtils.getQuotedIdentifier(defaultDatabase), false)); //$NON-NLS-2$
        }
    }

    @Override
    public void renameObject(DBECommandContext commandContext, SQLServerView object, String newName) throws DBException {
        processObjectRename(commandContext, object, newName);
    }

    @Override
    protected void addObjectRenameActions(DBRProgressMonitor monitor, List<DBEPersistAction> actions, ObjectRenameCommand command, Map<String, Object> options)
    {
        SQLServerView view = command.getObject();
        actions.add(
            new SQLDatabasePersistAction(
                "Rename table",
                "EXEC " + SQLServerUtils.getSystemTableName(view.getDatabase(), "sp_rename") +
                    " '" + view.getSchema().getFullyQualifiedName(DBPEvaluationContext.DML) + "." + DBUtils.getQuotedIdentifier(view.getDataSource(), command.getOldName()) +
                    "' , '" + DBUtils.getQuotedIdentifier(view.getDataSource(), command.getNewName()) + "', 'VIEW'")
        );
    }


}
