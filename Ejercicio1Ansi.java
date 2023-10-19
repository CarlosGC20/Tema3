import java.util.Scanner;

public class Ejercicio1Ansi {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese un número real
        System.out.print("Ingresa un número real: ");
        
        // Lee el número real ingresado por el usuario
        double numeroReal = scanner.nextDouble();

        // Cierra el objeto Scanner
        scanner.close();

        // Muestra el número con dos decimales
        System.out.printf("El número ingresado con 2 decimales es: %.2f%n", numeroReal);
    }
}
