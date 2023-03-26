package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        // Data uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//        List notas = new ArrayList(); // Anter do java 5
//        List<Double> notas new ArrayList<>(); // Generics(jdk 5) - Diamont Operator(jdk 7)
//        ArrayList<Double> notas = new ArrayList<>(); // Não recomendado utilizar dessa forma
//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

//        List<Double> notas1 = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//        notas1.add(10.0); // Nesse caso não posso adicionar nem remover itens utilizando essa forma
//        System.out.println(notas1);


        System.out.println("Crie uma lista e adicione as 7 notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5d));
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas.toString());
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        System.out.println("Substitua a nota 5.0 pela 6.0: " );
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas.toString());
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(3));
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        System.out.println("Exiba as notas na ordem em que foram informados: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}
