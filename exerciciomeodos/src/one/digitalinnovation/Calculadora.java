package one.digitalinnovation;

public class Calculadora {

    public void soma(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("A soma de " + num1 + " mais " + num2 + " é (" + resultado + ")");
    }

    public void subtracao(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.println("A subtração de " + num1 + " menos " + num2 + " é (" + resultado + ")");
    }

    public void multiplicacao(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " vezes " + num2 + " é (" + resultado + ")");
    }

    public void divisao(double num1, double num2) {
        double resultado = num1 / num2;
        System.out.println("A subtração de " + num1 + " divisão " + num2 + " é (" + resultado + ")");
    }
}
