package Modelo;

public enum Idioma639_1 {

    ES("Español"),
    EN("Inglés"),
    FR("Frances"),
    IT("Italiano");
    private String idioma;

    private Idioma639_1(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }
}