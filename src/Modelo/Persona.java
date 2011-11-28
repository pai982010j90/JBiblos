package Modelo;

import java.util.Date;

public class Persona {

    private int idPersona;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Date fNacimiento;
    private String nacionalidad;

    public Persona() {
        super();
    }

    /**
     * 
     * @param nombre
     * @param apellido1
     */
    public Persona(String nombre, String apellido1) {
        super();
        this.nombre = nombre;
        this.apellido1 = apellido1;
    }

    /**
     * 
     * @param nombre
     * @param apellido1
     * @param apellido2
     */
    public Persona(String nombre, String apellido1, String apellido2) {
        this(nombre, apellido1);
        this.apellido2 = apellido2;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return idPersona;
    }

    public void setId(int id) {
        this.idPersona = id;
    }
}