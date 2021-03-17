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
    private Integer duracao;
    private ArrayList<Review> reviews;
    private boolean assistido;
    
    
    public Episodio(String t, String s,Integer d){
        this.titulo = t;
        this.sinopse = s;
        this.duracao = d;
        this.reviews = new ArrayList();
        this.assistido = false;
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

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public boolean isAssistido() {
        return assistido;
    }

    public void setAssistido(boolean assistido) {
        this.assistido = assistido;
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
