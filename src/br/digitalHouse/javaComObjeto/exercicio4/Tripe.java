package br.digitalHouse.javaComObjeto.exercicio4;

public class Tripe {
    private boolean dobrado;
    private int alturaMax;
    private int alturaMin;
    private int alturaAtual;

    public int getAlturaAtual() {
        return alturaAtual;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public int getAlturaMin() {
        return alturaMin;
    }

    public boolean getDobrado(){
        return dobrado;
    }

    public void setAlturaAtual(int NovaAlturaAtual) {
        alturaAtual = NovaAlturaAtual;
    }

    public void setAlturaMax(int NovaAlturaMax) {
       alturaMax = NovaAlturaMax;
    }

    public void setAlturaMin(int NovaAlturaMin) {
        alturaMin = NovaAlturaMin;
    }

    public void setDobrado(boolean Novaposiçao) {
        dobrado = Novaposiçao;
    }

    public void definirAltura(Integer novaAltura){
   alturaAtual=novaAltura;
    }

    public void dobrar(){
        dobrado=true;
    }
    public void desdobrar(){
        dobrado=false;
    }
    public void guardar(){
        dobrado=true;
        alturaAtual=alturaMin;// a ordem no caso é importante para que a altura atual pegue o valor da Altura minima e não o contrario
    }

    public boolean prontoParaGuardar(){
        return dobrado==true && alturaAtual==alturaMin;
    }


}
