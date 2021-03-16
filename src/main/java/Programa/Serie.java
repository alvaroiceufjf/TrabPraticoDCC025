/*
Álvaro Domingues de Freitas     Matrícula: 201876007
 */
package Programa;

import java.util.ArrayList;

/**
 *
 * @author tpalvaro
 */
public class Serie implements Nota{
    private String titulo;
    private String sinopse;
    private ArrayList<Temporada> temporadas;
    private ArrayList<Review> reviews;
    private int seguidores;
    private float nota;
    
    public Serie(String titulo,String sinopse){
        this.titulo=titulo;
        this.sinopse=sinopse;
        this.temporadas = new ArrayList();
        this.reviews = new ArrayList();
        this.seguidores=0;
        this.nota=0;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
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

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    
    @Override
    public float calculaNota(ArrayList<Review> r){
        float soma=0;
        for(int i=0;i<r.size()-1;i++){
            soma+=r.get(i).getNota();
        }
        return (soma/r.size())/2;
    }
}
