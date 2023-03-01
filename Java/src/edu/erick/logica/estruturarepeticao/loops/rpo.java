package edu.erick.logica.estruturarepeticao.loops;

public class rpo {
    public static void main(String[] args) {
        int i, num = 5;
        for (i = 0; i < 3; i++) {
            num += i;
            System.out.print(i);
        }


    }
}


/*
int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);

Dado o código acima, o que será impresso no console?
R: 14

Como podemos definir “Estruturas de repetição”:
R: Uma estrutura que permite a execução de uma sequencia repetidamente, caso 
determinadas condições sejam satisfeitas

String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
System.out.print(nomes.length);
Dado o código acima, o que será impresso no console?
R: 5


int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
        } while (count <= 3);

Dado o código acima, o que será impresso no console?
R: Loop infinito

As estruturas de repetição podem ser classificadas em:
R: Repetição com teste no inicio, repetição com teste no fim e contada
*/