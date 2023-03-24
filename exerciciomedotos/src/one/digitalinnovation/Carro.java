package one.digitalinnovation;

import java.util.*;

public class Carro {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            h += (n / i);
        }

        System.out.println((int) Math.ceil(((int) h) / n));

    }
}
