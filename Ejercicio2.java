import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double area = calcularAreaCircunferencia(radio);
        double longitud = calcularLongitudCircunferencia(radio);

        System.out.println("Área de la circunferencia: " + area);
        System.out.println("Longitud de la circunferencia: " + longitud);

        scanner.close();
    }

    public static double calcularAreaCircunferencia(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularLongitudCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }
}
