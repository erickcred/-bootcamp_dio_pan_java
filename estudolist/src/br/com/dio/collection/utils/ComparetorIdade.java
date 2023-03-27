package br.com.dio.collection.utils;

import java.util.Comparator;

import br.com.dio.collection.model.Gato;

public class ComparetorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}
