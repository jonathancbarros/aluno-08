import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class Sisu {

    private ArrayList<Instituicao> instituicoes = new ArrayList<Instituicao>();
    private ArrayList<Curso> cursos = new ArrayList<Curso>();
    private ArrayList<Candidato> candidatos = new ArrayList<Candidato>();

    public Sisu() {}

    private JSONArray turnJsonIntoArray(FileReader file) {

        JSONParser parser = new JSONParser();
        Object json = new Object();

        try {
            json = parser.parse(file);
            if (json instanceof JSONObject) {
                throw new Exception("O Json passado está vazio");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(json instanceof JSONArray) {
            return (JSONArray) json;
        } else {
            throw new ClassCastException("Json inválido, não pôde ser convertido em array.");
        }
    }

    public void registrarInstituicoes(FileReader instituicoesJson) throws FileNotFoundException {
        Gson gson = new Gson();
        JSONArray array = turnJsonIntoArray(instituicoesJson);

        for (Object anArray : array) {
            Instituicao instituicao = gson.fromJson(gson.toJson(anArray), Instituicao.class);
            this.instituicoes.add(instituicao);
        }
    }

    public void registrarCursos(FileReader cursosJson) throws FileNotFoundException {
        Gson gson = new Gson();
        JSONArray array = turnJsonIntoArray(cursosJson);

        for (Object anArray : array) {
            Curso curso = gson.fromJson(gson.toJson(anArray), Curso.class);
            curso.calcularVagasReservadas();
            cursos.add(curso);
        }
    }

    public void registrarCandidatos(FileReader candidatosJson) throws FileNotFoundException {
        Gson gson = new Gson();
        JSONArray array = turnJsonIntoArray(candidatosJson);

        for (Object anArray : array) {
            Candidato candidato = gson.fromJson(gson.toJson(anArray), Candidato.class);
            candidatos.add(candidato);
        }
    }

    public void realizarApuracao() {
        for (Curso curso : cursos) {
            curso.setListaDeAprovados(candidatos);
        }
    }

    public void printListDeAprovados() {
        for (Curso curso : cursos) {
            System.out.println(curso.imprimirListaDeAprovados());
        }
    }

}
