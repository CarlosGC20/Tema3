public class Ejercicio4 {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 7;
        int numero3 = 15;
        int numero4 = 12;

        int resultado = encontrarMayorDeCuatro(numero1, numero2, numero3, numero4);

        System.out.println("El número mayor entre " + numero1 + ", " + numero2 + ", " + numero3 + " y " + numero4 + " es: " + resultado);
    }

    public static int encontrarMayorDeCuatro(int num1, int num2, int num3, int num4) {
        int max = num1;
        
        if (num2 > max) {
            max = num2;
        }
        
        if (num3 > max) {
            max = num3;
        }
        
        if (num4 > max) {
            max = num4;
        }

        return max;
    }
}
