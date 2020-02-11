
package cs.calc.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cs.calc.client package. 
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

    private final static QName _Last_QNAME = new QName("http://server.calc.cs/", "last");
    private final static QName _LastResponse_QNAME = new QName("http://server.calc.cs/", "lastResponse");
    private final static QName _Mul_QNAME = new QName("http://server.calc.cs/", "mul");
    private final static QName _MulResponse_QNAME = new QName("http://server.calc.cs/", "mulResponse");
    private final static QName _Sum_QNAME = new QName("http://server.calc.cs/", "sum");
    private final static QName _SumResponse_QNAME = new QName("http://server.calc.cs/", "sumResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cs.calc.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Last }
     * 
     */
    public Last createLast() {
        return new Last();
    }

    /**
     * Create an instance of {@link LastResponse }
     * 
     */
    public LastResponse createLastResponse() {
        return new LastResponse();
    }

    /**
     * Create an instance of {@link Mul }
     * 
     */
    public Mul createMul() {
        return new Mul();
    }

    /**
     * Create an instance of {@link MulResponse }
     * 
     */
    public MulResponse createMulResponse() {
        return new MulResponse();
    }

    /**
     * Create an instance of {@link Sum }
     * 
     */
    public Sum createSum() {
        return new Sum();
    }

    /**
     * Create an instance of {@link SumResponse }
     * 
     */
    public SumResponse createSumResponse() {
        return new SumResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Last }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Last }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.calc.cs/", name = "last")
    public JAXBElement<Last> createLast(Last value) {
        return new JAXBElement<Last>(_Last_QNAME, Last.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LastResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LastResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.calc.cs/", name = "lastResponse")
    public JAXBElement<LastResponse> createLastResponse(LastResponse value) {
        return new JAXBElement<LastResponse>(_LastResponse_QNAME, LastResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mul }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Mul }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.calc.cs/", name = "mul")
    public JAXBElement<Mul> createMul(Mul value) {
        return new JAXBElement<Mul>(_Mul_QNAME, Mul.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MulResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MulResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.calc.cs/", name = "mulResponse")
    public JAXBElement<MulResponse> createMulResponse(MulResponse value) {
        return new JAXBElement<MulResponse>(_MulResponse_QNAME, MulResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sum }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.calc.cs/", name = "sum")
    public JAXBElement<Sum> createSum(Sum value) {
        return new JAXBElement<Sum>(_Sum_QNAME, Sum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.calc.cs/", name = "sumResponse")
    public JAXBElement<SumResponse> createSumResponse(SumResponse value) {
        return new JAXBElement<SumResponse>(_SumResponse_QNAME, SumResponse.class, null, value);
    }

}
