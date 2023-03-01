package edu.erick.estruturadedados.listaencadeada;

public class No<T> {
    
    private T conteudo;
    private No proximoNo;

    public No() {
        this.proximoNo = null;
    }
    public No(T conteudo) {
        proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return this.conteudo;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return this.proximoNo;
    }
    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "[No: {"+ this.conteudo + "}]";
    }

    public String toStringEncadeado() {
        String str = "[No: {"+ this.conteudo + "} |->]";

        if (this.proximoNo != null) {
            str += "|->" + this.proximoNo.toString();
        } else {
            str += "null";
        }

        return str;
    }

}
