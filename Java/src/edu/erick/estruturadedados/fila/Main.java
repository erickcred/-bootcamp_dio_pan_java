package edu.erick.estruturadedados.fila;

public class Main {
    
    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<String>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiero");
        minhaFila.enqueue("quarto");
        System.out.println(minhaFila);
        System.out.println();
        
        System.out.println("Item removido: " + minhaFila.dequeue());
        System.out.println(minhaFila);
        System.out.println("Primeiro da fila: " + minhaFila.first());

        // System.out.println();
        // minhaFila.enqueue(new No("ultimo"));

        // System.out.println("Item removido: " + minhaFila.dequeue());
        // System.out.println(minhaFila);
        // System.out.println("Primeiro da fila: " + minhaFila.first());
        
    }
}
