import com.google.gson.Gson;

import java.io.*;

public class Sisu {
    private Gson gson = new Gson();

    public Sisu(FileReader instituicoesJson, FileReader cursosJson, FileReader candidatosJson) {
        registrarInstituicoes(instituicoesJson);
        registrarCursos(cursosJson);
        registrarCandidatos(candidatosJson);
    }

    private void registrarInstituicoes(FileReader instituicoesJson) {
        Instituicao[] instituicoes = gson.fromJson(instituicoesJson, Instituicao[].class);
        Instituicao.setUp(instituicoes);
    }

    private void registrarCursos(FileReader cursosJson) {
        Curso[] cursos = gson.fromJson(cursosJson, Curso[].class);
        try {
            Curso.setUp(cursos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void registrarCandidatos(FileReader candidatosJson) {
        Candidato[] candidatos = gson.fromJson(candidatosJson, Candidato[].class);
        Candidato.setUp(candidatos);
    }

}
