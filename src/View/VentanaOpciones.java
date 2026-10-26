package View;

import Model.Crear;

import javax.swing.*;
import java.awt.*;

public class VentanaOpciones {

    static JFrame ventana = new JFrame();
    static JPanel panelPrincipal = new JPanel();

    static JPanel panelColumnaIzquierda = new JPanel();
    static JPanel panelColumnaDerecha = new JPanel(new GridBagLayout());

    static JPanel panelDerechoArriba = new JPanel(new GridBagLayout());
    static JPanel panelDerechoMedio = new JPanel(new GridBagLayout());
    static JPanel panelDerechoAbajo = new JPanel(new GridBagLayout());

    public static void iniciar(int [] lista) {
        //un tablero grande con una fila y dos columnas
        panelPrincipal.setLayout(new GridLayout(1, 2, 10, 10));

        //como se van a organizar los tableros pequeños -> flow en fila,
        panelColumnaIzquierda.setBackground(Color.decode("#1327BE"));

        panelColumnaDerecha.setLayout(new GridLayout(3, 1, 10, 10));
        panelColumnaDerecha.setBackground(Color.decode("#FAF4E4"));

        //elementos del panel derecho

        panelDerechoArriba.setBackground(Color.decode("#FAF4E4"));
        panelDerechoMedio.setBackground(Color.decode("#FAF4E4"));
        panelDerechoAbajo.setBackground(Color.decode("#FAF4E4"));

        JButton boton1 = Utilidad.crearBoton("1) Eliminar un numero", "#FAF4E4", "#1327BE", "Recursos//BarberChop.otf");
        JButton boton2 = Utilidad.crearBoton("2) Cambiar un numero", "#FAF4E4", "#1327BE", "Recursos//BarberChop.otf");
        JButton boton3 = Utilidad.crearBoton("3) Sumar los numeros", "#FAF4E4", "#1327BE", "Recursos//BarberChop.otf");
        panelDerechoArriba.add(boton1);
        panelDerechoMedio.add(boton2);
        panelDerechoAbajo.add(boton3);

        panelColumnaDerecha.add(panelDerechoArriba);
        panelColumnaDerecha.add(panelDerechoMedio);
        panelColumnaDerecha.add(panelDerechoAbajo);


        //panelColumnaDerecha.add(CajatextoEleccionDeLista);


        //elementos del panel izquierdo
        Mensajes.mostrarListaEnPanel(lista,panelColumnaIzquierda);



        panelPrincipal.add(panelColumnaIzquierda);
        panelPrincipal.add(panelColumnaDerecha);


        ventana.add(panelPrincipal);
        ventana.setSize(500, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);


        ventana.setVisible(true);
    }
}