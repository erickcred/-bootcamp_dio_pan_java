package estudo2.digitalinnovation.model;

import estudo2.digitalinnovation.enums.ETipoFuncionario;

public class Zelador extends Funcionario {

    public Zelador(String nome, ETipoFuncionario tipo) {
        super(nome, tipo);
    }

    @Override
    public String toString() {
        return "Zelador" + super.toString();
    }
}
