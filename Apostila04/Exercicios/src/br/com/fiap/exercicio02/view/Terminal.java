
package br.com.fiap.exercicio02.view;

import br.com.fiap.exercicio02.model.Cliente;
import br.com.fiap.exercicio02.model.ContaCorrente;
import br.com.fiap.exercicio02.model.Endereco;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args){
        //Ler os dados do cliente e do endereço
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = entrada.next() + entrada.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = entrada.next() + entrada.nextLine();


        System.out.println("Digite seu endereço");
        System.out.println("Logradouro: ");
        String logradouro = entrada.next() + entrada.nextLine();

        System.out.println("Número: ");
        short mumeroResidencia = entrada.nextShort();

        System.out.println("Complemento: ");
        String complemento = entrada.next();

        System.out.println("CEP: ");
        String cep = entrada.next();


        //Instanciar as classes (conta, cliente, endereço)
        Cliente cliente = new Cliente();
        cliente.nome = nome;
        cliente.cpf = cpf;

        Endereco endereco = new Endereco();
        endereco.logradouro = logradouro;
        endereco.numero = mumeroResidencia;
        endereco.complemento = complemento;
        endereco.cep = cep;

        ContaCorrente conta = new ContaCorrente();

        //Atribuir os valores nos atributos da classe
        String dadosCliente = cliente.retornarDados();
        String dadosEnderecoCliente = endereco.retornarDados();

        //Ler um valor para depositar, depositar e exibir o novo saldo
        System.out.println("Digite um valor para depósito: ");
        double deposito = entrada.nextDouble();
        conta.depositar(deposito);
        System.out.println("Seu  saldo é: " + conta.retornarSaldo());


        //Ler um valor para retirar, retirar e exibir o novo saldo
        System.out.println("Digite um valor para sacar: ");
        double saque = entrada.nextDouble();
        conta.retirar(saque);
        System.out.println("Seu  saldo é: " + conta.retornarSaldo());

        //Exibir os dados do cliente e endereço
        System.out.println("Os dados do cliente são: \n" + dadosCliente);
        System.out.println("O endereço é: \n " + dadosEnderecoCliente);
    }
}