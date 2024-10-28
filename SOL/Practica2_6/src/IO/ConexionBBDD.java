/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author adria
 */
public class ConexionBBDD {

    private static Connection con = null;

    private ConexionBBDD() {
    }

    public static Connection getConnection() {
        Properties propiedades = new Properties();
        if (con == null) {
            try {
                //toma por defecto que es ruta relativa sin poner ./
                FileInputStream input = new FileInputStream("ConfiguracionBBDD/config.properties");
                // Cargar las propiedades desde el archivo
                propiedades.load(input);
                String usuario = propiedades.getProperty("username");
                /*Para entrar sin passwd (null) no lo puedo meter en el fichero porque si le escribo 
                password=null me detecta null como string, de momento borro la propiedad del fichero
                para que al no encontrarla iguale este string a null*/
                String contrasenia = propiedades.getProperty("password"); 
                String cadena_conexion = propiedades.getProperty("database.url");
                /*String cadena_conexion = "jdbc:mysql://localhost:3306/";
                //String nombre_BBDD = "caraVScruz";
                String usuario = "root";
                String contrasenia = null;*/
                con = DriverManager.getConnection(cadena_conexion, usuario, contrasenia);
            } catch (IOException ex) {
                System.out.println("Error al leer config.properties" + ex.toString());
                ex.printStackTrace();//muestra toda la info de la excepcion en rojo
            } catch (Exception e) {
                System.out.println("Error al conectar la base de datos" + e.toString());
                e.printStackTrace();//muestra toda la info de la excepcion en rojo
            }
        }
        return con;
    }

    public static void desconectarBBDD() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar conexion");
            System.out.println(ex.toString());
        }
    }

}
