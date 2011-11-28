package Modelo;

public class CodDewey {

    private CategoriaDewey catDewey;
    private String codTitulo;
    private String codAutor;

    /**
     * 
     * @param catDewey
     * @param codTitulo
     * @param codAutor
     */
    public CodDewey(CategoriaDewey catDewey, String codTitulo, String codAutor) {
        this.catDewey = catDewey;
        this.codTitulo = codTitulo;
        this.codAutor = codAutor;
    }

    public CategoriaDewey getCatDewey() {
        return catDewey;
    }

    public String getCodAutor() {
        return codAutor;
    }

    public String getCodTitulo() {
        return codTitulo;
    }
    
    
}