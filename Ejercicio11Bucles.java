import java.util.Scanner;

public class Ejercicio11Bucles {
	public static void main(String[] args) {
		Scanner teclado = new Scanner( System.in );
		int num, suma, elementos;
		 float media; // la media puede tener decimales
		 // num: guardará los números introducidos por el usuario
		 // suma: almacenará la suma de todos los números introducidos
		 // elementos: será un contador que indicará el números de números 8o elementos) introducidos
		 System.out.print("Introduzca un número: ");
		 num=teclado.nextInt();

		 suma= 0;
		 elementos= 0;

		 while(num>=0) {
		 suma+=num;
		 elementos++;
		 System.out.print("Introduzca otro número: ");
		 num=teclado.nextInt();
		 }
		 if (elementos == 0) // daría un error de división por cero
		 System.out.println("Imposible hacer la media");
		 else {
		 media= (float)suma/elementos;
		 System.out.println("La media es de: " + media);
		 }
	}
}