
package ejercicio3;

public class AutenticacionService {
    public boolean autenticar(Usuario usuario, String nombre, String contrasena) {
        return usuario.getNombre().equals(nombre) && usuario.getContrasena().equals(contrasena);
    }
}
