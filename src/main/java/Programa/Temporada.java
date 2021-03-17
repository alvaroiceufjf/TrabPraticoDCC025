/*
Álvaro Domingues de Freitas     Matrícula: 201876007
 */
package Programa;

import java.util.ArrayList;

/**
 *
 * @author tpalvaro
 */
public class Temporada {
    private ArrayList<Episodio> listaEpisodios;
    
    public Temporada(){
        this.listaEpisodios = new ArrayList();
    }
    
    public void addEp(Episodio e){
        listaEpisodios.add(e);
    }
    
    public Episodio getSerie(int indice){
        return listaEpisodios.get(indice);
    }
    
    public ArrayList<Episodio> listaEpisodios(){
        return listaEpisodios;
    }
}
