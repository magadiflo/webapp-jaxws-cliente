package org.magadiflo.clientews;


import org.magadiflo.webapp.jaxws.services.Curso;
import org.magadiflo.webapp.jaxws.services.ServicioWs;
import org.magadiflo.webapp.jaxws.services.ServicioWsImplService;

public class Main {
    public static void main(String[] args) {
        /**
         * Para que construya lo que viene del web service y detecte las clases. Ir a
         * Maven (parte derecha) y click en "Generate Sources and Updated folders For all Projects"
         * su ícono es una carpeta con un símbolo de actualizar
         */
        ServicioWs service = new ServicioWsImplService().getServicioWsImplPort();
        System.out.println("Saludos " + service.saludar("Martin"));

        Curso curso = new Curso();
        curso.setNombre("Angular");
        Curso respuesta = service.crear(curso);
        System.out.println("Nuevo curso: " + respuesta.getNombre());

        service.listar().forEach(c -> System.out.println(c.getNombre()));
    }
}
