package View;

import javax.swing.*;
import java.awt.*;

public class Mensajes {
    public static void ImprimirMensajes(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarListaEnPanel(int[] numeros, JPanel panelIzquierda) {
        panelIzquierda.removeAll();

        panelIzquierda.setLayout(new BoxLayout(panelIzquierda, BoxLayout.Y_AXIS));
        panelIzquierda.setBackground(Color.decode("#1327BE"));

        // 1. Espacio elástico superior (empuja el contenido hacia abajo)
        panelIzquierda.add(Box.createVerticalGlue());

        JLabel titulo = Utilidad.crearLabel("Lista Actual", "#FAF4E4", "Recursos//BarberChop.otf", 25);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrado horizontal
        panelIzquierda.add(titulo);

        panelIzquierda.add(Box.createRigidArea(new Dimension(0, 10)));

        for (int i = 0; i < numeros.length; i++) {
            String textoItem = (i + 1) + ") " + numeros[i];
            JLabel itemLabel = Utilidad.crearLabel(textoItem, "#FAF4E4", "Recursos//BarberChop.otf", 12);

            itemLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrado horizontal
            panelIzquierda.add(itemLabel);

            panelIzquierda.add(Box.createRigidArea(new Dimension(0, 5)));
        }

        // 2. Espacio elástico inferior (empuja el contenido hacia arriba)
        panelIzquierda.add(Box.createVerticalGlue());

        panelIzquierda.revalidate();
        panelIzquierda.repaint();
    }

}
