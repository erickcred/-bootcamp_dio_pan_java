package edu.erick.estruturadedados.atribuicaoreferencia;

public class MeuObj {
    
    Integer num;

    public MeuObj(Integer num) {
        this.num = num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "obj: " + num;
    }
}
