package br.com.fiap.garagem.view;

import br.com.fiap.garagem.model.Carro;

public class Terminal {

    public static void main(String[] args) {
        //Criar um objeto carro
        Carro onix = new Carro();

        onix.setPlaca("ABC1234");
        onix.setNumeroVaga(3);
        onix.setPreferencial(true);
        onix.setSetor('B');
        onix.setHoraEntrada("10:00");
        onix.setHoraSaida("11:30");
        onix.setValor(12);

        //Exibir dados do carro
        System.out.println("Placa do carro: " + onix.getPlaca());
        System.out.println("Número da vaga: " + onix.getNumeroVaga());
        System.out.println("Vaga preferencial? " + onix.isPreferencial());
        System.out.println("Setor: " + onix.getSetor());
        System.out.println("Horário da Entrada: " + onix.getHoraEntrada());
        System.out.println("Horário da Saida: " + onix.getHoraSaida());
        System.out.println("Valor a pagar: R$" + onix.getValor());
    }
}
