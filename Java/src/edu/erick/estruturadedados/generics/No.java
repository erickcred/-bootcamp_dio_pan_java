package edu.erick.estruturadedados.generics;

public class No<T> {
    
    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo) {
        this.proximoNo =  null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return this.conteudo;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return this.proximoNo;
    }
    public void setProximoNo(No<T> no) {
        this.proximoNo = no;
    }

    @Override
    public String toString() {
        return "conteudo: " + conteudo;
    }

    
}
