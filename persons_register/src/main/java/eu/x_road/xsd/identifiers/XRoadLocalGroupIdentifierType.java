
package eu.x_road.xsd.identifiers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRoadLocalGroupIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XRoadLocalGroupIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://x-road.eu/xsd/identifiers}XRoadIdentifierType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://x-road.eu/xsd/identifiers}groupCode"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://x-road.eu/xsd/identifiers}objectType use="required" fixed="LOCALGROUP""/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRoadLocalGroupIdentifierType")
public class XRoadLocalGroupIdentifierType
    extends XRoadIdentifierType
{


}
