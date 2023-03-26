package estudo2.digitalinnovation.model;

import estudo2.digitalinnovation.enums.ETipoFuncionario;

public class Funcionario {

    private String nome;
    private ETipoFuncionario tipo;

    public Funcionario(String nome, ETipoFuncionario tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ETipoFuncionario getTipo() {
        return this.tipo;
    }

    public void setTipo(ETipoFuncionario tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "={ " + this.nome + ", " + this.tipo + " }";
    }
}
