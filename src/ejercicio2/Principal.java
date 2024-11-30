
package ejercicio2;

public class Principal {
    public static void main(String[] args) {
        Producto producto = new Producto("Coca Cola", "Bebida", 2900, 0.19);
        
        CalculadoraPrecioFinal calcularPrecioFinal = new CalculadoraPrecioFinal();
        double precioFinal = calcularPrecioFinal.calcularPrecioFinal(producto);
        
        GeneradorEtiqueta generarEtiqueta = new GeneradorEtiqueta();
        generarEtiqueta.generarEtiqueta(producto, precioFinal);
    }
}
