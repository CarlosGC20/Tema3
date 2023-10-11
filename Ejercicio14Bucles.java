import java.util.Random;
public class Ejercicio14Bucles {
	public static void main (String[] args) {
		Random random = new Random();
		final int CARA = 0;
		final int CRUZ = 1;
		int numCaras = 0;
		int numCruces = 0;
		int aleatorio;
		double porcentajeCaras;
		double porcentajeCruces;
		for (int i = 0; i < 10; i++) {
			// aleatorio = random.nextInt(CRUZ - CARA + 1) + CARA;
			aleatorio = random.nextInt(2);
			switch (aleatorio) {
				case CARA:
					numCaras++;
					break;
				case CRUZ:
					numCruces++;
					break;
				}
			}
			porcentajeCaras = ((double)numCaras / (numCaras + numCruces))*100;
			porcentajeCruces = ((double)numCruces / (numCaras + numCruces))*100;
			System.out.println("Caras: " + porcentajeCaras);
			System.out.println("Cruces: " + porcentajeCruces);
			System.out.println("Caras: " + numCaras);
			System.out.println("Cruces: " + numCruces);
	}
}