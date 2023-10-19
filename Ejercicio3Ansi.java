public class Ejercicio3Ansi {
    public static void main(String[] args) {
        int n = 9; // Número de filas, ajusta según sea necesario

        for (int i = 1; i <= n; i++) {
            // Imprime espacios en blanco para alinear los números
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            // Imprime números en orden ascendente
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println(); // Salto de línea para la siguiente fila
        }
    }
}
