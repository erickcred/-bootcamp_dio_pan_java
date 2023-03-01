package edu.erick.logica.estruturarepeticao;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        /*
         * Faça um programa que peça N números inteiros,
         * calcule e mostre a quantidade de numeros pares e
         * a quantidade de números impares.
         */

        Scanner sc = new Scanner(System.in);
        int quantidadeNumeros;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = sc.nextInt();
        int pares = 0;
        int impares = 0;

        int contador = 0;
        do {
            System.out.println("Número: ");
            if (sc.nextInt() % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            contador++;
        } while (contador < quantidadeNumeros);

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);
    }
}
