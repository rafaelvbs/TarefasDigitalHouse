package Entregavel;

import java.util.*;

public class Curso {
    private String nome;
    private Integer codigoCurso;
    private Integer vagas;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;


    List<Aluno> listaAluno = new ArrayList<>();

    public Curso(Integer codigoCurso, String nome, Integer vagas) {
        this.codigoCurso = codigoCurso;
        this.nome = nome;
        this.vagas=vagas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }


    public boolean adicionarAluno(Aluno umAluno) {

        if (vagas < listaAluno.size()) {
            listaAluno.add(umAluno);
            return true;
        } else {
            return false;
        }
    }

    public void excluiraluno(Aluno umAluno) {

        listaAluno.remove(umAluno);
    }


//sobrescrita do metodo equal para encontrar encontar curso por codigo, lembrar que contains e indexOf,pois possuem o metodo equal na implementatação
    public boolean equals(Object outrocurso) {
        if (outrocurso instanceof Curso) {
            Curso curso1 = (Curso) outrocurso;
            return this.codigoCurso.equals(curso1.getCodigoCurso());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codigoCurso=" + codigoCurso +
                ", vagas=" + vagas +
                ", professorAdjunto=" + professorAdjunto +
                ", professorTitular=" + professorTitular +
                ", listaAluno=" + listaAluno +
                '}';
    }
}


