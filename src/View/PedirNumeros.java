package View;
import javax.swing.*;
import java.util.Scanner;
public class PedirNumeros {
    private static Scanner PedirNumero = new Scanner(System.in);

        public static int[] pedir10Numeros() {
            int[] ListaNumeros = new int[10];
            for (int i = 0; i < 10; i++) {
                JOptionPane.showInputDialog("ingrese un numero");

                ListaNumeros[i] = PedirNumero.nextInt();
            }
            return ListaNumeros;
        }

        public static int pedirNumero(String mensaje) {                   //se usa para pedir cosas como el indice o la opcion
            int NumeroElejido;
            System.out.print(mensaje);
            NumeroElejido = PedirNumero.nextInt();
            return NumeroElejido;
        }
        public static int pedirNuevoValor() {
            System.out.print("Digite el nuevo número: ");
            return PedirNumero.nextInt();
        }
 }
