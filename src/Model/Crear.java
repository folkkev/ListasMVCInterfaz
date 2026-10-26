package Model;
import java.util.Random;
public class Crear {
    public static int[] generarAleatorios() {
        int[] numerosAleatorios = new int[10];
        Random Aleatorio = new Random();
        for (int i = 0; i < 10; i++) {
            numerosAleatorios[i] = Aleatorio.nextInt(100); // Números aleatorios de 0 a 99
        }
        return numerosAleatorios;
    }
}
