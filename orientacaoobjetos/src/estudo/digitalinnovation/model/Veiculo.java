package estudo.digitalinnovation.model;

public class Veiculo {

    private String cor;
    private String modelo;
    private int capacidadeTanqueCombustivel;

    public Veiculo(String cor, String modelo, int capacidadeTanqueCombustivel) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanqueCombustivel() {
        return capacidadeTanqueCombustivel;
    }

    public void setCapacidadeTanqueCombustivel(int capacidadeTanqueCombustivel) {
        this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
    }

    public double ValorEncherTanque(double valor) {
        return this.capacidadeTanqueCombustivel * valor;
    }

    @Override
    public String toString() {
        return "={ " + getModelo() + ", " + getCor() + " " + getCapacidadeTanqueCombustivel() + " }";
    }
}
