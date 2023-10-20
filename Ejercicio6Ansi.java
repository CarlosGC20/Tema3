public class Ejercicio6Ansi {
    public static void main(String[] args) {
        int n = 9; // Número de filas

        for (int i = 1; i <= n; i++) {
            // Imprime números en orden ascendente
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Imprime números en orden descendente
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println(); // Salto de línea para la siguiente fila
        }
    }
}
