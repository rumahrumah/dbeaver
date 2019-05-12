
package org.jkiss.dbeaver.ext.mssql.model.plan.schemas.sql2014;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelOpBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelOpBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefinedValues" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}DefinedValuesListType" minOccurs="0"/>
 *         &lt;element name="InternalInfo" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}InternalInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelOpBaseType", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan", propOrder = {
    "definedValues",
    "internalInfo"
})
@XmlSeeAlso({
    MergeType_sql2014 .class,
    TableValuedFunctionType_sql2014 .class,
    CollapseType_sql2014 .class,
    HashType_sql2014 .class,
    TopType_sql2014 .class,
    SequenceType_sql2014 .class,
    GenericType_sql2014 .class,
    SegmentType_sql2014 .class,
    BatchHashTableBuildType_sql2014 .class,
    RemoteType_sql2014 .class,
    ConcatType_sql2014 .class,
    FilterType_sql2014 .class,
    WindowType_sql2014 .class,
    BitmapType_sql2014 .class,
    SpoolType_sql2014 .class,
    StreamAggregateType_sql2014 .class,
    ConstantScanType_sql2014 .class,
    SimpleIteratorOneChildType_sql2014 .class,
    ComputeScalarType_sql2014 .class,
    NestedLoopsType_sql2014 .class,
    SplitType_sql2014 .class,
    ParallelismType_sql2014 .class,
    RowsetType_sql2014 .class,
    SortType_sql2014 .class,
    UDXType_sql2014 .class
})
public class RelOpBaseType_sql2014 {

    @XmlElement(name = "DefinedValues", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan")
    protected DefinedValuesListType_sql2014 definedValues;
    @XmlElement(name = "InternalInfo", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan")
    protected InternalInfoType_sql2014 internalInfo;

    /**
     * Gets the value of the definedValues property.
     * 
     * @return
     *     possible object is
     *     {@link DefinedValuesListType_sql2014 }
     *     
     */
    public DefinedValuesListType_sql2014 getDefinedValues() {
        return definedValues;
    }

    /**
     * Sets the value of the definedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinedValuesListType_sql2014 }
     *     
     */
    public void setDefinedValues(DefinedValuesListType_sql2014 value) {
        this.definedValues = value;
    }

    /**
     * Gets the value of the internalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InternalInfoType_sql2014 }
     *     
     */
    public InternalInfoType_sql2014 getInternalInfo() {
        return internalInfo;
    }

    /**
     * Sets the value of the internalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalInfoType_sql2014 }
     *     
     */
    public void setInternalInfo(InternalInfoType_sql2014 value) {
        this.internalInfo = value;
    }

}