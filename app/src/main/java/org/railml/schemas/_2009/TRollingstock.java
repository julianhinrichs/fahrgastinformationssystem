//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				rolling stock data root
 * 			
 * 
 * <p>Java class for tRollingstock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tRollingstock">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.railml.org/schemas/2009}tGlobalElementWithMetadata">
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aRollingstock"/>
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRollingstock")
@XmlSeeAlso({
    Rollingstock.class
})
public class TRollingstock
    extends TGlobalElementWithMetadata
{

    @XmlAttribute(name = "timetableRef")
    @XmlIDREF
    protected Object timetableRef;
    @XmlAttribute(name = "infrastructureRef")
    @XmlIDREF
    protected Object infrastructureRef;

    /**
     * Gets the value of the timetableRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTimetableRef() {
        return timetableRef;
    }

    /**
     * Sets the value of the timetableRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTimetableRef(Object value) {
        this.timetableRef = value;
    }

    /**
     * Gets the value of the infrastructureRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInfrastructureRef() {
        return infrastructureRef;
    }

    /**
     * Sets the value of the infrastructureRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInfrastructureRef(Object value) {
        this.infrastructureRef = value;
    }

}
