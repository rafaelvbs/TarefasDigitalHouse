package Entregavel;

import sun.font.TrueTypeFont;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
//
//    List<Aluno> listaAluno;
//    List<Professor> listaProfessor;
//    List<Curso> listaCurso;
//    List<Matricula> listaMatricula;


    List<Aluno> listaAluno = new ArrayList<>();
    List<Professor> listaProfessor = new ArrayList<>();
    List<Curso> listaCurso = new ArrayList<>();
    List<Matricula> listaMatricula = new ArrayList<>();


    public void registrarCurso(Integer codigoCurso, String nome, Integer quantidadeMaximaDeAlunos) {
        Curso novoCurso = new Curso(codigoCurso, nome, quantidadeMaximaDeAlunos);//
        if (listaCurso.contains(novoCurso)) {
            System.out.println("registrarCurso: Curso ja cadastrado");
        } else {
            listaCurso.add(novoCurso);
            System.out.println("registrarCurso: Cadastro do Curso realizado");
        }
    }

    public void excluirCurso(Integer codigoCurso) {
        Curso cursoARemover = new Curso(codigoCurso, "", 0);
        int tamanhoListaAntes = listaCurso.size();
        for (Curso curso : listaCurso) {
            if (curso.getCodigoCurso().equals(codigoCurso)) {
                cursoARemover = curso;
                System.out.println("Curso " + curso.getNome() + " removido");//pode não chegar a imprimir ou seja não realisa o if quando o codigo é inexistemnte e salda direto para fora do for
            }
        }
        listaCurso.remove(cursoARemover);
        int tamanhoListaDepois = listaCurso.size();
        if (tamanhoListaAntes == tamanhoListaDepois) {
            System.out.println("curso não foi encontrado, remoção não efetuada");
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        ProfessorAdjunto novoProfessorAdj = new ProfessorAdjunto(codigoProfessor, nome, sobrenome, 0, quantidadeDeHoras);//
        boolean codNaoEncontrado = true;
        for (Professor valorProfessor : listaProfessor) {
            if (valorProfessor.getCodigoProfessor().equals(codigoProfessor)) {
                codNaoEncontrado = false;
            }
        }

        if (codNaoEncontrado) {//não há necessidade de comparar com true ou false, pois a variavel já retorna um boleano,
            listaProfessor.add(codigoProfessor, novoProfessorAdj);
            System.out.println("Professor " + nome + " " + sobrenome + " adicionado com Sucesso!!");
        } else {
            System.out.println("Codigo já existente, não foi possivel adicionar o Professor Adjunto");
        }
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular novoProfessorTit = new ProfessorTitular(codigoProfessor, nome, sobrenome, 0, especialidade);
        boolean codNaoEncontrado = true;
        for (Professor valorProfessor : listaProfessor) {
            if (valorProfessor.getCodigoProfessor().equals(codigoProfessor)) {
                codNaoEncontrado = false;
            }
        }
        if (codNaoEncontrado) {//não há necessidade de comparar com true ou false, pois a variavel já retorna um boleano,
            listaProfessor.add(novoProfessorTit);
            System.out.println("Professor " + nome + " " + sobrenome + " adicionado com Sucesso!!");
        } else {
            System.out.println("Codigo já existente, não foi possivel adicionar o Professor Titular");
        }
    }

    public void excluirProfessor(Integer codigoProfessor) {

        Professor professorARemover = null; //criando variavel professorm como nulo para ser removido, não é necessario valor pq sera excluido e tbm não posso instanciar pois é abstrato
        int tamanhoListaAntes = listaProfessor.size();
        for (Professor vlrProfessor : listaProfessor) {
            if (vlrProfessor.getCodigoProfessor().equals(codigoProfessor)) {
                professorARemover = vlrProfessor;
                System.out.println("Professora " + vlrProfessor.getnome() + " " + vlrProfessor.getSobrenome() + " removido");//pode não chegar a imprimir ou seja não realiza o if quando o codigo é inexistemnte e salda direto para fora do for
            }
        }
        listaProfessor.remove(professorARemover);
        int tamanhoListaDepois = listaProfessor.size();
        if (tamanhoListaAntes == tamanhoListaDepois) {
            System.out.println("curso não foi encontrado, remoção não efetuada");
        }
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {
        Aluno novoAluno = new Aluno(codigoAluno, nome, sobrenome);//
        boolean codNaoEncontrado = true;
        for (Aluno objAluno : listaAluno) {
            if (objAluno.getCodigoAluno().equals(codigoAluno)) {
                codNaoEncontrado = false;
            }
        }

        if (codNaoEncontrado) {//não há necessidade de comparar com true ou false, pois a variavel já retorna um boleano,
            listaAluno.add(novoAluno);
            System.out.println("Aluno " + nome + " " + sobrenome + " adicionado com Sucesso!!");
        } else {
            System.out.println("Codigo já existente, não foi possivel adicionar o Aluno");
        }

    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
        Aluno novoAluno = null;
        Curso novoCurso = null;
        for (Aluno vlrAluno : listaAluno) {
            if (vlrAluno.getCodigoAluno().equals(codigoAluno)) {
                novoAluno = vlrAluno;
            }
        }
        for (Curso vlrCurso : listaCurso) {
            if (vlrCurso.getCodigoCurso().equals(codigoCurso)) {
                novoCurso = vlrCurso;
            }
        }
        if (novoCurso.getVagas() > 0) {
            Matricula novaMatricula = new Matricula(novoAluno, novoCurso);
            System.out.println(novaMatricula.getDataDodia());    //MUDAR CONFIGURAÇÃO DA DATA
            listaMatricula.add(novaMatricula);
            System.out.println("Aluno " + novoAluno.getNome() + " " + novoAluno.getSobreNome() + " matriculado no curso de " + novoCurso.getNome() + " com exito!!!");

        } else {
            System.out.println("Turma lotada, não foi possivel realizar a Matricula");
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        Curso novoCurso = null;
        ProfessorTitular novoProfessorTit= null;
        ProfessorAdjunto novoProfessorAdj = null;
        for (Curso vlrCurso : listaCurso) {
            if (vlrCurso.getCodigoCurso().equals(codigoCurso)) {
                novoCurso = vlrCurso;
            }
        }
        for (Professor vlrProfessor : listaProfessor) {
            if (vlrProfessor.getCodigoProfessor().equals(codigoProfessorTitular)) {
                novoProfessorTit = (ProfessorTitular) vlrProfessor;
            }
        }
        for (Professor vlrProfessor : listaProfessor) {
            if (vlrProfessor.getCodigoProfessor().equals(codigoProfessorAdjunto)) {
                novoProfessorAdj = (ProfessorAdjunto) vlrProfessor;
            }
        }
        novoCurso.setProfessorAdjunto(novoProfessorAdj);
        novoCurso.setProfessorTitular(novoProfessorTit);

    }



}