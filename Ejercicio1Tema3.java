import java.util.Scanner;
public class Ejercicio1Tema3 {
static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
	int num1;
	Scanner lector = new Scanner(System.in);
	System.out.println("Introduce un número:");
	num1 = Integer.parseInt(lector.nextLine());
	if (num1%2==0){
		System.out.println("El número es par");
		} else {
		System.out.println("El número es impar");
		}
	lector.close();
	}
}