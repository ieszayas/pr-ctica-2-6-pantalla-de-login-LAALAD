/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import IO.UsuarioDAO;
import java.util.ArrayList;

/**
 *
 * @author adria
 */
public class Login {
    
    public Login (){}
        
    public boolean comprobarUsuario(String username, String password){
        for (Usuario usuario : UsuarioDAO.listarUsuarios()) {
            if(usuario.getUsername().equals(username) && usuario.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    
    public boolean comprobarUsername(String username){
        for (Usuario usuario : UsuarioDAO.listarUsuarios()) {
            if(usuario.getUsername().equals(username) ){
                return true;
            }
        }
        return false;
    }
    
    public boolean validarCorreo(String email){        
        String validado = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!email.matches(validado)) {            
            return false;
        }
        return true;
    }
    
    
            
    
    /*public ArrayList<Usuario> getUsuarios() {
        usuarios.add(new Usuario("adriana", "1234"));
        usuarios.add(new Usuario("alba", "1234"));
        usuarios.add(new Usuario("paul", "5678"));
        return usuarios;
    }*/
}
