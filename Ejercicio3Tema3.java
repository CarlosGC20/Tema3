import java.util.Scanner;
public class Ejercicio3Tema3 {
static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
	int num1;
	Scanner lector = new Scanner(System.in);
	System.out.println("Introduce un número:");
	num1 = Integer.parseInt(lector.nextLine());
	if (num1 < 18){
		System.out.println("Es menor de edad");
		} else {
		System.out.println("Es mayor de edad");
		}
	lector.close();
	}
}