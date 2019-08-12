package br.digitalHouse.javaComObjeto.exercicio1;

public class cliente {
  public String nome;
  public String sobrenome;

  public cliente(String NovoNome, String NovoSobrenome){
    this.nome=NovoNome;
    this.sobrenome=NovoSobrenome;
  }


  public String getNome() {
    return nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setNome(String NovoNome) {
    nome = NovoNome;
  }

  public void setSobrenome(String NovoSobrenome) {
    sobrenome = NovoSobrenome;
  }
}
