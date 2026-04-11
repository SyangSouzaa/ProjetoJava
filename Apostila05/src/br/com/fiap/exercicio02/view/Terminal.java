package br.com.fiap.exercicio02.view;

import br.com.fiap.exercicio02.model.Carro;
import br.com.fiap.exercicio02.model.Cor;

public class Terminal {

    public static void main(String[] args) {
        //Criar objeto Cor
        Cor branco = new Cor();
        //Definir os valores dos atributos da cor
        branco.alterarCor(255, 255, 255, "Branco");


        //Criar o objeto Carro
        Carro corsa = new Carro();

        //Definir os valores dos atributos do carro
        corsa.setNome("Prisma");
        corsa.setQuantidadeLugares(5);
        corsa.setCor(branco);
        corsa.setMotor(1);
        corsa.setComprimento(4.5);
        corsa.setPlaca("ABC-1234");
        corsa.setAnoFabricacao(2005);
        corsa.setQuantidadePortas(4);

        //Exibit os dados do carro
        System.out.println("Carro: " + corsa.getNome());
        System.out.println("Ano: " + corsa.getAnoFabricacao());
        System.out.println("Placa: " + corsa.getPlaca());
        System.out.println("Comprimento: " + corsa.getComprimento() + ", Portas " + corsa.getQuantidadePortas());
        System.out.println("Motor: " + corsa.getMotor() + ", Lugares: " + corsa.getQuantidadeLugares());
        System.out.println("Cor: " + corsa.getCor().getNome());
    }
}