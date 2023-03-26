package estudo2.digitalinnovation.model;

import estudo2.digitalinnovation.enums.ETipoFuncionario;

public class Gerente extends Funcionario {

    private double salario;

    public Gerente(String nome, ETipoFuncionario tipo, double salario) {
        super(nome, tipo);
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double valor) {
        this.salario += valor;
    }

    @Override
    public String toString() {
        return "Gerente={" + getNome() + ", " + this.getTipo() + String.format(", R$ %.2f", getSalario()) + " }";
    }
}
