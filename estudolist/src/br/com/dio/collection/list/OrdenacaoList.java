package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.dio.collection.model.Gato;
import br.com.dio.collection.utils.ComparetorIdade;
import br.com.dio.collection.utils.ComparetorCor;
import br.com.dio.collection.utils.ComparetorNomeCorIdade;

public class OrdenacaoList {
    /*
     * Dados as seguintes informações sobre meus gatos, crie uma lista e ordene
     * estalista exibindo:
     * (nome - idade - cor)
     * 
     * Gato1 = nome: Jan, idade: 18, cor: preto
     * Gato2 = nome: Simba, idade: 6, cor: tigrado
     * Gato3 = nomw: Jan, idade: 12, cor: amarelo
     */
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>();
        gatos.add(new Gato("Jon", 18, "preto"));
        gatos.add(new Gato("Simba", 6, "trigrado"));
        gatos.add(new Gato("Jon", 12, "amarelo"));

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(gatos);

        System.out.println("--\tOrdem Aleatória\t---");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("--\tOrdem Idade\t---");
        // Collections.sort(gatos, new ComparetorIdade());
        gatos.sort(new ComparetorIdade());
        System.out.println(gatos);

        System.out.println("--\tOrdem Cor\t---");
        // Collections.sort(gatos, new ComparetorCor());
        gatos.sort(new ComparetorCor());
        System.out.println(gatos);

        System.out.println("--\tOrdem (Nome/Cor/Idade)\t---");
        // Collections.sort(gatos, new ComparetorNomeCorIdade());
        gatos.sort(new ComparetorNomeCorIdade());
        System.out.println(gatos);

    }

}
