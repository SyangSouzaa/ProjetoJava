package br.com.fiap.exercicio01.model;

public class Carro {

        private String placa;
        private int numeroVaga;
        private boolean preferencial;
        private char setor;
        private String horaEntrada;
        private String horaSaida;
        private double valor;

        public double calcularValorPagar(){
                int tempo = calcularTempoEstadia();
                return tempo * 15;
        }

        private int calcularTempoEstadia(){
                return 5;
        }


        //Métodos Getters e Setter//

        //Gettters

        public String getPlaca(){
                return placa;
        }
        public int getNumeroVaga(){
                return numeroVaga;
        }
        public boolean isPreferencial(){
                return preferencial;
        }
        public char getSetor() {
                return setor;
        }
        public String getHoraEntrada() {
                return horaEntrada;
        }
        public String getHoraSaida() {
                return horaSaida;
        }
        public double getValor(){
                return valor;
        }


        //Setters

        public void setPlaca(String placa) {
                this.placa = placa;
        }
        public void setNumeroVaga(int numeroVaga) {
                this.numeroVaga = numeroVaga;
        }
        public void setPreferencial(boolean preferencial) {
                this.preferencial = preferencial;
        }
        public void setSetor(char setor) {
                this.setor = setor;
        }
        public void setHoraEntrada(String horaEntrada) {
                this.horaEntrada = horaEntrada;
        }
        public void setHoraSaida(String horaSaida) {
                this.horaSaida = horaSaida;
        }
        public void setValor(double valor) {
                this.valor = valor;
        }

}