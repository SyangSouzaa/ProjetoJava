package br.com.fiap.view;

import java.util.HashSet;
import java.util.Set;

public class Exemplo01 {
    public static void main(String[] args) {
        //Variavel para gravar o nome da turma
        String nomeTurma = "1TDSPV";

        //Variavel para gravar o nome dos alunos da turma
        Set<Integer> rmAlunos = new HashSet<>();
        //Adicionar um rm na lista
        rmAlunos.add(569259);
        //Exibir a quantidade de elementos da lista
        System.out.println("A quantidade de RMs é: " + rmAlunos.size());

    }
}