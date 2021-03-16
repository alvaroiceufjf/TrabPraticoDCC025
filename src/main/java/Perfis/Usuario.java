/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perfis;

import Programa.Serie;
import java.util.ArrayList;

/**
 *
 * @author tpalvaro
 */
public class Usuario extends Perfil{
    String nick;
    ArrayList<Serie> SeriesAssistidas;
    int numEps;
    int numHoras;
    String bio;
    

    public Usuario(String nome,String nick, String bio, String senha) {
        this.nome = nome;
        this.nick = nick;
        this.SeriesAssistidas = new ArrayList();
        this.numEps = 0;
        this.numHoras = 0;
        this.bio = bio;
        this.senha = senha;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
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
    
    public ArrayList<Serie> listaSerie(){
        return SeriesAssistidas;
    }
    
    public String qtdPaginas(){
        Integer total;
        total = numHoras*60;
        return total.toString();
    }
    
    public String qtdFilme(){
        Integer total;
        total = numHoras/12;
        return total.toString();
    }
    
    public String qtdCalorias(){
        Integer total;
        total = numHoras*243;
        return total.toString();
    }
    
    @Override
    public String getNome(){
        return nome;
    }
    
    @Override
    public String getSenha(){
        return senha;
    }

    @Override
    public <T> String qtdPerfis(ArrayList<T> t) {
        Integer contador;
        ArrayList<Usuario> u = (ArrayList<Usuario>) t;
        contador = u.size();
        return contador.toString();
    }
    
}
