import java.util.Scanner;
public class Ejercicio7Tema3 {
	public static void main(String[] args) {
	final int Cuota = 500;
	final int Porcentaje_Mayores = 50;
	final int Porcentaje_Joven_Socio = 35;
	final int Porcentaje_Joven_No_Socio = 25;
	int edad, cuota;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Introduzca la edad del nuevo socio: ");
	edad = teclado.nextInt();
	cuota = Cuota;
	if (edad >= 65) {
		cuota = Cuota * Porcentaje_Mayores / 100;
		} else if (edad < 18) {
			System.out.print ("¿El padre es socio (si/no)?");
			String respuesta = teclado.next();
			if (respuesta.equalsIgnoreCase("si")) {
				cuota = Cuota * Porcentaje_Joven_Socio / 100;
			} else {
				cuota = Cuota * Porcentaje_Joven_No_Socio / 100;
			}
		}
	System.out.println ("Debe pagar la cuota " + cuota + " Euros ");
	}
}
