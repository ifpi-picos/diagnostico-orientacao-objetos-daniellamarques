package empresa;

import java.util.List;

public class PessoaJuridica extends Funcionario{
    private String cnpj;

    public PessoaJuridica(String nome, float salario, List<String> beneficios) {

        super(nome, salario,beneficios);
    }
}
