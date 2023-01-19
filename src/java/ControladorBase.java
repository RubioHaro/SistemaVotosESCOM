
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class ControladorBase {
    
    private BaseDeDatos baseDatos;
    private ControladorDeConexion control;

    public ControladorBase() {
        baseDatos = new BaseDeDatos("admin", "admin123");
        control = new ControladorDeConexion(baseDatos);
    }

    public Usuario login(String email, String password){

    }

    public int getIdUserByEmail(String email){
        try {
            control.CrearConexion();
            String query = "SELECT id FROM usuarios WHERE email = " + email + ";";
            ResultSet res = control.SentenciaSQL(query);
            if (res.next()) {
                int id = res.getInt("id");
                return id;
            }
            control.CerrarConexion();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ControladorBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int insertUser(String user, String email){
        try {
            control.CrearConexion();
            String query = "INSERT INTO usuarios (nombre, email) VALUES (?, ?)";
            PreparedStatement st = control.StatmentAction(query);
            st.setString(1, user);
            st.setString(2, email);
            st.executeUpdate();
            control.CerrarConexion();
            return getIdUserByEmail(email);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ControladorBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public String insertResultado(String user, String email, int claridad, int reparacion, int atencion){
        int id = getIdUserByEmail(email);
        if(id == -1){
           id = insertUser(user, email);
        } 
        
        try {
            control.CrearConexion();
            String query = "INSERT INTO resultados (id_usuario, claridad, reparacion, atencion) VALUES (?, ?, ?, ?)";
            PreparedStatement st = control.StatmentAction(query);
            st.setInt(1, id);
            st.setInt(2, claridad);
            st.setInt(3, reparacion);
            st.setInt(4, atencion);
            st.executeUpdate();
            control.CerrarConexion();
            return "ok";
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ControladorBase.class.getName()).log(Level.SEVERE, null, ex);
            return "error";
        }
    }
}
