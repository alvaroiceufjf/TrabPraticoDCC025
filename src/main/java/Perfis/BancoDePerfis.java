/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perfis;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author tpalvaro
 */
public class BancoDePerfis {

    private ConjuntoPerfis listaPerfis;
    private Gson gson;

    // converte objetos Java para JSON
    private String json;

    /**
     *
     * @param p - Lista de perfis
     */
    public BancoDePerfis(ConjuntoPerfis p) {
        listaPerfis = new ConjuntoPerfis();
        listaPerfis = p;
        gson = new Gson();

        json = gson.toJson(listaPerfis);
    }

    /**
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public void escreveArquivo() throws IOException {
        try {
            FileWriter writer = new FileWriter("perfis.json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return tabela - retona os perfis que foram traduzidos para Java
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public ConjuntoPerfis pegaArquivo() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("perfis.json"));

            listaPerfis = gson.fromJson(br, ConjuntoPerfis.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaPerfis;
    }
}
