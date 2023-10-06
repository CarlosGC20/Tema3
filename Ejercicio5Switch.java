import java.util.Scanner;
public class Ejercicio5Switch {
static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float calificacion;
		System.out.print("Introduzca nota entre 0 y 10: ");
		calificacion = sc.nextInt();
		int nota = (int) calificacion;
		switch (nota) {
			case 0: case 1: case 2:
			case 3: case 4:
				System.out.println("INSUFICIENTE");
			break;
			case 5:
				System.out.println("SUFICIENTE");
			break;
			case 6:
				System.out.println("BIEN");
			break;
			case 7: case 8:
				System.out.println("NOTABLE");
			break;
			case 9: case 10:
				System.out.println("SOBRESALIENTE");
			break;
			default:
				System.out.println("ERROR");
			break;
		}
	}
}