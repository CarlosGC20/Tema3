import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio12Bucles {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    int numeroAdivinar = (int) (Math.random() * 100);
        // Debe ser entre 1 y 100, por lo que se incrementa en 1;
        int numero = 0;
        int intentos = 0;
        do {
            boolean leido;
            do {
                System.out.println("Introduzca un numero (1-100)");
                try {
                    intentos++;
                    numero = teclado.nextInt();
                    System.out.println("El numero introducido es: " + numero);
                    leido = true;
                } catch (InputMismatchException ex) {
                    System.out.println("No ha introducido un numero entero");
                    teclado.next(); 
		// Se lee el elemento no reconocido para eliminarlo
                    leido = false;
                }
            } while (leido == false);

            if (numero > numeroAdivinar) {
                System.out.println("El número es menor. Sigue intentándolo");

            }
            if (numero < numeroAdivinar) {
                System.out.println("El número es mayor. Sigue intentándolo");
            }

        } while (numero != numeroAdivinar);

        System.out.println("Enhorabuena. Has acertado, ya que el número es: " + numeroAdivinar);
        System.out.println("Lo has conseguido tras todos estos intentos: " + intentos);

    }

}