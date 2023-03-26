package estudo.digitalinnovation.model;

public class Carro {

    private String cor;
    private String modelo;
    private int capacidadeTanqueCombustivel;

    public Carro(String cor, String modelo, int capacidadeTanqueCombustivel) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
    }

    public Carro(String cor, String modelo, int capacidadeTanqueCombustivel, double valorCombudtivel) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
        this.ValorEncherTanque(valorCombudtivel);
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadeTanqueCombustivel() {
        return this.capacidadeTanqueCombustivel;
    }

    public void setCapacidadeTanqueCombustivel(int capacidadeTanqueCombustivel) {
        this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
    }

    public double ValorEncherTanque(double valor) {
        return this.capacidadeTanqueCombustivel * valor;
    }

    @Override
    public String toString() {
        return "Carro={ " + this.modelo + " " + this.cor + " " + this.capacidadeTanqueCombustivel + " litros }";
    }

}
