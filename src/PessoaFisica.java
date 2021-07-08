package projeto;

import java.util.List;

public class PessoaFisica extends Funcionario{
    private String cpf;

    public PessoaFisica(String nome, float salario, List<String>beneficios) {

        super(nome, salario,beneficios);
    }
}
