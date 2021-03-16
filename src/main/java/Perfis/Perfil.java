/*
Álvaro Domingues de Freitas     Matrícula: 201876007
 */
package Perfis;

import java.util.ArrayList;


/**
 *
 * @author tpalvaro
 */

public abstract class Perfil {
    protected String nome;
    protected String senha;
    
    public abstract <T> String qtdPerfis(ArrayList<T> t);
    
    public abstract String getNome();
    
    public abstract String getSenha();
}
