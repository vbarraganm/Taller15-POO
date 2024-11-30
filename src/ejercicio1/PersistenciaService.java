
package ejercicio1;

public class PersistenciaService {
    public void guardarEnDisco(Libro libro) {
        System.out.println("Guardando el libro '" + libro.getNombre() + "' en el disco...");
    }
}
