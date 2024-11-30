
package ejercicio1;


public class Principal {
    public static void main(String[] args) {
    Libro libro = new Libro("Normal People", 256, "Romance");
    libro.mostrarInformacion();
    System.out.println("*****");
    
    ReportesService reportelibro = new ReportesService();
    reportelibro.generarReporte(libro);
    System.out.println("******");
    
    PersistenciaService persistencialibro = new PersistenciaService();
    persistencialibro.guardarEnDisco(libro);
    }
}
