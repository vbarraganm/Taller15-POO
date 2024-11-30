
package ejercicio3;

public class ValidacionService {
    public boolean validarCorreo(String correo) {
        return correo.contains("@") && correo.contains(".");
    }
}
