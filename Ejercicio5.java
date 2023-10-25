public class Ejercicio5 {
    public static void main(String[] args) {
        char caracter = '*';
        int veces = 5;

        imprimirCaracter(caracter, veces);
    }

    public static void imprimirCaracter(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println(); // Agrega un salto de línea al final para separar las líneas
    }
}
