/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo2;

import Controlador2.MiControlador;

/**
 *
 * @author nanohp
 */
public class MiModelo extends AbstractModel {

    private String texto;

    public MiModelo() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        String oldText = this.texto;
        this.texto = texto;


        this.texto = texto;
        System.out.println(texto + " fijado");
        firePropertyChange(MiControlador.ELEMENT_TEXT_PROPERTY, oldText, texto);
    }
}
