package projeto;

import java.util.List;

    public class Funcionario {
        private String nome;
        private float salario;
        private List<String> beneficios;

    public Funcionario (String nome, float salario, List<String>beneficios) {
        this.nome = nome;
        this.salario = salario;
        this.beneficios = beneficios;

    }

    public List<String> getBeneficios()  {
        return this.beneficios;
    }
    public float getSalarioLiquido(){
        return this.salario;
    }

}
