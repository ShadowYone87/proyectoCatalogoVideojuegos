
// Importa la clase Scanner del paquete java.util
import java.util.Scanner;

// Declara una clase pública llamada Login
class Login {
    // Usuario correcto almacenado como constante
    private static final String USUARIO_CORRECTO = "Equipo2";
    // Contraseña correcta almacenada como constante
    private static final String CONTRASENA_CORRECTA = "videojuegos";

    // Método para autenticar al usuario
    public void validarInformacion() {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner opc = new Scanner(System.in);
        /*
         * Declaración de variables para almacenar el usuario y la contraseña ingresados
         */
        String usuario, contrasena;
        /*
         * Comienza un bucle do-while que se ejecutará al menos una vez y se repetirá
         * mientras la condición sea verdadera
         */
        do {
            /*
             * Mensaje de bienvenida e
             * instrucciones para el usuario
             */
            System.out.println("Que tal, bienvenido, digite sus datos por favor");
            // Solicita al usuario que ingrese su nombre de usuario
            System.out.print("Usuario: ");
            // Lee el nombre de usuario proporcionado por el usuario
            usuario = opc.nextLine();
            // Solicita al usuario que ingrese su contraseña
            System.out.print("Contraseña: ");
            // Lee la contraseña proporcionada por el usuario
            contrasena = opc.nextLine();
            /*
             * Comprueba si el nombre
             * de usuario y la
             * contraseña coinciden
             * con los valores
             * correctos
             */
            if (usuario.equals(USUARIO_CORRECTO) && contrasena.equals(CONTRASENA_CORRECTA)) {
                /*
                 * Mensaje de bienvenida si la
                 * validacion de informacion
                 * es exitosa
                 */
                System.out.println("Bienvenido a tu aplicacion catálogo de videojuegos");
                /*
                 * Sale del método validarInformacion() después de la validación de información
                 * exitosa
                 */
                return;
                // Si el nombre de usuario o la contraseña son incorrectos
            } else {
                // Mensaje de error
                System.out.println("Contraseña incorrecta.");
                try {
                    /* Espera 3 segundos para dar tiempo al usuario a leer el mensaje de error */
                    Thread.sleep(3000);
                    /*
                     * Limpia la pantalla de la
                     * consola (funciona en
                     * Windows)
                     */
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (Exception e) {
                    // Captura y muestra cualquier excepción que pueda ocurrir
                    System.out.println(e);
                }
            }
            /*
             * Bucle infinito para volver a solicitar la autenticación si la contraseña es
             * incorrecta
             */
        } while (true);
    }
}