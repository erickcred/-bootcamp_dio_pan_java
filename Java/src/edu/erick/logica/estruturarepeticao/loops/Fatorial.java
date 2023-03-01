package edu.erick.logica.estruturarepeticao.loops;

import java.util.Scanner;

public class Fatorial {
    /*
     * Faça um programa que calcule o fatorial de um número inteiro
     * fornecido pelo usuário
     * Exp.: 5 != 120; (5 * 4 * 3 * 2 * 1)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fatorial = sc.nextInt();

        int multiplicacao = 1;

        for (int i = fatorial; i > 1; i--) {
            multiplicacao = multiplicacao * i;
        }
        System.out.print(fatorial + "! = " + multiplicacao);
    }
}





