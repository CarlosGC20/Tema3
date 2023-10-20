public class Ejercicio7Ansi {
    public static void main(String[] args) {
        int n = 9; // Número de filas

        for (int i = 1; i <= n; i++) {
            // Imprime espacios en blanco para alinear los números
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Imprime números en orden ascendente
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Imprime números en orden descendente
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }

            System.out.println(); // Salto de línea para la siguiente fila
        }
    }
}
