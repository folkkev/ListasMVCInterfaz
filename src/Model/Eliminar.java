package Model;

public class Eliminar {
    public static int[] eliminarDato(int[] numeros, int posicion) { //metodo
        int[] nuevosNumeros = new int[numeros.length - 1];
        int j = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i != posicion) {
                nuevosNumeros[j] = numeros[i];
                j++;
            }
        }
        return nuevosNumeros;
    }
}
