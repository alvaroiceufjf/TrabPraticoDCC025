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
    private ArrayList <Perfil> perfis;
    
    
    public ConjuntoPerfis(){
        this.perfis = new ArrayList();
    }
    
    public void addPerfil(Perfil p){
        perfis.add(p);
    }
    
    public Perfil getPerfil(int indice){
        return perfis.get(indice);
    }
}
