package one.digitainnovation;

public class Main {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<String>();

        lista.add("Item 1");
        lista.add("Item 2");
        lista.add("Item 3");
        lista.add("Item 4");
        lista.add("Item 5");
        lista.add("Item 6");
        lista.add("Item 7");

        System.out.println(lista);

        lista.remove(2);
        System.out.println(lista);

        lista.add(2, "Item 8");
        System.out.println(lista);
        System.out.println(lista.size());
        System.out.println(lista.get(2));
    }

}
