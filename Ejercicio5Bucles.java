public class Ejercicio5Bucles {
	public static void main(String[] args) {
	int i = 0;
	for (i = 1; i <=100; i = i + 2) {
		System.out.println(i);
		}
		if (i % 2 == 0) {
                System.out.println("El número " + i + " es par")
            } else {
                System.out.println("El número " + i + " es impar")
		}
	}
}