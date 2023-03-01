package edu.erick.estruturadedados.listaencadeada;

public class Main {
    
    public static void main(String[] args) {
        ListaEncadeada<String> minhaLista = new ListaEncadeada<String>();

        minhaLista.add("teste1");
        minhaLista.add("teste2");
        minhaLista.add("teste3");
        minhaLista.add("teste4");

        System.out.println("tamanho da lista: " + minhaLista.size());
        minhaLista.get(0);
        System.out.println(minhaLista);
        minhaLista.remove(3);
        
        System.out.println("tamanho da lista: " + minhaLista.size());
        System.out.println(minhaLista);
    }
}
