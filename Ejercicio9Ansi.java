import java.util.Scanner;

public class Ejercicio9Ansi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar los datos al usuario
        System.out.print("Ciudad: ");
        String ciudad = input.nextLine();

        System.out.print("Fecha (día mes año): ");
        int dia = input.nextInt();
        int mes = input.nextInt();
        int año = input.nextInt();

        System.out.print("Hora de la medida (hora minutos segundos): ");
        int hora = input.nextInt();
        int minutos = input.nextInt();
        int segundos = input.nextInt();

        System.out.print("Velocidad del viento (Km/h): ");
        int velocidadViento = input.nextInt();

        System.out.print("Temperatura (°C): ");
        double temperatura = input.nextDouble();

        System.out.print("Presión atmosférica (hPa): ");
        double presion = input.nextDouble();

        System.out.print("Probabilidad de lluvia (%): ");
        int probabilidadLluvia = input.nextInt();

        System.out.print("Índice de radiación ultravioleta (UVI): ");
        int uvi = input.nextInt();

        input.close();

        // Formatear y mostrar los datos
        System.out.println("Datos de la estación meteorológica:");
        System.out.println("--------------------------------------------------");
        System.out.printf("Ciudad:\t\t\t%s\n", ciudad);
        System.out.printf("Fecha:\t\t\t%02d/%02d/%04d\n", dia, mes, año);
        System.out.printf("Hora de la medida:\t%02d:%02d:%02d\n", hora, minutos, segundos);

        // Formatear y mostrar la velocidad del viento en colores
        String colorViento = "";
        if (velocidadViento < 30) {
            colorViento = "Verde";
        } else if (velocidadViento >= 30 && velocidadViento <= 60) {
            colorViento = "Amarillo";
        } else {
            colorViento = "Rojo";
        }
        System.out.printf("Velocidad del viento:\t%d Km/h (%s)\n", velocidadViento, colorViento);

        // Formatear y mostrar la temperatura en colores
        String colorTemperatura = "";
        if (temperatura < 22) {
            colorTemperatura = "Azul";
        } else if (temperatura >= 22 && temperatura <= 27) {
            colorTemperatura = "Verde";
        } else if (temperatura > 27 && temperatura <= 35) {
            colorTemperatura = "Amarillo";
        } else {
            colorTemperatura = "Rojo";
        }
        System.out.printf("Temperatura:\t\t%.2f °C (%s)\n", temperatura, colorTemperatura);

        System.out.printf("Presión atmosférica:\t%.1f hPa\n", presion);

        // Formatear y mostrar la probabilidad de lluvia en colores
        String colorLluvia = "";
        if (probabilidadLluvia < 35) {
            colorLluvia = "Verde";
        } else if (probabilidadLluvia >= 35 && probabilidadLluvia <= 70) {
            colorLluvia = "Amarillo";
        } else {
            colorLluvia = "Rojo";
        }
        System.out.printf("Probabilidad de lluvia:\t%d%% (%s)\n", probabilidadLluvia, colorLluvia);

        // Formatear y mostrar el índice de radiación ultravioleta en colores
        String colorUvi = "";
        if (uvi <= 2) {
            colorUvi = "Verde (nivel bajo)";
        } else if (uvi >= 3 && uvi <= 5) {
            colorUvi = "Azul (nivel moderado)";
        } else if (uvi >= 6 && uvi <= 7) {
            colorUvi = "Amarillo (nivel alto)";
        } else if (uvi >= 8 && uvi <= 10) {
            colorUvi = "Rojo (nivel muy alto)";
        } else {
            colorUvi = "Magenta (nivel extremadamente alto)";
        }
        System.out.printf("Índice de radiación UV:\t%d (%s)\n", uvi, colorUvi);
    }
}
