package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploCondicaoEncadeada {
    public static void main(String[] args) {
        //Ler a média final do aluno
        String media = JOptionPane.showInputDialog("Digite a nota da média final: ");
        double nota = Double.parseDouble(media);

        //Dizer se o aluno esta aprovado >=6
        if (nota >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado!");
        } else if (nota >=4 && nota <=5.9) {
            JOptionPane.showMessageDialog(null, "Exame!");
        } else {
            JOptionPane.showMessageDialog(null, "Retido!");
        }
    }
}
