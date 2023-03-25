package desafios.one.digitalinnovation;

public class Emprestimo {

    public void calcular(double valor, int parcelas) {
        double valorFinal = 0;

        if (parcelas == 2) {
            valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do emprestimopara " + parcelas + " parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {
            valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do emprestimopara " + parcelas + " parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }

    }

    public int getDuasParcelas() {
        return 2;
    }

    public int getTresParcelas() {
        return 3;
    }

    private double getTaxaDuasParcelas() {
        return 0.3;
    }

    private double getTaxaTresParcelas() {
        return 0.45;
    }

}
