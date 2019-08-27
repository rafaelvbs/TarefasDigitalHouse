package Entregavel;


import java.util.*;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Date dataDodia;


    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataDodia = new Date(System.currentTimeMillis());  //XXXXXX DUVIDA XXXXXXXXX
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataDodia() {
        return dataDodia;
    }

    public void setDataDodia(Date dataDodia) {
        this.dataDodia = dataDodia;
    }
}
