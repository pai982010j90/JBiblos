package Modelo;

public class Usuario extends Persona {

    private int dni;
    private String clave;
    private String email;
    private boolean isAdministrador;
    private String direccion;
    private int telefono;
    private String lookAndFeel;
    

    public Usuario() {
        super();
    }

    /**
     * 
     * @param nombre
     * @param apellido1
     */
    public Usuario(int dni, String nombre, String apellido1) {
        super(nombre, apellido1);
        this.dni = dni;
    }

    /**
     * 
     * @param nombre
     * @param apellido1
     * @param apellido2
     */
    public Usuario(int dni, String nombre, String apellido1, String apellido2) {
        super(nombre, apellido1, apellido2);
        this.dni = dni;
    }

    public boolean isAdministrador() {
        return isAdministrador;
    }

    public void isAdministrador(boolean isAdministrador) {
        this.isAdministrador = isAdministrador;
    }

    public int getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public boolean isIsAdministrador() {
        return isAdministrador;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIsAdministrador(boolean isAdministrador) {
        this.isAdministrador = isAdministrador;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getLookAndFeel() {
        return lookAndFeel;
    }

    public void setLookAndFeel(String lookAndFeel) {
        this.lookAndFeel = lookAndFeel;
    }
    
    
}