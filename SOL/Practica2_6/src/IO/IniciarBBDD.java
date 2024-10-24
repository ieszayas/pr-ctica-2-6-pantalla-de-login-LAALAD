/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class IniciarBBDD {

    private static final String NOMBRE_BBDD = "practica2_6";

    public static void crearBBDD() {
        try {
            //Crear BBDD            
            String sql_create = "CREATE DATABASE IF NOT EXISTS " + NOMBRE_BBDD;
            PreparedStatement ps = ConexionBBDD.getConnection().prepareStatement(sql_create);
            ps.executeUpdate();

            // Seleccionar la base de datos recién creada
            String sql_use = "USE " + NOMBRE_BBDD;
            ps = ConexionBBDD.getConnection().prepareStatement(sql_use);
            ps.executeUpdate();

            //Crear tabla
            String sql_createTable = "CREATE TABLE IF NOT EXISTS usuario (username VARCHAR(20), password VARCHAR(20), nombre VARCHAR(20), apellido VARCHAR(20), fecha_nac VARCHAR(20), correo VARCHAR(20), PRIMARY KEY(username))";
            ps = ConexionBBDD.getConnection().prepareStatement(sql_createTable);
            ps.execute();

            entradasPrueba();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void entradasPrueba() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("adriana", "1234"));
        usuarios.add(new Usuario("paola", "1234"));
        usuarios.add(new Usuario("pedro", "1234"));
        usuarios.add(new Usuario("dani", "1234"));
        try {
            // SQL para insertar un usuario si no existe
            String sql_insert = "INSERT IGNORE INTO usuario (username, password) VALUES (?, ?)";
            PreparedStatement ps_insert = ConexionBBDD.getConnection().prepareStatement(sql_insert);

            for (Usuario usuario : usuarios) {
                ps_insert.setString(1, usuario.getUsername());
                ps_insert.setString(2, usuario.getPassword());
                ps_insert.executeUpdate();
            }

            // Cerrar los PreparedStatement después de su uso
            ps_insert.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}
