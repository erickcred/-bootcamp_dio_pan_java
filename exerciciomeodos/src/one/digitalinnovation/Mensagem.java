package one.digitalinnovation;

public class Mensagem {

    public void obgerMensagem(int valor) {

        switch (valor) {
            case 5, 6, 7, 8, 9, 10, 11, 12:
                mensagemBomdia();
                break;
            case 13, 14, 15, 16, 17:
                mensagemBoaTarde();
                break;
            case 18, 19, 20, 21, 22, 23, 24, 0, 1, 2, 3:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora informada não é valida");
                break;
        }
    }

    private void mensagemBomdia() {
        System.out.println("Bom dia");
    }

    private void mensagemBoaTarde() {
        System.out.println("Boa tarde");
    }

    private void mensagemBoaNoite() {
        System.out.println("Boa noite");
    }
}
