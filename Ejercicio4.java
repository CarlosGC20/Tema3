import java.util.Scanner;
public class Ejercicio4 {
static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double numero1, numero2, menor, mayor;
	//Lectura de dos números reales distintos
	do {
		System.out.print("Introduce un número : ");
		numero1 = sc.nextDouble();
		System.out.print("Introduce otro número distinto del anterior: ");                   
		numero2 = sc.nextDouble();
		if(numero1 == numero2){
		System.out.println("Debes introducir dos números distintos");
	}
	} while (numero1 == numero2);
	//Calcular cuál de los números es el mayor y cuál el menor
	if (numero1 > numero2) {
		mayor = numero1;
		menor = numero2;
	} else {
		mayor = numero2;
		menor = numero1;
	}
	//Mostrar por pantalla los números desde el menor hasta el mayor.
	System.out.println("\nNúmeros desde " + menor + " hasta " + mayor + " : ");
	for (double i = menor; i <= mayor; i++) {
		System.out.println(i);
		}
	}
}