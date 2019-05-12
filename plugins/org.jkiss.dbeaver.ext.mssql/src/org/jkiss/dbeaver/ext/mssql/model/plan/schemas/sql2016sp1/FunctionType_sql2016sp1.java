
package org.jkiss.dbeaver.ext.mssql.model.plan.schemas.sql2016sp1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Shows the plan for the UDF or stored procedure
 * 
 * <p>Java class for FunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Statements" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}StmtBlockType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ProcName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsNativelyCompiled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionType", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan", propOrder = {
    "statements"
})
public class FunctionType_sql2016sp1 {

    @XmlElement(name = "Statements", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan", required = true)
    protected StmtBlockType_sql2016sp1 statements;
    @XmlAttribute(name = "ProcName")
    protected String procName;
    @XmlAttribute(name = "IsNativelyCompiled")
    protected Boolean isNativelyCompiled;

    /**
     * Gets the value of the statements property.
     * 
     * @return
     *     possible object is
     *     {@link StmtBlockType_sql2016sp1 }
     *     
     */
    public StmtBlockType_sql2016sp1 getStatements() {
        return statements;
    }

    /**
     * Sets the value of the statements property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtBlockType_sql2016sp1 }
     *     
     */
    public void setStatements(StmtBlockType_sql2016sp1 value) {
        this.statements = value;
    }

    /**
     * Gets the value of the procName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcName() {
        return procName;
    }

    /**
     * Sets the value of the procName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcName(String value) {
        this.procName = value;
    }

    /**
     * Gets the value of the isNativelyCompiled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsNativelyCompiled() {
        return isNativelyCompiled;
    }

    /**
     * Sets the value of the isNativelyCompiled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNativelyCompiled(Boolean value) {
        this.isNativelyCompiled = value;
    }

}