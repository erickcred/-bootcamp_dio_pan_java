package estudo.digitalinnovation.model;

public class Carro extends Veiculo {

    public Carro(String cor, String modelo, int capacidadeTanqueCombustivel) {
        super(cor, modelo, capacidadeTanqueCombustivel);
    }

    @Override
    public String toString() {
        return "Carro" + super.toString();
    }

}
