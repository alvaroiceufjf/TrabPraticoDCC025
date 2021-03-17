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
public class BancoDeADM {

    private ConjuntoADM listaADM;
    private Gson gson;

    // converte objetos Java para JSON
    private String json;

    /**
     *
     * @param a: conjunto de Administradores do Programa
     */
    public BancoDeADM(ConjuntoADM a) {
        listaADM = new ConjuntoADM();
        listaADM = a;
        gson = new Gson();

        json = gson.toJson(listaADM);
    }

    /**
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public void escreveArquivo() throws IOException {
        try {
            FileWriter writer = new FileWriter("ADM.json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return tabela - retorna os perfis de Admins que foram traduzidos para Java
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public ConjuntoADM pegaArquivo() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("ADM.json"));

            listaADM = gson.fromJson(br, ConjuntoADM.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaADM;
    }
}
