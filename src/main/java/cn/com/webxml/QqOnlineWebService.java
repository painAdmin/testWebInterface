
package cn.com.webxml;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a> <strong>腾讯QQ在线状态 WEB 服务</strong>。<a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a> 和/或其各供应商不为本页面提供信息的错误、残缺、延迟或因依靠此信息所采取的任何行动负责。</br>此腾讯QQ在线状态Web Services请不要用于任何商业目的，若有需要请<a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">联系我们</a>，欢迎技术交流。 QQ：8409035<br /><strong>使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持</strong>！<br /><br />&nbsp;
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "qqOnlineWebService", targetNamespace = "http://WebXml.com.cn/", wsdlLocation = "http://ws.webxml.com.cn/webservices/qqOnlineWebService.asmx?wsdl")
public class QqOnlineWebService
    extends Service
{

    private final static URL QQONLINEWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException QQONLINEWEBSERVICE_EXCEPTION;
    private final static QName QQONLINEWEBSERVICE_QNAME = new QName("http://WebXml.com.cn/", "qqOnlineWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ws.webxml.com.cn/webservices/qqOnlineWebService.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        QQONLINEWEBSERVICE_WSDL_LOCATION = url;
        QQONLINEWEBSERVICE_EXCEPTION = e;
    }

    public QqOnlineWebService() {
        super(__getWsdlLocation(), QQONLINEWEBSERVICE_QNAME);
    }

    public QqOnlineWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), QQONLINEWEBSERVICE_QNAME, features);
    }

    public QqOnlineWebService(URL wsdlLocation) {
        super(wsdlLocation, QQONLINEWEBSERVICE_QNAME);
    }

    public QqOnlineWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, QQONLINEWEBSERVICE_QNAME, features);
    }

    public QqOnlineWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QqOnlineWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns QqOnlineWebServiceSoap
     */
    @WebEndpoint(name = "qqOnlineWebServiceSoap")
    public QqOnlineWebServiceSoap getQqOnlineWebServiceSoap() {
        return super.getPort(new QName("http://WebXml.com.cn/", "qqOnlineWebServiceSoap"), QqOnlineWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QqOnlineWebServiceSoap
     */
    @WebEndpoint(name = "qqOnlineWebServiceSoap")
    public QqOnlineWebServiceSoap getQqOnlineWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebXml.com.cn/", "qqOnlineWebServiceSoap"), QqOnlineWebServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (QQONLINEWEBSERVICE_EXCEPTION!= null) {
            throw QQONLINEWEBSERVICE_EXCEPTION;
        }
        return QQONLINEWEBSERVICE_WSDL_LOCATION;
    }

}
