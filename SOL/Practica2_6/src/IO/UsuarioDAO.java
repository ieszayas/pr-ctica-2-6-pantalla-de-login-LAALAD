/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO;

import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class UsuarioDAO {

    public static boolean insertarUsuario(Usuario usuario) {
        try {
            //Insertar Datos
            // Sentencia SQL con placeholders
            String sql = "INSERT INTO usuario (username, password) VALUES (?, ?)";
            PreparedStatement ps1 = ConexionBBDD.getConnection().prepareStatement(sql);
            // Establecemos los parámetros
            ps1.setString(1, usuario.getUsername());
            ps1.setString(2, usuario.getPassword());
            // Ejecutamos la sentencia
            ps1.executeUpdate();
            // Cerrar el PreparedStatement después de su uso
            ps1.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al crear un jugador" + e.toString());
            e.printStackTrace();//muestra toda la info de la excepcion en rojo
            return false;
        }
    }

    public boolean modificarUsuario(Usuario usuario) {
        return true;
    }
    
    public static ArrayList<Usuario> listarUsuarios(){        
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            String sq = "SELECT * FROM usuario";
            PreparedStatement ps = ConexionBBDD.getConnection().prepareStatement(sq);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                usuarios.add(new Usuario(rs.getString(1), rs.getString(2)));
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error " + e.toString());
            e.printStackTrace();//muestra toda la info de la excepcion en rojo
        }
        return usuarios;
    }
}
