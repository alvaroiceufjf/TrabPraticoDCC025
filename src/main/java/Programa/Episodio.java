/*
Álvaro Domingues de Freitas     Matrícula: 201876007
 */
package Programa;

import java.util.ArrayList;

/**
 *
 * @author tpalvaro
 */
public class Episodio implements Nota{
    private String titulo;
    private String sinopse;
    private ArrayList<Review> reviews;
    
    
    public Episodio(String t, String s){
        this.titulo = t;
        this.sinopse = s;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public ArrayList<Review> listaReviews() {
        return reviews;
    } 
    
    @Override
    public float calculaNota(ArrayList<Review> r){
        float soma=0;
        for(int i=0;i<r.size()-1;i++){
            soma+=r.get(i).getNota();
        }
        return soma/r.size();
    }
}
