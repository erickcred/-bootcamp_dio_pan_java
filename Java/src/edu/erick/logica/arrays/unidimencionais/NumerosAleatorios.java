package edu.erick.logica.arrays.unidimencionais;

import java.util.Random;

public class NumerosAleatorios {
    
    public static void main(String[] args) {
        /*
         * Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 108) 
         * armazene-os num vetor.
         * Ao final mostre os números e seus socessores.
         */

        Random random = new Random();

        int[] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            int numero = random.nextInt(108);
            vetor[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for (int numero : vetor) {
            System.out.print(numero + "; ");
        }

        System.out.println();
        System.out.println("Sucessores dos números aleatórios: ");
        for (int numero : vetor) {
            System.out.print(numero + 1 + "; ");
        }

    }
}