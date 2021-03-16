/*
Álvaro Domingues de Freitas     Matrícula: 201876007
 */
package Perfis;

import java.util.ArrayList;

/**
 *
 * @author tpalvaro
 */
public class ConjuntoADM {
    private ArrayList<Administrador> listaADM;
    
    
    public ConjuntoADM(){
        this.listaADM = new ArrayList();
    }
    
    public void addADM(Administrador a){
        listaADM.add(a);
    }
    
    public Administrador getADM(int indice){
        return listaADM.get(indice);
    }
    
    public ArrayList<Administrador> listaADM(){
        return listaADM;
    }
    
}
