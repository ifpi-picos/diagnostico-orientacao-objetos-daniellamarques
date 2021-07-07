package classes;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(String nome){
        this.nome = nome;
        this.disciplinas = new ArrayList<Disciplina>();
    }


    public void adicionaDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }


    public void removeDisciplina(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }
}
