package one.digitalinnovation;

/*
    Criar uma aplicação que resolva as seguintes situações:
    Calcule as 4 oprações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.

    A partir da hora do dia, informa a mensagem adequada: Bom dia, Boa tarde e Boa noite.
    
    Calcule o vlor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam. Defina
    arbitrariamante as faixas que influienciam nos valores
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercicio Calculadora");
        Calculadora calc = new Calculadora();
        calc.soma(10, 10);
        calc.subtracao(100, 50);
        calc.multiplicacao(2, 10);
        calc.divisao(100, 4);

        System.out.println();

        System.out.println("Exercicio Mensagem");
        Mensagem mensagem = new Mensagem();
        mensagem.obgerMensagem(8);
        mensagem.obgerMensagem(13);
        mensagem.obgerMensagem(0);

        System.out.println();

        System.out.println("Exercicio Emprestimo");
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, 4);

        System.out.println();

        System.out.println("Exercicio Quadrilatero notaveis");
        QuadrilaterosNotaveis qa = new QuadrilaterosNotaveis();
        System.out.println("Área do quadrado: " + qa.area(3));
        System.out.println("Área do retângulo: " + qa.area(5d, 5d));
        System.out.println("Área do trapézio: " + qa.area(7, 8, 9));
        System.out.println("Área do losango: " + qa.area(5f, 5f));

    }
}
