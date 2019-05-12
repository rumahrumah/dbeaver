
package org.jkiss.dbeaver.ext.mssql.model.plan.schemas.sql2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowsetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowsetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}RelOpBaseType">
 *       &lt;sequence>
 *         &lt;element name="Object" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}ObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowsetType", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan", propOrder = {
    "object"
})
@XmlSeeAlso({
    TableScanType_sql2005 .class,
    ScalarInsertType_sql2005 .class,
    UpdateType_sql2005 .class,
    CreateIndexType_sql2005 .class,
    SimpleUpdateType_sql2005 .class,
    IndexScanType_sql2005 .class
})
public class RowsetType_sql2005
    extends RelOpBaseType_sql2005
{

    @XmlElement(name = "Object", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan", required = true)
    protected List<ObjectType_sql2005> object;

    /**
     * Gets the value of the object property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectType_sql2005 }
     * 
     * 
     */
    public List<ObjectType_sql2005> getObject() {
        if (object == null) {
            object = new ArrayList<ObjectType_sql2005>();
        }
        return this.object;
    }

}