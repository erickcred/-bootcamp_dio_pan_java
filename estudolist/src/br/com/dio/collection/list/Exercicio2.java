package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* Segundo
 * Faça um programs que faça 5 perguntas para uma pessoa sonre um crime. As perguntas são:
 * 1. Telefonou para a vítima? 
 * 2. Esteve no local do crime? 
 * 3. Mora perto da vítima?
 * 4. Devia para a vítima? 
 * 5. Já trabalou com a vítima? 
 *
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada como suspeita
 * entre 3 e 4 como Cúmplice e 5 como Assassina. Caso contrário, ela será classificada como Inocente
 */

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Boolean> respostas = new ArrayList<>();

        System.out.println("Responda com (S - sim / N - não)");
        try {
            System.out.print("1. Telefonou para a vítima? ");
            String res = leitor.next().toLowerCase();
            respostas.add(addResposta(res));

            System.out.print("Esteve no local do crime? ");
            res = leitor.next().toLowerCase();
            respostas.add(addResposta(res));

            System.out.print("Mora perto da vítima? ");
            res = leitor.next().toLowerCase();
            respostas.add(addResposta(res));

            System.out.print("Devia para a vítima? ");
            res = leitor.next().toLowerCase();
            respostas.add(addResposta(res));

            System.out.print("Já trabalou com a vítima? ");
            res = leitor.next().toLowerCase();
            respostas.add(addResposta(res));

            Iterator<Boolean> iterator = respostas.iterator();
            int count = 0;
            while (iterator.hasNext()) {
                Boolean next = iterator.next();
                if (next) {
                    count++;
                }
            }
            switch (count) {
                case 0:
                    System.out.println("INOCENTE");
                    break;
                case 2:
                    System.out.println("SUSPEITA");
                    break;
                case 3, 4:
                    System.out.println("CÚMPLICE");
                    break;
                case 5:
                    System.out.println("ASSASINO");
                    break;
                default:
                    System.out.println("INOCENTE");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static boolean addResposta(String dado) throws Exception {
        if (dado.equalsIgnoreCase("s")) {
            return true;
        } else if (dado.equalsIgnoreCase("n")) {
            return false;
        }
        throw new Exception("O dado informado não é valido");
    }
}
