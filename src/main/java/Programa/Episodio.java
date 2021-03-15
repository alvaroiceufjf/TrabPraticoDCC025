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
    private ArrayList<Integer> notas;
    private float nota;
    
    public Episodio(String t, String s){
        this.titulo = t;
        this.sinopse = s;
    }
    
    @Override
    public float calculaNota(ArrayList<Integer> notas){
        float soma=0;
        for(int i=0;i<notas.size()-1;i++){
            soma+=notas.get(i);
        }
        return soma/notas.size();
    }
}
