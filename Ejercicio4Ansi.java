public class Ejercicio4Ansi {
    public static void main(String[] args) {
        int n = 9; // Número de filas

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Salto de línea para la siguiente fila
        }
    }
}
