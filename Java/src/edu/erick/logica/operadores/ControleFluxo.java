package edu.erick.logica.operadores;

public class ControleFluxo {
    public static void main(String[] args) {
        int numeroMes = 7;

        System.out.println(retornaMes(numeroMes));
        System.out.println(ferias(numeroMes));
        retornaMes2(numeroMes);
    }

    private static String retornaMes(int valor) {
        String mes = "";
        if (valor == 1) {
            mes = "Janeiro";
        } else if (valor == 2) {
            mes = "Fevereiro";
        } else if (valor == 3) {
            mes = "Março";
        } else if (valor == 4) {
            mes = "Abril";
        } else if (valor == 5) {
            mes = "Maio";
        } else if (valor == 6) {
            mes = "Junho";
        } else if (valor == 7) {
            mes = "Julho";
        } else if (valor == 8) {
            mes = "Agosto";
        } else if (valor == 9) {
            mes = "Setembro";
        } else if (valor == 10) {
            mes = "Outubro";
        } else if (valor == 11) {
            mes = "Novembro";
        } else if (valor == 12) {
            mes = "Dzembro";
        }
        return mes;
    }

    private static String ferias(int valor) {
        if (valor == 1 || valor == 7 || valor == 12) {
            return  "Ferias"; 
        }
        return null;
    }

    private static void retornaMes2(int valor) {
        switch(valor) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês incalido!");
                break;
        }
    }
}


/*

Sobre controle de fluxo, é correto afirmar:
R: if não suporta expreções aritimeticas

Sobre controle de fluxo, é incorreto afirmar:
R: switch avalia expressões booleanas

São tipos de operadores relacionais:
R: Igualdade e menor

Sobre operadores lógicos, é correto afirmar que:
R: "!" corresponde a operação logica "inversão "

Avalie as expressões e marque a verdadeira.
R: True || Fase é true

Dadas as variáveis:
int i1 = 10; float f1 = 4.5f; char c1 = "x";
boolean b1 = true;
Qual operação é válida?
R: c1 > i1

Dado o seguinte código é correto afirmar:
if (!b2)
              System.out.println("Verdade");
else {
           System.out.println("Mentira");
           System.out.println("Mentira");
}
R: como If tem só uma linha as {} são opcionais

Avalie o código a seguir e marque a opção correta:
if ((10 + 15) < 20)
    System.out.println("Verdade");
else
    System.out.println("Mentira");
R: O texo mentira deve ser exibido

Sobre operadores relacionais, qual das alternativas a seguir é a INCORRETA?
R: = é operador de igualdade

Qual das expressões lógicas a seguir é válida?
R: (10 > 15) && true

*/




