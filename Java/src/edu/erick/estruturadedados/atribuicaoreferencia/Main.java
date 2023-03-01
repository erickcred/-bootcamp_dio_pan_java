package edu.erick.estruturadedados.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = a;

        System.out.println("a: " + a + " b: " + b);
        a = 2;
        System.out.println("a: " + a + " b: " + b);

        MeuObj obja = new MeuObj(1);
        MeuObj objb = obja;

        System.out.println(obja);
        System.out.println(objb);

        obja.setNum(2);

        System.out.println(obja);
        System.out.println(objb);
    }
}
