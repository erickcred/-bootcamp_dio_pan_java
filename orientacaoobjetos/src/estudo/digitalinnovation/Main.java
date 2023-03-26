package estudo.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

import estudo.digitalinnovation.model.Carro;
import estudo.digitalinnovation.model.Livro;

public class Main {

    public static void main(String[] args) {
        // Livro javaBasico = new Livro("Programação", "Java Basíco");
        // System.out.println(javaBasico.getTema());

        List<Carro> carros = new ArrayList<Carro>();
        carros.add(new Carro("Amarelo", "Ford Ka", 55));
        carros.add(new Carro("Vermelho", "Ferrari", 110));

        for (Carro carro : carros) {
            System.out.println(
                    carro + "\nencher tanque: R$ " + String.format("%.2f", carro.ValorEncherTanque(5.50)));
        }
    }

}
