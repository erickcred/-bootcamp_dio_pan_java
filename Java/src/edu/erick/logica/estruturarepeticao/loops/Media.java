package edu.erick.logica.estruturarepeticao.loops;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        /*
         * Faça um programa que leia 5 números 
         * e informe o maior número
         * e a média desses números.
         */

        Scanner sc = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma = 0;

        int contador = 0;
        do {
            System.out.println("Número: ");
            numero = sc.nextInt();
            soma += numero;

            if (numero > maior) maior = numero;

            contador++;
        } while(contador < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma / 5));

        sc.close();
    }
}
