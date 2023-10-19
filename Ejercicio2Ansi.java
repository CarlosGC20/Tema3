import java.util.Scanner;

public class Ejercicio2Ansi {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese la hora
        System.out.print("Ingresa la hora (0-23): ");
        int hora = scanner.nextInt();

        // Solicita al usuario que ingrese los minutos
        System.out.print("Ingresa los minutos (0-59): ");
        int minutos = scanner.nextInt();

        // Solicita al usuario que ingrese los segundos
        System.out.print("Ingresa los segundos (0-59): ");
        int segundos = scanner.nextInt();

        // Cierra el objeto Scanner
        scanner.close();

        // Formatea y muestra la hora en el formato hh:mm:ss
        String horaFormateada = String.format("%02d:%02d:%02d", hora, minutos, segundos);
        System.out.println("Hora formateada: " + horaFormateada);
    }
}
