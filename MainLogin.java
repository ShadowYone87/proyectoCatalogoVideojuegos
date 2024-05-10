// Declara una clase pública llamada MainLogin
public class MainLogin {
    // Método principal, punto de entrada del programa
    public static void main(String[] args) {
        // Crea un objeto de la clase Login llamado login
        Login login = new Login();
        /*Llama al método authenticate() del objeto login para iniciar el proceso de autenticación*/
        login.validarInformacion();
    }
}