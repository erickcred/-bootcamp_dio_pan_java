package one.digitalinnovation;

/*
 * Criar uma aplicação que calcule a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio;
    Obs: Utilizar sobre carga
 */

public class QuadrilaterosNotaveis {

    public double area(double lado) {
        return (lado * lado);
    }

    public double area(double lado1, double lado2) {
        return (lado1 * lado2);
    }

    public double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public double area(float diagonal1, float diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }

}
