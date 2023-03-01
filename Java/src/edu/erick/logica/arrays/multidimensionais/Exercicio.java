package edu.erick.logica.arrays.multidimensionais;

import java.util.Random;

public class Exercicio {
    public static void main(String[] args) {
        /*
         * Gere e imprima auma matriz M 4X4 com valores aleatórios entre 0-9
         */

        Random random = new Random();
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+ i +"]["+ j +"] = " + matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
