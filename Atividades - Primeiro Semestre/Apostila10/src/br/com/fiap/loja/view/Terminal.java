package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Eletronico;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        //Criar um objeto do tipo eletronico
        Eletronico pc = new Eletronico(5000, "Intel i9", true);

        //Pedir o valor do desconto
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a % de desconto");
        int desconto = leitor.nextInt();

        //Exibir o valor com o desconto
        double precoFinal = pc.calcularDesconto(desconto);
        System.out.println(precoFinal);

        //Teste de desconto por cupom
        System.out.println("Digite o Ccupo: ");

        //Pedir o cupom
        String cupom = leitor.next();

        //Calcular o valor com desconto

        //Exibir o valor final com desconto
        System.out.println(pc.calcularDesconto(cupom));
    }
}
