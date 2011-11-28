
import Controlador.Controlador;
import Controlador2.MiControlador;
import Modelo.Biblioteca;
import Modelo2.MiModelo;
import Utils.Inicializador;
import Vista.IVista;
import Vista.VistaGrafica;
import Vista2.Panel2Modelo;
import Vista2.PanelDesdeModelo;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nanohp
 */
public class JBiblos {
    // Pruebas MVC2

    MiControlador c2;
    JFrame fVista2;
    Panel2Modelo p21;
    PanelDesdeModelo p22;
    MiModelo m2;

    /*
    public JBiblos() {
        c2 = new MiControlador();
        fVista2 = new JFrame("Vista2");
        fVista2.setLayout(new FlowLayout());
        p21 = new Panel2Modelo(c2);
        p22 = new PanelDesdeModelo(c2);
        fVista2.add(p21);
        fVista2.add(p22);
        m2 = new MiModelo();

        c2.addModel(m2);
        c2.addView(p21);
        c2.addView(p22);

        fVista2.pack();
        fVista2.setVisible(true);
    }*/

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {

        /*
         * Arrancamos prueba MVC2
         */
        //JBiblos jBiblos = new JBiblos();

        // Inicialización del modelo
        Biblioteca biblioteca = new Biblioteca();

        // Inicialización de la vista
        /*IVista vista = (seleccionTipoVista() == 'T')
        ? new VistaTexto(Inicializador.inicializaMenu())
        : new VistaGrafica(Inicializador.inicializaMenu());*/
        IVista vista = new VistaGrafica(biblioteca);


        // Inicialización del controlador
        Controlador controlador = new Controlador(biblioteca);

        // Enlazamos la vista con el controlador
        vista.setControlador(controlador);
        // Como la vista implementa el mecanismo 'Observer' necesita conocer al modelo para registrarse como oberver en este
        vista.setModelo(biblioteca);

        // Ponemos en marcha la vista
        vista.arranca();

    }

    private static char seleccionTipoVista() {
        String opcionStr = null;
        char opcion;

        System.err.println("Seleccion tipo vista: (T)exto / (G)rafico");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            do {
                opcionStr = br.readLine();
            } while (!opcionStr.equalsIgnoreCase("T") && !opcionStr.equalsIgnoreCase("G"));
        } catch (IOException ex) {
            Logger.getLogger(JBiblos.class.getName()).log(Level.SEVERE, null, ex);
        }


        return opcionStr.charAt(0);

    }
}
