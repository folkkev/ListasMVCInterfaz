package View;

import javax.swing.*;
import java.awt.*;
import Recursos.*;

public class Utilidad {


        // Crear un botón personalizado rápidamente
        public static JButton crearBoton(String texto, String bg, String fg, String fuente) {
            JButton boton = new JButton(texto);
            if (bg != null) boton.setBackground(Color.decode(bg));
            if (fg != null) boton.setForeground(Color.decode(fg));
            if (fuente != null) boton.setFont(ClaseFuente.cargarFuentePersonalizada("/Recursos/BarberChop.otf", 16f));;
            boton.setFocusPainted(false);
            boton.setBorderPainted(false);
            return boton;
        }

        // Crear un Label personalizado rápidamente
        public static JLabel crearLabel(String texto, String fg, String fuente, int tamanio) {
            JLabel label = new JLabel(texto);
            if (fg != null) label.setForeground(Color.decode(fg));
            if (fuente != null) label.setFont(ClaseFuente.cargarFuentePersonalizada("/Recursos/BarberChop.otf", tamanio));;
            return label;
        }

        // Crear un Panel personalizado rápidamente (por ejemplo, con GridBagLayout para centrar)
        public static JPanel crearPanel(LayoutManager layout, Color bg) {
            JPanel panel = new JPanel(layout);
            if (bg != null) panel.setBackground(bg);
            return panel;

    }
}
