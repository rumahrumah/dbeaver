
package org.jkiss.dbeaver.ext.mssql.model.plan.schemas.sql2016;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TableScanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableScanType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}RowsetType">
 *       &lt;sequence>
 *         &lt;element name="Predicate" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}ScalarExpressionType" minOccurs="0"/>
 *         &lt;element name="PartitionId" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}SingleColumnReferenceType" minOccurs="0"/>
 *         &lt;element name="IndexedViewInfo" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}IndexedViewInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Ordered" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ForcedIndex" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ForceScan" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NoExpandHint" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Storage" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}StorageType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableScanType", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan", propOrder = {
    "predicate",
    "partitionId",
    "indexedViewInfo"
})
public class TableScanType_sql2016
    extends RowsetType_sql2016
{

    @XmlElement(name = "Predicate", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan")
    protected ScalarExpressionType_sql2016 predicate;
    @XmlElement(name = "PartitionId", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan")
    protected SingleColumnReferenceType_sql2016 partitionId;
    @XmlElement(name = "IndexedViewInfo", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan")
    protected IndexedViewInfoType_sql2016 indexedViewInfo;
    @XmlAttribute(name = "Ordered", required = true)
    protected boolean ordered;
    @XmlAttribute(name = "ForcedIndex")
    protected Boolean forcedIndex;
    @XmlAttribute(name = "ForceScan")
    protected Boolean forceScan;
    @XmlAttribute(name = "NoExpandHint")
    protected Boolean noExpandHint;
    @XmlAttribute(name = "Storage")
    protected StorageType_sql2016 storage;

    /**
     * Gets the value of the predicate property.
     * 
     * @return
     *     possible object is
     *     {@link ScalarExpressionType_sql2016 }
     *     
     */
    public ScalarExpressionType_sql2016 getPredicate() {
        return predicate;
    }

    /**
     * Sets the value of the predicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScalarExpressionType_sql2016 }
     *     
     */
    public void setPredicate(ScalarExpressionType_sql2016 value) {
        this.predicate = value;
    }

    /**
     * Gets the value of the partitionId property.
     * 
     * @return
     *     possible object is
     *     {@link SingleColumnReferenceType_sql2016 }
     *     
     */
    public SingleColumnReferenceType_sql2016 getPartitionId() {
        return partitionId;
    }

    /**
     * Sets the value of the partitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleColumnReferenceType_sql2016 }
     *     
     */
    public void setPartitionId(SingleColumnReferenceType_sql2016 value) {
        this.partitionId = value;
    }

    /**
     * Gets the value of the indexedViewInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IndexedViewInfoType_sql2016 }
     *     
     */
    public IndexedViewInfoType_sql2016 getIndexedViewInfo() {
        return indexedViewInfo;
    }

    /**
     * Sets the value of the indexedViewInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexedViewInfoType_sql2016 }
     *     
     */
    public void setIndexedViewInfo(IndexedViewInfoType_sql2016 value) {
        this.indexedViewInfo = value;
    }

    /**
     * Gets the value of the ordered property.
     * 
     */
    public boolean isOrdered() {
        return ordered;
    }

    /**
     * Sets the value of the ordered property.
     * 
     */
    public void setOrdered(boolean value) {
        this.ordered = value;
    }

    /**
     * Gets the value of the forcedIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getForcedIndex() {
        return forcedIndex;
    }

    /**
     * Sets the value of the forcedIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcedIndex(Boolean value) {
        this.forcedIndex = value;
    }

    /**
     * Gets the value of the forceScan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getForceScan() {
        return forceScan;
    }

    /**
     * Sets the value of the forceScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceScan(Boolean value) {
        this.forceScan = value;
    }

    /**
     * Gets the value of the noExpandHint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNoExpandHint() {
        return noExpandHint;
    }

    /**
     * Sets the value of the noExpandHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoExpandHint(Boolean value) {
        this.noExpandHint = value;
    }

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link StorageType_sql2016 }
     *     
     */
    public StorageType_sql2016 getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageType_sql2016 }
     *     
     */
    public void setStorage(StorageType_sql2016 value) {
        this.storage = value;
    }

}