import java.util.Scanner;
public class Ejercicio7Bucles {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double base;
    int exponente;
    double resultado;
    System.out.println("El programa solicitará un número real como base y el exponente " + "(entero positivo) para calcular una potencia.");
    System.out.print("Introduce la base de la potencia: ");
    base = scanner.nextDouble();
    do {
      System.out.print("Introduce el exponente (entero positivo) de la potencia: ");
      exponente = scanner.nextInt();
      if (exponente <= 0) {
        System.out.println("Error, el exponente debe ser un entero positivo.");
      }
    } while (exponente <= 0);
    resultado = base;
    for (int i=1; i<exponente;i++){
      resultado = (resultado*base);
    }
    System.out.println("El resultado de la potencia es " + resultado);
  }
}