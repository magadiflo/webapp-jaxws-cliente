
package org.magadiflo.webapp.jaxws.services;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ServicioWs", targetNamespace = "http://services.jaxws.webapp.magadiflo.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioWs {


    /**
     * 
     * @param arg0
     * @return
     *     returns org.magadiflo.webapp.jaxws.services.Curso
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crear", targetNamespace = "http://services.jaxws.webapp.magadiflo.org/", className = "org.magadiflo.webapp.jaxws.services.Crear")
    @ResponseWrapper(localName = "crearResponse", targetNamespace = "http://services.jaxws.webapp.magadiflo.org/", className = "org.magadiflo.webapp.jaxws.services.CrearResponse")
    public Curso crear(
        @WebParam(name = "arg0", targetNamespace = "")
        Curso arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.magadiflo.webapp.jaxws.services.Curso>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listar", targetNamespace = "http://services.jaxws.webapp.magadiflo.org/", className = "org.magadiflo.webapp.jaxws.services.Listar")
    @ResponseWrapper(localName = "listarResponse", targetNamespace = "http://services.jaxws.webapp.magadiflo.org/", className = "org.magadiflo.webapp.jaxws.services.ListarResponse")
    public List<Curso> listar();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saludar", targetNamespace = "http://services.jaxws.webapp.magadiflo.org/", className = "org.magadiflo.webapp.jaxws.services.Saludar")
    @ResponseWrapper(localName = "saludarResponse", targetNamespace = "http://services.jaxws.webapp.magadiflo.org/", className = "org.magadiflo.webapp.jaxws.services.SaludarResponse")
    public String saludar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
