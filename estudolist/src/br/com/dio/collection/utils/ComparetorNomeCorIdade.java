package br.com.dio.collection.utils;

import java.util.Comparator;

import br.com.dio.collection.model.Gato;

public class ComparetorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());

        if (nome != 0)
            return nome;
        if (cor != 0)
            return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}
