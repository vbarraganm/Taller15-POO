
package ejercicio2;

public class Producto {
    private String nombre;
    private String categoria;
    private double precioBase;
    private double impuesto;
    
    public Producto(String nombre, String categoria, double precioBase, double impuesto) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecioBase() {
        return precioBase;
    }
    
    public double getImpuesto() {
        return impuesto;
    }
}
