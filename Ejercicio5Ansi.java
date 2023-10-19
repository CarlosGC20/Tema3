public class Ejercicio5Ansi {
    public static void main(String[] args) {
        int n = 9; // Número de filas

        for (int i = 1; i <= n; i++) {
            // Imprime espacios en blanco para alinear los números
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            // Imprime números con colores
            for (int k = 1; k <= i; k++) {
                int colorCode = (i + k) % 8; // Asigna colores rotativos a los números
                System.out.print("\u001B[" + (30 + colorCode) + "m" + k);
            }

            System.out.println(); // Salto de línea para la siguiente fila
        }

        // Restablece el color a negro al final
        System.out.print("\u001B[30m");
    }
}
