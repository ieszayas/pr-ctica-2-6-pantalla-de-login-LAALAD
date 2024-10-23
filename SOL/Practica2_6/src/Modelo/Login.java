/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author adria
 */
public class Login {
    private ArrayList<Usuario> usuarios = new ArrayList<>();    

    public Login (){}
    
    public ArrayList<Usuario> getUsuarios() {
        usuarios.add(new Usuario("adriana", "1234"));
        usuarios.add(new Usuario("alba", "1234"));
        usuarios.add(new Usuario("paul", "5678"));
        return usuarios;
    }
    
    public boolean comprobarUsuarioRegistrado(String username, String password){
        for (Usuario usuario : getUsuarios()) {
            if(usuario.getUsername().equals(username) && usuario.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    
    
}
