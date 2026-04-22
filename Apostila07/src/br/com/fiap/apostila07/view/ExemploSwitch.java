package br.com.fiap.apostila07.view;

import javax.swing.*;
import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        //Ler dois numeros
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

        //Ler a operacao (somar, dividir, subtrair e multiplicar)
        String op = JOptionPane.showInputDialog("Operação? (+, -, /, *");

        //Realizar a operacao e exibir o resultado
        switch (op) {
            case "+" :
                JOptionPane.showMessageDialog(null, n1 + n2);
                break;
            case "-" :
                JOptionPane.showMessageDialog(null, n1 - n2);
                break;
            case "/" :
               if (n2 !=0) {
                JOptionPane.showMessageDialog(null, n1 / n2);}
               else {
                   JOptionPane.showMessageDialog(null, "Divisão por zero");
               }
               break;
            case "*" :
                JOptionPane.showMessageDialog(null, n1 * n2);
        }

    }//main
}//class
