package estudo2.digitalinnovation;

import java.util.*;

import estudo2.digitalinnovation.enums.ETipoFuncionario;
import estudo2.digitalinnovation.model.*;

public class Main {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Gerente("Jessica", ETipoFuncionario.GERENTE, 1000));
        funcionarios.add(new Vendedor("Maria", ETipoFuncionario.VENDEDOR));
        funcionarios.add(new Zelador("Pedro", ETipoFuncionario.ZELADOR));

        System.out.println("Funcionários: ");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
