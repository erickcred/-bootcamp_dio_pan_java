package edu.erick.logica.estruturarepeticao.loops;

import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        
        /*
         * Faça um programa que leia conjuntos de dois valores,
         * o primeiro representando o nome do aluno e o segundo represetanto a sua idade
         * (Para o programa inserindo o valor 0 no campo nome)
         */

        Scanner sc = new Scanner(System.in);

        String nome = "";
        int idade;

        while(true) {
            System.out.println("Informe um nome:");
            nome = sc.next();
            if (nome.equals("0")) break;
            
            System.out.println("Informa uma idade:");
            idade = sc.nextInt();
        }
        
        sc.close();

    }
}
