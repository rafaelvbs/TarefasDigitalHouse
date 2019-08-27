package Entregavel;

public class Aluno {
    private String nome;
    private String sobreNome;
    private Integer codigoAluno;

    public Aluno( Integer codigoAluno, String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.codigoAluno = codigoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }
}
