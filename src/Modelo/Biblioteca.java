package Modelo;

import Utils.HibernateUtil;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import HBM.*;

public class Biblioteca extends Observable {

    
    private Usuario usuarioActivo;
    private Catalogo alberga;
    //private ListaUsuarios contiene;
    
    /*
     * Inicializacion via JDBC
    private Connection conn = null;

    public Biblioteca() {
    String userName = "biblos2";
    String password = "biblos2";
    String url = "jdbc:mysql://localhost/biblos_g2";
    try {
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    conn = DriverManager.getConnection(url, userName, password);
    System.out.println("Coneccion a BD establecida");
    } catch (Exception ex) {
    Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
     * 
     */

    public Biblioteca() {
        alberga = new Catalogo();
    }


    /*
     * 
    
    public Usuario login(String dni, String clave) {
    Usuario usuario = null;
    try {
    usuario = consultaLogin(dni, clave);
    setChanged();
    notifyObservers();
    } catch (SQLException ex) {
    Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
    } catch (Exception ex2) {
    Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex2);
    System.exit(-1);
    
    }
    
    
    return usuario;
    }
     * 
     * 
     */
    public Usuario login(String dni, String clave) throws Exception {



        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            //List usuarios = BD.executeHQLQuery("from Usuario u where u.dni=" + dni + " and u.clave='" + clave + "'");
            usuarioActivo = (Usuario) session.load(Usuario.class, Integer.parseInt(dni));
            System.out.println("BD:" + usuarioActivo.getClave() + ", clave:" + clave);
            if (usuarioActivo.getClave().equals(clave) == false) {
                System.out.println("Fallo en clave");
                throw new Exception("Usuario " + dni + " clave no válido");
            }
            session.getTransaction().commit();
            session.close();
            setChanged();
            notifyObservers();

        } catch (ObjectNotFoundException ex) {
            System.err.println("Login (" + dni + " / " + clave + ") clave no valida");
            throw new Exception("Usuario " + dni + " no válido");
        }
        return usuarioActivo;


    }
/*
    private Usuario consultaLogin(String dni, String clave) throws SQLException, Exception {
        Usuario usuario = null;
        String nombre = null;
        String apellido1 = null;
        String apellido2 = null;
        boolean isAdministrador = false;
        Statement s = conn.createStatement();
        String query = "SELECT * FROM usuario where dni=" + dni + " AND clave='" + clave + "'";
        System.err.println(query);
        s.executeQuery(query);
        ResultSet rs = s.getResultSet();
        int count = 0;
        if (!rs.next()) {
            throw new Exception("Usuario no valido");
        }

        nombre = rs.getString("nombre_usuario");
        apellido1 = rs.getString("apellido1_usuario");
        apellido2 = rs.getString("apellido2_usuario");
        apellido2 = rs.getString("apellido2_usuario");
        if (rs.getInt("tipos_usuario_id_tipo_usuario") != 2) {
            isAdministrador = true;
        }

        ++count;
        rs.close();

        usuario = new Usuario(Integer.parseInt(dni), nombre, apellido1, apellido2);
        usuario.isAdministrador(isAdministrador);
        s.close();
        System.out.println(count + " rows were retrieved");
        return usuario;
    }
     * 
     * 
     */

    public Catalogo getAlberga() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            alberga.init(session.createQuery("from Titulo").list());

            session.getTransaction().commit();
            //session.close();
            setChanged();
            notifyObservers();

        } catch (ObjectNotFoundException ex) {
            System.err.println("ObjectNotFoundException");
        }
        return alberga;
    }

    public List<Dewey> getCategoriasDewey() {
        List<Dewey> listaCategoriasDewey = null;
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            listaCategoriasDewey = session.createQuery("from Dewey").list();

            session.getTransaction().commit();
            //session.close();

        } catch (ObjectNotFoundException ex) {
            System.err.println("ObjectNotFoundException");
        }
        return listaCategoriasDewey;
    }
}