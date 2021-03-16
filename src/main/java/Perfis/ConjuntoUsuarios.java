/*
Álvaro Domingues de Freitas     Matrícula: 201876007
 */
package Perfis;

import java.util.ArrayList;

/**
 *
 * @author tpalvaro
 */
public class ConjuntoUsuarios {
    private ArrayList<Usuario> listaUsuarios;
    
    
    public ConjuntoUsuarios(){
        this.listaUsuarios = new ArrayList();
    }
    
    public void addUsuario(Usuario u){
        listaUsuarios.add(u);
    }
    
    public Usuario getUsuario(int indice){
        return listaUsuarios.get(indice);
    }
    
    public ArrayList<Usuario> listaUsuarios(){
        return listaUsuarios;
    }
    
}
