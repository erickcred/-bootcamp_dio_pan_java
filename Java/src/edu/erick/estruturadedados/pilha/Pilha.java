package edu.erick.estruturadedados.pilha;

public class Pilha {
    
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No no) {
        No refAuxiliar = this.refNoEntradaPilha;
        this.refNoEntradaPilha = no;
        this.refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = this.refNoEntradaPilha;
            this.refNoEntradaPilha = this.refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top() {
        return this.refNoEntradaPilha;
    }

    public boolean isEmpty() {
        if (this.refNoEntradaPilha == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String stringRetorno = "-----------------\n";
        stringRetorno += "Plilha\n";
        stringRetorno += "-----------------\n";

        No noAuxiliar = this.refNoEntradaPilha;

        while(true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "=================\n";

        return stringRetorno;
    }

}
