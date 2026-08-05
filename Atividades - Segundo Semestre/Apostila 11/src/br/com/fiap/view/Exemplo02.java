package br.com.fiap.view;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {
    public static void main(String[] args) {
        //Criar uma lista de nome dos alunos
        List<String> alunos = new ArrayList<>();

        //Adicionar 2 nomes
        alunos.add("Syang");
        alunos.add("Cristina");

        //Verificar se existe nomes na lista
        if (alunos.isEmpty()) {
            System.out.println("A lista esta vazia");
        } else
            //Exibir a quantidade
            System.out.println("A lista contem nome");
    }
}    