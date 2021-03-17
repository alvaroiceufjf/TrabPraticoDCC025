/*
Álvaro Domingues de Freitas     Matrícula: 201876007
 */
package Perfis;


import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author tpalvaro
 */
public class BancoDeUsuarios {

    private ConjuntoUsuarios listaUsuarios;
    private Gson gson;

    // converte objetos Java para JSON
    private String json;

    /**
     *
     * @param p - Lista de perfis
     */
    public BancoDeUsuarios(ConjuntoUsuarios p) {
        listaUsuarios = new ConjuntoUsuarios();
        listaUsuarios = p;
        gson = new Gson();

        json = gson.toJson(listaUsuarios);
    }

    /**
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public void escreveArquivo() throws IOException {
        try {
            FileWriter writer = new FileWriter("usuarios.json");
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
    public ConjuntoUsuarios pegaArquivo() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("usuarios.json"));

            listaUsuarios = gson.fromJson(br, ConjuntoUsuarios.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }
}
