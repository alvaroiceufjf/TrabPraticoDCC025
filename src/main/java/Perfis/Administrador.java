/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perfis;

import java.util.ArrayList;



/**
 *
 * @author tpalvaro
 */
public class Administrador extends Perfil{
        

    public Administrador(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
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
        ArrayList<Administrador> u = (ArrayList<Administrador>) t;
        contador = u.size();
        return contador.toString();
    }
}
