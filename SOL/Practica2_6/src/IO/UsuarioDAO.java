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
            String sql = "INSERT INTO usuario (username, password, nombre, apellido, fecha_nac, correo) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps1 = ConexionBBDD.getConnection().prepareStatement(sql);
            // Establecemos los parámetros
            ps1.setString(1, usuario.getUsername());
            ps1.setString(2, usuario.getPassword());
            if (usuario.getNombre().isBlank()) {
                ps1.setNull(3, java.sql.Types.VARCHAR);
            } else {
                ps1.setString(3, usuario.getNombre());
            }
            if (usuario.getApellido().isBlank()) {
                ps1.setNull(4, java.sql.Types.VARCHAR);
            } else {
                ps1.setString(4, usuario.getApellido());
            }
            if (usuario.getFecha_nac().isBlank()) {
                ps1.setNull(5, java.sql.Types.VARCHAR);
            } else {
                ps1.setString(5, usuario.getFecha_nac());
            }
            if (usuario.getCorreo().isBlank()) {
                ps1.setNull(6, java.sql.Types.VARCHAR);
            } else {
                ps1.setString(6, usuario.getCorreo());
            }

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

    public boolean modificarPasswordUsuario(Usuario usuario) {
        try{
            String sq = "UPDATE usuario SET password = ? where username = ?";
            PreparedStatement ps = ConexionBBDD.getConnection().prepareStatement(sq);
            ps.setString(1, usuario.getPassword());
            ps.setString(2, usuario.getUsername());
            ps.executeUpdate();
            ps.close();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<Usuario> listarUsuarios() {
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
