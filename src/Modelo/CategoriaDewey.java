package Modelo;

public enum CategoriaDewey {

    OBRAS_GENERALES(000, "Obras Generales"),
    FILOSOFIA(100, "Obras Generales"),
    RELIGION(200, "Obras Generales");
    private int codigoCategoria;
    private String nombreCategoria;

    private CategoriaDewey(int codigoCategoria, String nombreCategoria) {
        this.codigoCategoria = codigoCategoria;
        this.nombreCategoria = nombreCategoria;

    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }
}