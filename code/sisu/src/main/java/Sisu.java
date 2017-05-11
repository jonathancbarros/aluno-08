import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Sisu {

    //private ArrayList<Instituicao> instituicoes;
    private ArrayList<Curso> cursos;
    private ArrayList<Candidato> candidatos;

    private Gson gson = new Gson();

    public Sisu(FileReader instituicoesJson) {
        registrarInstituicoes(instituicoesJson);
    }

    public Sisu(FileReader instituicoesJson, FileReader cursosJson, FileReader candidatosJson) {
        registrarInstituicoes(instituicoesJson);
        registrarCursos(cursosJson);
        registrarCandidatos(candidatosJson);
    }

    private void registrarInstituicoes(FileReader instituicoesJson) {
        Instituicao[] instituicoes = gson.fromJson(instituicoesJson, Instituicao[].class);
        Instituicao.setUp(instituicoes);
    }

    public void registrarCursos(FileReader cursosJson) {
        Curso[] cursos = gson.fromJson(cursosJson, Curso[].class);
        this.cursos = new ArrayList<Curso>(Arrays.asList(cursos));

        for (Curso curso : this.cursos) {
            curso.init();
        }
    }

    public void registrarCandidatos(FileReader candidatosJson) {
        Candidato[] candidatos = gson.fromJson(candidatosJson, Candidato[].class);
        this.candidatos = new ArrayList<Candidato>(Arrays.asList(candidatos));
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
