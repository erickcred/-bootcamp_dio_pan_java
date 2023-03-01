package edu.erick.logica.estruturarepeticao.loops;

import java.util.Scanner;

public class Tabuada {
    /*
     * Desenvolva um gerador de tabuada, 
     * capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
     * O usuário deve informar qual o número ele deseja ver a tabuada.
     * A sáida deve ser conforme o exemplo abaixo:
     * 
     * Tabuada do 5:
     * 5 X 1 = 5
     * .....
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe qual Tabuada deseja ver: ");
        int tabuada = sc.nextInt();

        int contador = 1;
        System.out.println("Tabuada do: " + tabuada);
        while(contador <= 10) {
            int multplicacao = tabuada * contador;
            System.out.println(tabuada + " X " + contador + " = " + multplicacao);
            contador++;
        }
        sc.close();
    }
}
