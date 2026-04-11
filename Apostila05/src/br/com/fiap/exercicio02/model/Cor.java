package br.com.fiap.exercicio02.model;

public class Cor {

    private String nome;
    private int r, g, b;

    public void alterarCor(int r, int g, int b, String nome) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.nome = nome;
        return ;
    }

    //Getter e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getG() {
        return g;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }


}