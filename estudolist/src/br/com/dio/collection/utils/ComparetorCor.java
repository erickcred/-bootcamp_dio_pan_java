package br.com.dio.collection.utils;

import java.util.Comparator;

import br.com.dio.collection.model.Gato;

public class ComparetorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}
