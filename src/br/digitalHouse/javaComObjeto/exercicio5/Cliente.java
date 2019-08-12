package br.digitalHouse.javaComObjeto.exercicio5;

public class Cliente {
    private String nome;
    private String sobrenome;
    private double contato;

    public Cliente(String novoNome, String novoSobrenome, double novoContato){
    this.nome=novoNome;
    this.sobrenome=novoSobrenome;
    this.contato=novoContato;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getContato() {
        return contato;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setContato(int novoContato) {
        contato = novoContato;
    }

    public void setSobrenome(String novoSobrenome) {
        sobrenome = novoSobrenome;
    }
}
