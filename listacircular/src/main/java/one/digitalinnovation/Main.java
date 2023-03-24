package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        ListaCircular<String> lista = new ListaCircular<String>();

        lista.add("item 1");
        lista.add("item 2");

        System.out.println(lista);

        // lista.remove(1);

        // System.out.println(lista);

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));

    }
}
