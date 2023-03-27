package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* Primeiro
 * Faça um programa que receba a temperatua média dos 6 primeiros meses do ano e
 * armazene-as em uma lista.
 * Após isto, calcule a média semestral das temperaturas e mostr todas as 
 * temperaturas acima desta média, e em que mês elas ocorreram 
 * (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
 */



public class ExercicioTemperatura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        String[] messes = new String[] {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"
        };

        for (int i = 0; i < messes.length; i++) {
            System.out.print("Informe a temperatura de " + messes[i] + ": ");
            temperaturas.add(leitor.nextDouble());
        }

        System.out.println("\nTodas as temperaturas: ");
        temperaturas.forEach(temp -> System.out.println(temp));

        System.out.println("\nCalculando media: ");
        Double media = temperaturas
                .stream()
                .reduce(0d, (total, element) -> total + element) / messes.length;
        System.out.println(media);

        System.out.println("\nMeses com as temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();
        while (iterator.hasNext()) {
            Double temperatura = iterator.next();

            if (temperatura >= media) {
                System.out.println(messes[temperaturas.indexOf(temperatura)] + " - " + temperatura + "oC");
            }
        }

    }

}
