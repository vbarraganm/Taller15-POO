
package ejercicio1;

public class Libro {
    private String nombre;
    private int numeroDePaginas;
    private String genero;
    
    public Libro(String nombre, int numeroDePaginas, String genero) {
        this.nombre = nombre;
        this.numeroDePaginas = numeroDePaginas;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public String getGenero() {
        return genero;
    }
    
    public void mostrarInformacion() {
        System.out.println("Información del libro:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de páginas: " + numeroDePaginas);
        System.out.println("Género: " + genero);
    }
}
