/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author tpalvaro
 */
public class Review {
    private String autor;
    private Integer nota;

    public Review(String autor, Integer nota) {
        this.autor = autor;
        this.nota = nota;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
    
    
    
    
}
