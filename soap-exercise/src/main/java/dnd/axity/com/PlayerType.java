
package dnd.axity.com;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PlayerType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PlayerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="playerClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hitPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dexterity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="constitution" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intelligence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="wisdom" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="charisma" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlayerType", propOrder = {
    "id",
    "name",
    "race",
    "playerClass",
    "level",
    "hitPoints",
    "strength",
    "dexterity",
    "constitution",
    "intelligence",
    "wisdom",
    "charisma"
})
public class PlayerType {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String race;
    @XmlElement(required = true)
    protected String playerClass;
    protected int level;
    protected int hitPoints;
    protected int strength;
    protected int dexterity;
    protected int constitution;
    protected int intelligence;
    protected int wisdom;
    protected int charisma;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad race.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * Define el valor de la propiedad race.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
    }

    /**
     * Obtiene el valor de la propiedad playerClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerClass() {
        return playerClass;
    }

    /**
     * Define el valor de la propiedad playerClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerClass(String value) {
        this.playerClass = value;
    }

    /**
     * Obtiene el valor de la propiedad level.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Obtiene el valor de la propiedad hitPoints.
     * 
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * Define el valor de la propiedad hitPoints.
     * 
     */
    public void setHitPoints(int value) {
        this.hitPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad strength.
     * 
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Define el valor de la propiedad strength.
     * 
     */
    public void setStrength(int value) {
        this.strength = value;
    }

    /**
     * Obtiene el valor de la propiedad dexterity.
     * 
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * Define el valor de la propiedad dexterity.
     * 
     */
    public void setDexterity(int value) {
        this.dexterity = value;
    }

    /**
     * Obtiene el valor de la propiedad constitution.
     * 
     */
    public int getConstitution() {
        return constitution;
    }

    /**
     * Define el valor de la propiedad constitution.
     * 
     */
    public void setConstitution(int value) {
        this.constitution = value;
    }

    /**
     * Obtiene el valor de la propiedad intelligence.
     * 
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * Define el valor de la propiedad intelligence.
     * 
     */
    public void setIntelligence(int value) {
        this.intelligence = value;
    }

    /**
     * Obtiene el valor de la propiedad wisdom.
     * 
     */
    public int getWisdom() {
        return wisdom;
    }

    /**
     * Define el valor de la propiedad wisdom.
     * 
     */
    public void setWisdom(int value) {
        this.wisdom = value;
    }

    /**
     * Obtiene el valor de la propiedad charisma.
     * 
     */
    public int getCharisma() {
        return charisma;
    }

    /**
     * Define el valor de la propiedad charisma.
     * 
     */
    public void setCharisma(int value) {
        this.charisma = value;
    }

}
