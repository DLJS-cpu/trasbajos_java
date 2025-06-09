import java.util.Scanner;

public class RepetirNombre {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos el nombre al usuario
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Pedimos cuántas veces se debe imprimir el nombre
        System.out.print("¿Cuántas veces quieres imprimir tu nombre?: ");
        int n = scanner.nextInt();

        // Bucle for para repetir la impresión del nombre n veces
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". " + nombre);
        }

        // Cerramos el escáner (buena práctica)
        scanner.close();
    }
}
