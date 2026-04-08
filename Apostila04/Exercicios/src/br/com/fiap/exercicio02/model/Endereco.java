package br.com.fiap.exercicio02.model;

public class Endereco {
    public String logradouro;
    public short numero;
    public String complemento;
    public String cep;

    public String retornarDados(){
        return "Logradouro: " + logradouro + "\n Número: " + numero + "\n Complemento: " + complemento + "\n CEP: " + cep;
    }
}