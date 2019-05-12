
package org.jkiss.dbeaver.ext.mssql.model.plan.schemas.sql2016;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuessedSelectivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuessedSelectivityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Spatial" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}ObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuessedSelectivityType", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan", propOrder = {
    "spatial"
})
public class GuessedSelectivityType_sql2016 {

    @XmlElement(name = "Spatial", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan", required = true)
    protected ObjectType_sql2016 spatial;

    /**
     * Gets the value of the spatial property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectType_sql2016 }
     *     
     */
    public ObjectType_sql2016 getSpatial() {
        return spatial;
    }

    /**
     * Sets the value of the spatial property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectType_sql2016 }
     *     
     */
    public void setSpatial(ObjectType_sql2016 value) {
        this.spatial = value;
    }

}