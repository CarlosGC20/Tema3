public class Ejercicio1 {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 7;

        int resultado = sumarEnteros(numero1, numero2);

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
    }

    public static int sumarEnteros(int num1, int num2) {
        return num1 + num2;
    }
}
