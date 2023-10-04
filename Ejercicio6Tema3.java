import java.util.Scanner;
public class Ejercicio6Tema3 {
static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {

    System.out.print("Indica el precio: ");
    double pre = Double.parseDouble(scanner.nextLine());
    pre = pre * 100;
    int precio = (int) pre;

    System.out.print("Indica la cantidad que has ingresado: ");
    double ing = Double.parseDouble(scanner.nextLine());
    ing = ing * 100;
    int ingreso = (int) ing;

    int devolver;
    int resto = ingreso % 5;
    if (resto != 0)
        System.out.println(ingreso + " No es múltiplo de " + 5);
    else {
        if (ingreso < precio) {
            System.out.println("Dinero insuficiente...");
        } else {
            devolver = ingreso - precio;
            System.out.print("Su cambio: ");
            while (devolver != 0) {
                if (devolver >= 200) {
                    System.out.println("Monedas de 2 euros: " + devolver / 200);
                    devolver %= 200;
                }
                if (devolver >= 100) {
                    System.out.println("Monedas de 1 euro: " + devolver / 100);
                    devolver %= 100;
                }
                if (devolver >= 50) {
                    System.out.println("Monedas de 50 centimos: " + devolver / 50);
                    devolver %= 50;
                }
                if (devolver >= 20) {
                    System.out.println("Monedas de 20 centimos " + devolver / 20);
                    devolver %= 20;
                }
                if (devolver >= 10) {
                    System.out.println("Monedas de 10 centimos: " + devolver / 10);
                    devolver %= 10;
                }
                if (devolver >= 5) {
                    System.out.println("Monedas de 5 centimos: " + devolver / 5);
                    devolver %= 5;
		}
		if (devolver >= 2) {
                    System.out.println("Monedas de 2 centimos: " + devolver / 2);
                    devolver %= 2;
                }
		if (devolver >= 1) {
                    System.out.println("Monedas de 1 centimos: " + devolver / 1);
                    devolver %= 1;
                }
	}
}
}
}
}