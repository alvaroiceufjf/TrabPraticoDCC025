/*
Álvaro Domingues de Freitas     Matrícula: 201876007
 */
package Programa;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author tpalvaro
 */
public class BancoDeSeries {

    private ConjuntoSeries listaSeries;
    private Gson gson;

    // converte objetos Java para JSON
    private String json;

    /**
     *
     * @param s - Lista de series
     */
    public BancoDeSeries(ConjuntoSeries s) {
        listaSeries = new ConjuntoSeries();
        listaSeries = s;
        gson = new Gson();

        json = gson.toJson(listaSeries);
    }

    /**
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public void escreveArquivo() throws IOException {
        try {
            FileWriter writer = new FileWriter("series.json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return tabela - retona as series que foram traduzidas para Java
     * @throws IOException - precaução para casos de erros de leitura de
     * arquivos
     */
    public ConjuntoSeries pegaArquivo() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("series.json"));

            listaSeries = gson.fromJson(br, ConjuntoSeries.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaSeries;
    }
}
