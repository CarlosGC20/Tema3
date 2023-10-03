import java.util.Scanner;
public class Ejercicio2Tema3 {
static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
	int num1;
	int num2;
	Scanner lector = new Scanner(System.in);
	System.out.println("Introduce dos números:");
	num1 = Integer.parseInt(lector.nextLine());
	num2 = Integer.parseInt(lector.nextLine());
	if (num1 > num2){
		System.out.println("El número es mayor");
		} else if (num1 < num2) {
		System.out.println("El número es menor");
		} else {
		System.out.println("El número es igual");
		}
	lector.close();
	}
}