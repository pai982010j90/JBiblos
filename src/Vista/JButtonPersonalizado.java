/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author nanohp
 */
public class JButtonPersonalizado extends JButton {

    public Object paquete;

    public Object getPaquete() {
        return paquete;
    }

    public void setPaquete(Object paquete) {
        this.paquete = paquete;
    }

    public JButtonPersonalizado(String text) {
        super(text);
    }

    public JButtonPersonalizado(Object paquete, String text, Icon icon) {
        super(text, icon);
        this.paquete = paquete;
    }

    public JButtonPersonalizado(Object paquete, Action a) {
        super(a);
        this.paquete = paquete;
    }

    public JButtonPersonalizado(Object paquete, String text) {
        super(text);
        this.paquete = paquete;
    }

    public JButtonPersonalizado(Object paquete, Icon icon) {
        super(icon);
        this.paquete = paquete;
    }

    public JButtonPersonalizado(Object paquete) {
        this.paquete = paquete;
    }
}
