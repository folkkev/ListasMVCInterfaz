package View;

import Model.Crear;

import javax.swing.*;
import java.awt.*;

public class VentanaInicio {
    static JFrame ventana = new JFrame();
    static JPanel panelPrincipal = new JPanel();

    static JPanel panelColumnaIzquierda = new JPanel(new GridBagLayout());
    static JPanel panelColumnaDerecha = new JPanel(new GridBagLayout());

    static JPanel panelDerechoArriba = new JPanel(new GridBagLayout());
    static JPanel panelDerechoAbajo = new JPanel(new GridBagLayout());

    public static void iniciar(){
        //un tablero grande con una fila y dos columnas
        panelPrincipal.setLayout(new GridLayout(1, 2, 10, 10));

        //como se van a organizar los tableros pequeños -> flow en fila,
        panelColumnaIzquierda.setBackground(Color.decode("#1327BE"));

        panelColumnaDerecha.setLayout(new GridLayout(2, 1, 10, 10));
        panelColumnaDerecha.setBackground(Color.decode("#FAF4E4"));

        //elementos del panel derecho

        panelDerechoArriba.setBackground(Color.decode("#FAF4E4"));
        panelDerechoAbajo.setBackground(Color.decode("#FAF4E4"));

        JButton boton1 = Utilidad.crearBoton("1) Lista con numeros random","#FAF4E4","#1327BE","Recursos//BarberChop.otf");
        boton1.addActionListener(evento ->{
            VentanaOpciones.iniciar(Crear.generarAleatorios());
            ventana.dispose();}
        );
        JButton boton2 = Utilidad.crearBoton("2) Lista con numeros elejidos","#FAF4E4","#1327BE","Recursos//BarberChop.otf");
        panelDerechoArriba.add(boton1);
        panelDerechoAbajo.add(boton2);

        panelColumnaDerecha.add(panelDerechoArriba);
        panelColumnaDerecha.add(panelDerechoAbajo);



        //panelColumnaDerecha.add(CajatextoEleccionDeLista);






        //elementos del panel izquierdo
        JLabel textoEleccion = Utilidad.crearLabel("elija una opcion", "#FAF4E4", "Recursos//BarberChop.otf", 27);
        panelColumnaIzquierda.add(textoEleccion);

        panelPrincipal.add(panelColumnaIzquierda);
        panelPrincipal.add(panelColumnaDerecha);


        ventana.add(panelPrincipal);
        ventana.setSize(500,300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);









        ventana.setVisible(true);
    }
}
