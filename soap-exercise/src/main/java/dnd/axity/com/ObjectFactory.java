
package dnd.axity.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dnd.axity.com package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Player_QNAME = new QName("com.axity.dnd", "Player");
    private final static QName _PlayerId_QNAME = new QName("com.axity.dnd", "PlayerId");
    private final static QName _UpdatePlayerResponse_QNAME = new QName("com.axity.dnd", "UpdatePlayerResponse");
    private final static QName _DeletePlayerResponse_QNAME = new QName("com.axity.dnd", "DeletePlayerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dnd.axity.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlayerType }
     * 
     */
    public PlayerType createPlayerType() {
        return new PlayerType();
    }

    /**
     * Create an instance of {@link CreatePlayerRequest }
     * 
     */
    public CreatePlayerRequest createCreatePlayerRequest() {
        return new CreatePlayerRequest();
    }

    /**
     * Create an instance of {@link CreatePlayerResponse }
     * 
     */
    public CreatePlayerResponse createCreatePlayerResponse() {
        return new CreatePlayerResponse();
    }

    /**
     * Create an instance of {@link ReadPlayerRequest }
     * 
     */
    public ReadPlayerRequest createReadPlayerRequest() {
        return new ReadPlayerRequest();
    }

    /**
     * Create an instance of {@link ReadPlayerResponse }
     * 
     */
    public ReadPlayerResponse createReadPlayerResponse() {
        return new ReadPlayerResponse();
    }

    /**
     * Create an instance of {@link UpdatePlayerRequest }
     * 
     */
    public UpdatePlayerRequest createUpdatePlayerRequest() {
        return new UpdatePlayerRequest();
    }

    /**
     * Create an instance of {@link DeletePlayerRequest }
     * 
     */
    public DeletePlayerRequest createDeletePlayerRequest() {
        return new DeletePlayerRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlayerType }{@code >}
     */
    @XmlElementDecl(namespace = "com.axity.dnd", name = "Player")
    public JAXBElement<PlayerType> createPlayer(PlayerType value) {
        return new JAXBElement<PlayerType>(_Player_QNAME, PlayerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "com.axity.dnd", name = "PlayerId")
    public JAXBElement<Integer> createPlayerId(Integer value) {
        return new JAXBElement<Integer>(_PlayerId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "com.axity.dnd", name = "UpdatePlayerResponse")
    public JAXBElement<Boolean> createUpdatePlayerResponse(Boolean value) {
        return new JAXBElement<Boolean>(_UpdatePlayerResponse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "com.axity.dnd", name = "DeletePlayerResponse")
    public JAXBElement<Boolean> createDeletePlayerResponse(Boolean value) {
        return new JAXBElement<Boolean>(_DeletePlayerResponse_QNAME, Boolean.class, null, value);
    }

}
