
package ejercicio1;

public class ReportesService {
    public void generarReporte(Libro libro) {
        System.out.println("Generando reporte... ");
        System.out.println("Título: " + libro.getNombre());
        System.out.println("Número de páginas: " + libro.getNumeroDePaginas());
        System.out.println("Género: " + libro.getGenero());
    }
}
