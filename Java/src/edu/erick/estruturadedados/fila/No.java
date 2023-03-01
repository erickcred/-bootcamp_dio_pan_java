package edu.erick.estruturadedados.fila;

public class No<T> {
    
    private T object;
    private No<T> refNo;

    public No() {}
    public No(T obj) {
        this.refNo = null;
        this.object = obj;
    }

    public T getObject() {
        return this.object;
    }
    public void setObject(T obj) {
        this.object = obj;
    }

    public No<T> getRefNo() {
        return this.refNo;
    }
    public void setRefNo(No<T> no) {
        this.refNo = no;
    }

    @Override
    public String toString() {
        return "[No: {object=" + this.object + "}]";
    }

}
