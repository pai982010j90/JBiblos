/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Controlador.Evento;
import Controlador.Observador;
import Modelo.Biblioteca;
import Modelo.MenuData;
import Modelo.Usuario;
import java.awt.FlowLayout;
import java.beans.PropertyChangeEvent;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nanohp
 */
public class VistaGrafica implements IVista, Observador {

    private int estado;
    private Controlador controlador;
    private VistaGLogin vGLogin;
    private VistaGPrincipal vGPrincipal;
    private Observable modelo;
    private Biblioteca biblioteca;

    public VistaGrafica(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public VistaGrafica(MenuData menu) {
    }

    @Override
    public void arranca() {
        vGLogin = new VistaGLogin(this, controlador);
        vGLogin.setVisible(true);
    }

    public void operacion(Usuario usuario) {
        vGPrincipal = new VistaGPrincipal(this, controlador, usuario, biblioteca);
        vGPrincipal.setVisible(true);
    }

    @Override
    public void setModelo(Observable observable) {
        modelo = observable;
    }

    @Override
    public String getValor(String etiqueta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void modelPropertyChange(PropertyChangeEvent evt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eventoRespuesta(Evento evento) {

        Object info = evento.getInfo();

        switch (evento.getTipoEvento()) {

            case LOGIN_OK:
                if (info.getClass().getName().startsWith("Modelo.Usuario")) {
                    //vGLogin.setVisible(false);
                    //vGLogin = null;
                    operacion((Usuario) info);
                } else {
                    assert false : info.getClass().getName() + " clase no valida";
                }
                break;
            default:
                System.err.println("eventoRespuesta() no tratado");
        }
    }

    @Override
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
}
