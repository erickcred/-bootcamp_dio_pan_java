package estudo.digitalinnovation.model;

public class Moto extends Veiculo {

    public Moto(String cor, String modelo, int capacidadeTanqueCombustivel) {
        super(cor, modelo, capacidadeTanqueCombustivel);
    }

    @Override
    public String toString() {
        return "Moto" + super.toString();
    }

}
