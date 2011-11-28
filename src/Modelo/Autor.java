package Modelo;

import java.util.*;
import HBM.*;

public class Autor extends Persona {

    Collection<Titulo> escribe;

    /**
     * 
     * @param nombre
     * @param apellido1
     */
    public Autor(String nombre, String apellido1) {
        super(nombre, apellido1);
    }

    /**
     * 
     * @param nombre
     * @param apellido1
     * @param apellido2
     */
    public Autor(String nombre, String apellido1, String apellido2) {
        super(nombre, apellido1);
    }
}