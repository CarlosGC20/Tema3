public class Ejercicio3 {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 7;

        int resultado = encontrarMayor(numero1, numero2);

        System.out.println("El número mayor entre " + numero1 + " y " + numero2 + " es: " + resultado);
    }

    public static int encontrarMayor(int num1, int num2) {
        return Math.max(num1, num2);
    }
}
