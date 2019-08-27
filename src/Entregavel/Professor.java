package Entregavel;

public abstract class  Professor {
protected String nome;
private String sobrenome;
protected Integer tempoCasa;
protected Integer codigoProfessor;

    public Professor(Integer codigoProfessor, String nome, String sobrenome, Integer tempoCasa) {
        this.codigoProfessor = codigoProfessor;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoCasa = tempoCasa;

    }




    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(Integer tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }
}
