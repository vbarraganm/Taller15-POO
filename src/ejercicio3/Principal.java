
package ejercicio3;

public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("ValentinaBarragan", "12345", "valbmartinez04@gmail.com");
        
        AutenticacionService autenticacion = new AutenticacionService();
        boolean autenticado = autenticacion.autenticar(usuario, "ValentinaBarragan", "12345");
        System.out.println("Autenticación exitosa: " + autenticado);
        
        ValidacionService validacion = new ValidacionService();
        boolean correoValido = validacion.validarCorreo(usuario.getCorreo());
        System.out.println("Correo válido: " + correoValido);
    }
}
