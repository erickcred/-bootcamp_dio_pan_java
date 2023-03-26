package estudo.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

import estudo.digitalinnovation.model.*;
import estudo.digitalinnovation.model.Livro;

public class Main {

    public static void main(String[] args) {
        // Livro javaBasico = new Livro("Programação", "Java Basíco");
        // System.out.println(javaBasico.getTema());

        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Carro("Amarelo", "Ford Ka", 55));
        veiculos.add(new Caminhao("Vermelho", "Mercedes Bens 1030", 110));
        veiculos.add(new Moto("Preto", "Honda CB160", 20));

        for (Veiculo veiculo : veiculos) {
            System.out.println(
                    veiculo + "\nencher tanque: " + String.format("R$ %.2f", veiculo.ValorEncherTanque(5.50)));
        }
    }

}
