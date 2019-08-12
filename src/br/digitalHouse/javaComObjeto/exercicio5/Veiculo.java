package br.digitalHouse.javaComObjeto.exercicio5;

import javax.swing.*;

public class Veiculo {
    private String marca;
    private String modelo;
    private int anoDeFabricacao;
    private String cor;
    private double quilometragem;


    public Veiculo(String novaMarca, String novoModelo, int novoAnoDeFabricacao, String novaCor, double novaQuilometragem){
        this.marca=novaMarca;
        this.modelo=novoModelo;
        this.anoDeFabricacao=novoAnoDeFabricacao;
        this.cor=novaCor;
        this.quilometragem=novaQuilometragem;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAnoDeFabricacao(int novoAnoDeFabricacao) {
        anoDeFabricacao = novoAnoDeFabricacao;
    }

    public void setCor(String novaCor) {
        cor = novaCor;
    }

    public void setMarca(String novaMarca) {
        marca = novaMarca;
    }

    public void setModelo(String novoModelo) {
        modelo = novoModelo;
    }

    public void setQuilometragem(double novaQuilometragem) {
        quilometragem = novaQuilometragem;
    }

}
