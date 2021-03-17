/*
Álvaro Domingues de Freitas     Matrícula: 201876007
 */
package Programa;

import java.util.ArrayList;

/**
 *
 * @author tpalvaro
 */
public class ConjuntoSeries {
    private ArrayList<Serie> listaSeries;
    
    public ConjuntoSeries(){
        this.listaSeries = new ArrayList();
    }
    
    public void addSerie(Serie s){
        listaSeries.add(s);
    }
    
    public Serie getSerie(int indice){
        return listaSeries.get(indice);
    }
    
    public ArrayList<Serie> listaSeries(){
        return listaSeries;
    }
}
