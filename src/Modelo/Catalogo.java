package Modelo;

import java.util.*;
import HBM.*;

public class Catalogo {

    private HashMap<TituloId, Titulo> catalogo;
    private Titulo attribute;

    public Catalogo() {
        //super();
        catalogo = new HashMap<TituloId, Titulo>();
    }

    /**
     * 
     * @param titulo
     */
    public void alta(Titulo titulo) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param codDewey
     */
    public void baja(TituloId codDewey) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param titulo
     */
    public void modificar(Titulo titulo) {
        throw new UnsupportedOperationException();
    }

    public Map<TituloId, Titulo> getCatalogo() {
        return catalogo;
    }

    public void init(List<Titulo> catalogo) {
        for (Titulo titulo : catalogo) {
            this.catalogo.put(titulo.getId(), titulo);
        }
    }
}
