import java.util.Scanner;

public class Ejercicio8Bucles {

    public static void main(String[] args) {
        int n;
        double factorial = 1;
        Scanner sc = new Scanner(System.in);
		
        do {  //introducir por teclado un número mayor o igual a cero
            System.out.print("Introduce un numero entero >= 0: ");
            n = sc.nextInt();
        } while (n < 0);

        //multiplicar todos los números desde 1 hasta n
        //el resultado de las multiplicaciones se acumula en la variable factorial
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
		
        //mostrar el resultado
        System.out.printf("%d! = %.0f %n", n, factorial);                                                         
    }
}