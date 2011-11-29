/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author nanohp
 */
public class Login {

    String nombre;
    String clave;
    String lookAndFeel;


    public Login(String nombre, String clave) {
        super();
        this.nombre = nombre;
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLookAndFeel() {
        return lookAndFeel;
    }

    public void setLookAndFeel(String lookAndFeel) {
        this.lookAndFeel = lookAndFeel;
    }
    
    

    @Override
    public String toString() {
        return "Login{" + "nombre=" + nombre + ", clave=" + clave + '}';
    }
}
