package br.com.fiap.exercicio1.lanhouse.model;

public class Computador {

    private String processador;
    private int id;
    private String placaVideo;
    private double armazenamento;
    private boolean possuiSsd;
    private int memoriaRam;

    public Computador(String processador, int id) {
        this.processador = processador;
        this.id = id;
    }
    public Computador(String processador, int id, double armazenamento, String placaVideo, boolean possuiSsd, int memoriaRam){
        this(processador, id);
        this.placaVideo = placaVideo;
        this.armazenamento = armazenamento;
        this.possuiSsd = possuiSsd;
        this.memoriaRam = memoriaRam;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getId() {
        return id;
    }

    public void setID(int Id) {
        this.id = id;
    }

    public String getPlacaDVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean isPossuiSsd() {
        return possuiSsd;
    }

    public void setSsd(boolean possuiSsd) {
        this.possuiSsd = possuiSsd;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRAM(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
}