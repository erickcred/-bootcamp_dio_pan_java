package estudo2.digitalinnovation.model;

import estudo2.digitalinnovation.enums.ETipoFuncionario;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, ETipoFuncionario tipo) {
        super(nome, tipo);
    }

    @Override
    public String toString() {
        return "Vendedor" + super.toString();
    }
}
