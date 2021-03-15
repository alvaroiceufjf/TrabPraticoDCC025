/*
Álvaro Domingues de Freitas     Matrícula: 201876007
 */
package Perfis;

import Programa.Serie;
import java.util.ArrayList;

/**
 *
 * @author tpalvaro
 */
public class Perfil {
    private String nome;
    private String nick;
    private ArrayList<Serie> SeriesAssistidas;
    private int numEps;
    private int numHoras;
    private String bio;
    private final String senha;
    
    public Perfil(String nome,String nick,String bio, String senha){
        this.nome=nome;
        this.nick=nick;
        this.bio=bio;
        this.SeriesAssistidas= new ArrayList();
        this.numEps=0;
        this.numHoras=0;
        this.senha = senha;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public ArrayList<Serie> getSeriesAssistidas() {
        return SeriesAssistidas;
    }

    public void setSeriesAssistidas(ArrayList<Serie> SeriesAssistidas) {
        this.SeriesAssistidas = SeriesAssistidas;
    }

    public int getNumEps() {
        return numEps;
    }

    public void setNumEps(int numEps) {
        this.numEps = numEps;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getSenha() {
        return senha;
    }
    
    
}
