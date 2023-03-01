package edu.erick.logica.arrays.unidimencionais;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
         * Crie um vetor de 6 números inteiros
         * e mostre-os na ordem inversa
         */

         int[] nums = { 1, 2, 3, 4, 5, 6 };

         for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
         }
         System.out.println();

         int count = nums.length - 1;
         while (count >= 0) {
            System.out.println(nums[count]);
            count--;
         }
    }
}
