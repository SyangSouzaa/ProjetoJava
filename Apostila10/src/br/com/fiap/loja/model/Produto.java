package br.com.fiap.loja.model;

public class Produto {

    private int id;
    private double preco;
    private String nome;

    public Produto(int id, double preco,String nome) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
    }

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    //Retorna o preço do produto com o desconto 10%, 15% ...
    public double calcularDesconto(int porcentagem){
        return preco - (preco*porcentagem/100);
    }

    //Retorna o preço com desconto de acordo com o cupom
    //FIAP15 -> 15% e FIAP30 -> 30%
    public double calcularDesconto(String cupom){
        int porcentagem = 0;
        if(cupom.equals("FIAP15")){
            porcentagem = 15;
        } else if (cupom.equals("FIAP30")){
            porcentagem = 30;
        }
        return calcularDesconto(porcentagem);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
