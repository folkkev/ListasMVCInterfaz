package Recursos;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.InputStream;

public class ClaseFuente {

        public static Font cargarFuentePersonalizada(String rutaArchivo, float tamanio) {
            Font fuenteFinal = null;
            try {
                // Cargar el archivo desde los recursos del proyecto
                InputStream is = ClaseFuente.class.getResourceAsStream(rutaArchivo);
                if (is == null) {
                    throw new RuntimeException("No se encontró el archivo de fuente en: " + rutaArchivo);
                }

                // Crear la fuente basada en el archivo binario
                Font fuenteBase = Font.createFont(Font.TRUETYPE_FONT, is);

                // Registrar la fuente en el entorno gráfico de Java
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                ge.registerFont(fuenteBase);

                // Retornar la fuente con el tamaño especificado
                fuenteFinal = fuenteBase.deriveFont(tamanio);

            } catch (Exception e) {
                e.printStackTrace();
                // Si ocurre algún error, se usa una fuente por defecto para que el programa no falle
                fuenteFinal = new Font("Arial", Font.PLAIN, (int) tamanio);
            }
            return fuenteFinal;
        }
}
