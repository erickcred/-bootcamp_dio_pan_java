package edu.erick.logica.estruturarepeticao.loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        /*
         * Faça um programa que peça uma nota, entre zero e dez.
         * Mostre uma mensagem caso o valor seja inválido e continue pedindo
         * a nota até que o usuário informa um valor válido
         */
        Scanner sc = new Scanner(System.in);       

        int nota;

        System.out.println("Informa uma nota entre 0 e 10: ");
        nota = sc.nextInt();
        
        while(nota < 0 || nota > 10) {
            System.out.println("Nota invalida! Digite novamente");
            nota = sc.nextInt();
        }
    }
}
