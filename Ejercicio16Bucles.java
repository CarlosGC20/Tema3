import java.util.Random;
import java.util.Scanner;

public class Ejercicio16Bucles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int jugadorPorras = 0;
        int computadoraPorras = 0;
        
        while (jugadorPorras < 5 && computadoraPorras < 5) {
            int jugadorPuntos = 0;
            int computadoraPuntos = 0;
            
            // Turno del jugador
            System.out.println("Jugador, presiona Enter para lanzar el dado.");
            scanner.nextLine();
            int dadoJugador = random.nextInt(6) + 1;
            System.out.println("Has lanzado un " + dadoJugador);
            jugadorPuntos += dadoJugador;
            
            if (jugadorPuntos == 11) {
                System.out.println("¡Has ganado! Sumas 1 porra y 1 bonificación por llegar a 11 puntos.");
                jugadorPorras++;
            } else if (jugadorPuntos > 11) {
                System.out.println("Te has pasado de 11 puntos. La computadora gana esta ronda.");
                computadoraPorras++;
            } else {
                // Turno de la computadora
                while (computadoraPuntos < jugadorPuntos && computadoraPuntos < 11) {
                    int dadoComputadora = random.nextInt(6) + 1;
                    System.out.println("La computadora ha lanzado un " + dadoComputadora);
                    computadoraPuntos += dadoComputadora;
                }
                
                if (computadoraPuntos == 11) {
                    System.out.println("La computadora ha ganado con 11 puntos. Suma 1 porra y 1 bonificación.");
                    computadoraPorras++;
                } else if (computadoraPuntos > 11 || (computadoraPuntos < jugadorPuntos && computadoraPuntos >= 11)) {
                    System.out.println("El jugador gana esta ronda.");
                    jugadorPorras++;
                } else {
                    System.out.println("La computadora gana esta ronda.");
                    computadoraPorras++;
                }
            }
            
            System.out.println("Puntuación actual: Jugador " + jugadorPorras + " porras, Computadora " + computadoraPorras + " porras");
        }
        
        if (jugadorPorras >= 5) {
            System.out.println("¡El jugador ha ganado el juego!");
        } else {
            System.out.println("¡La computadora ha ganado el juego!");
        }
    }
}
