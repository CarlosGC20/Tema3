public class Ejercicio8Ansi {
	public static void main(String[] args) {
		for (int k = 0; k <= 1; ++k) {
			for (int i = 30; i <= 37; i++) {
				for (int j = 40; j <= 47; j++) {
				System.out.printf("%d;%d;%d ", k, i, j);
				}
				System.out.println();
			}
		}
	}
}