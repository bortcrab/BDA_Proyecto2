/*
 * Main.java
 */
package presentacion;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Clase principal del programa.
 *
 * @author Diego Valenzuela Parra - 00000247700
 * @author Juventino López García - 00000248547
 */
public class Main {

    public static void main(String[] args) {
        // Asignamos el look and feel Flatlaf Mac Light.
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException e) {

        }

        // Mandamos a llamar a la pantalla principal del programa.
        FrmHome frmHome = new FrmHome();
        frmHome.setVisible(true);
    }
}
