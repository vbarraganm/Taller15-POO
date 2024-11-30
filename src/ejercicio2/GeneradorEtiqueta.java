
package ejercicio2;

public class GeneradorEtiqueta {
    public void generarEtiqueta(Producto producto, double precioFinal) {
        System.out.println("Etiqueta del producto: ");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio base: $" + producto.getPrecioBase());
        System.out.println("Impuesto: " + (producto.getImpuesto() * 100) + "%");
        System.out.println("Precio final: $" + precioFinal);
    }
}
