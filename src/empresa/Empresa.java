package empresa;

import faculdade.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    List<Funcionario> funcionarios;


    public Empresa(String nome){
        this.nome = nome;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }
}
