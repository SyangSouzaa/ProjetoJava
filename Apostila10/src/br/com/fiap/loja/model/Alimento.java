package br.com.fiap.loja.model;

public class Alimento extends Produto{

    private String validade;
    private boolean perecivel;

    public Alimento(int id, double preco, String nome, String validade,boolean perecivel) {
        super(id, preco, nome);
        this.perecivel = perecivel;
        this.validade = validade;
    }


    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public boolean isPerecivel() {
        return perecivel;
    }

    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }
}