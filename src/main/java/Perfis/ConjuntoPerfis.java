/*
Álvaro Domingues de Freitas     Matrícula: 201876007
 */
package Perfis;

import java.util.ArrayList;

/**
 *
 * @author tpalvaro
 */
public class ConjuntoPerfis {
    private ArrayList<Perfil> listaPerfis;
    
    
    public ConjuntoPerfis(){
        this.listaPerfis = new ArrayList();
    }
    
    public void addPerfil(Perfil p){
        listaPerfis.add(p);
    }
    
    public Perfil getPerfil(int indice){
        return listaPerfis.get(indice);
    }
    
    public ArrayList<Perfil> listaPerfis(){
        return listaPerfis;
    }
    
}
