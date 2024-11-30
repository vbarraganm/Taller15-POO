
package ejercicio2;

public class CalculadoraPrecioFinal {
    public double calcularPrecioFinal(Producto producto) {
        double precioBase = producto.getPrecioBase();
        double impuesto = producto.getImpuesto();
        return precioBase + (precioBase * impuesto);
    }
}
