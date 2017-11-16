
package info.student;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the info.student package. 
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

    private final static QName _GetNameResponse_QNAME = new QName("http://student.info/", "getNameResponse");
    private final static QName _GetStudentInfo_QNAME = new QName("http://student.info/", "getStudentInfo");
    private final static QName _GetName_QNAME = new QName("http://student.info/", "getName");
    private final static QName _GetAge_QNAME = new QName("http://student.info/", "getAge");
    private final static QName _GetAgeResponse_QNAME = new QName("http://student.info/", "getAgeResponse");
    private final static QName _GetStudentInfoResponse_QNAME = new QName("http://student.info/", "getStudentInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: info.student
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAge }
     * 
     */
    public GetAge createGetAge() {
        return new GetAge();
    }

    /**
     * Create an instance of {@link GetAgeResponse }
     * 
     */
    public GetAgeResponse createGetAgeResponse() {
        return new GetAgeResponse();
    }

    /**
     * Create an instance of {@link GetName }
     * 
     */
    public GetName createGetName() {
        return new GetName();
    }

    /**
     * Create an instance of {@link GetStudentInfo }
     * 
     */
    public GetStudentInfo createGetStudentInfo() {
        return new GetStudentInfo();
    }

    /**
     * Create an instance of {@link GetNameResponse }
     * 
     */
    public GetNameResponse createGetNameResponse() {
        return new GetNameResponse();
    }

    /**
     * Create an instance of {@link GetStudentInfoResponse }
     * 
     */
    public GetStudentInfoResponse createGetStudentInfoResponse() {
        return new GetStudentInfoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://student.info/", name = "getNameResponse")
    public JAXBElement<GetNameResponse> createGetNameResponse(GetNameResponse value) {
        return new JAXBElement<GetNameResponse>(_GetNameResponse_QNAME, GetNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://student.info/", name = "getStudentInfo")
    public JAXBElement<GetStudentInfo> createGetStudentInfo(GetStudentInfo value) {
        return new JAXBElement<GetStudentInfo>(_GetStudentInfo_QNAME, GetStudentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://student.info/", name = "getName")
    public JAXBElement<GetName> createGetName(GetName value) {
        return new JAXBElement<GetName>(_GetName_QNAME, GetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://student.info/", name = "getAge")
    public JAXBElement<GetAge> createGetAge(GetAge value) {
        return new JAXBElement<GetAge>(_GetAge_QNAME, GetAge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://student.info/", name = "getAgeResponse")
    public JAXBElement<GetAgeResponse> createGetAgeResponse(GetAgeResponse value) {
        return new JAXBElement<GetAgeResponse>(_GetAgeResponse_QNAME, GetAgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://student.info/", name = "getStudentInfoResponse")
    public JAXBElement<GetStudentInfoResponse> createGetStudentInfoResponse(GetStudentInfoResponse value) {
        return new JAXBElement<GetStudentInfoResponse>(_GetStudentInfoResponse_QNAME, GetStudentInfoResponse.class, null, value);
    }

}
