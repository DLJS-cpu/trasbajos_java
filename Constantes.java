public class Constantes {
    // Definición de constantes
    public static final int MAX_USERS = 100; // Máximo número de usuarios
    public static final String APP_NAME = "MiAplicación"; // Nombre de la aplicación
    public static final double PI = 3.14159; // Valor de Pi
    public static final String VERSION = "1.0.0"; // Versión de la aplicación

    public static void main(String[] args) {
        // Imprimir las constantes
        System.out.println("Máximo número de usuarios: " + MAX_USERS);
        System.out.println("Nombre de la aplicación: " + APP_NAME);
        System.out.println("Valor de Pi: " + PI);
        System.out.println("Versión de la aplicación: " + VERSION);
    
        // Ejemplo de uso de constantes en una operación
        double area = PI * 5 * 5; // Cálculo del área de un círculo con radio 5
        System.out.println("Área de un círculo con radio 5: " + area);
    
    }
}
