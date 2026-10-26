package Model;

public class Sumatoria {
    public static int calcularSuma(int[] numeros) {
            int suma = 0;
            for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i];
            }
            return suma;
    }
}
