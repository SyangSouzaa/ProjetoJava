package br.com.fiap.garagem.model;

public class Carro {

        private String placa;
        private int numeroVaga;
        private boolean preferencial;
        private char setor;
        private String horaEntrada;
        private String horaSaida;
        private double valor;

        double calcularValorPagar(){
            return 0;
        }

        //Métodos Getters e Setter
        public double getValor(){
                return valor;
        }

        public void setValor(double valor){
                valor = valor;
        }
        
}