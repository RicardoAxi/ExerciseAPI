
package dnd.axity.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="playerId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="player" type="{com.axity.dnd}PlayerType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "playerId",
    "player"
})
@XmlRootElement(name = "UpdatePlayerRequest")
public class UpdatePlayerRequest {

    protected int playerId;
    @XmlElement(required = true)
    protected PlayerType player;

    /**
     * Obtiene el valor de la propiedad playerId.
     * 
     */
    public int getPlayerId() {
        return playerId;
    }

    /**
     * Define el valor de la propiedad playerId.
     * 
     */
    public void setPlayerId(int value) {
        this.playerId = value;
    }

    /**
     * Obtiene el valor de la propiedad player.
     * 
     * @return
     *     possible object is
     *     {@link PlayerType }
     *     
     */
    public PlayerType getPlayer() {
        return player;
    }

    /**
     * Define el valor de la propiedad player.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayerType }
     *     
     */
    public void setPlayer(PlayerType value) {
        this.player = value;
    }

}
