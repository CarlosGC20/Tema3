import java.util.Scanner;
public class Ejercicio10Bucles {
    public static void main(String[] args) {
        int num, suma=0;
        Scanner numero = new Scanner(System.in);
        do {            
            System.out.print("Ingrese un número: ");
            num = numero.nextInt();
            suma+=num;            
        } while (num != 0);
        System.out.println("La suma total da: " + suma);
        //Se sale del bucle a ingresas 0.
    }
}