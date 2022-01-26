
package org.magadiflo.webapp.jaxws.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "ServicioWsImplService", targetNamespace = "http://services.jaxws.webapp.magadiflo.org/", wsdlLocation = "http://localhost:8080/68.webapp-jaxws/ServicioWsImpl?wsdl")
public class ServicioWsImplService
    extends Service
{

    private final static URL SERVICIOWSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICIOWSIMPLSERVICE_EXCEPTION;
    private final static QName SERVICIOWSIMPLSERVICE_QNAME = new QName("http://services.jaxws.webapp.magadiflo.org/", "ServicioWsImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/68.webapp-jaxws/ServicioWsImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOWSIMPLSERVICE_WSDL_LOCATION = url;
        SERVICIOWSIMPLSERVICE_EXCEPTION = e;
    }

    public ServicioWsImplService() {
        super(__getWsdlLocation(), SERVICIOWSIMPLSERVICE_QNAME);
    }

    public ServicioWsImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOWSIMPLSERVICE_QNAME, features);
    }

    public ServicioWsImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOWSIMPLSERVICE_QNAME);
    }

    public ServicioWsImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOWSIMPLSERVICE_QNAME, features);
    }

    public ServicioWsImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioWsImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioWs
     */
    @WebEndpoint(name = "ServicioWsImplPort")
    public ServicioWs getServicioWsImplPort() {
        return super.getPort(new QName("http://services.jaxws.webapp.magadiflo.org/", "ServicioWsImplPort"), ServicioWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioWs
     */
    @WebEndpoint(name = "ServicioWsImplPort")
    public ServicioWs getServicioWsImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.jaxws.webapp.magadiflo.org/", "ServicioWsImplPort"), ServicioWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOWSIMPLSERVICE_EXCEPTION!= null) {
            throw SERVICIOWSIMPLSERVICE_EXCEPTION;
        }
        return SERVICIOWSIMPLSERVICE_WSDL_LOCATION;
    }

}
