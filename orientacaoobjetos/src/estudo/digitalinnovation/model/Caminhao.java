package estudo.digitalinnovation.model;

public class Caminhao extends Veiculo {

    public Caminhao(String cor, String modelo, int capacidadeTanqueCombustivel) {
        super(cor, modelo, capacidadeTanqueCombustivel);
    }

    @Override
    public String toString() {
        return "Caminhão" + super.toString();
    }

}
