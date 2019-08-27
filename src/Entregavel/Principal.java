package Entregavel;

public class Principal {
    public static void main(String[] args) {
        DigitalHouseManager DHM = new DigitalHouseManager();

        DHM.registrarCurso(20001, "Full Stack", 03);
        DHM.registrarCurso(20002, "Android", 02);


        DHM.registrarProfessorTitular("Maria", "Santos", 00, "Economia");
        DHM.registrarProfessorTitular("João", "de Jesus", 01, "Controladoria");
        DHM.registrarProfessorAdjunto("Rafael", "Villas Boas", 02, 40);
        DHM.registrarProfessorAdjunto("Jose", "da Silva", 03, 40);


        DHM.matricularAluno("Aluno1", "teste1", 00);
        DHM.matricularAluno("Aluno2", "teste2", 01);
        DHM.matricularAluno("Aluno3", "teste3", 02);
        DHM.matricularAluno("Aluno4", "teste4", 03);
        DHM.matricularAluno("Aluno5", "teste5", 04);


        DHM.matricularAluno(00, 20001);
        DHM.matricularAluno(01, 20001);
        DHM.matricularAluno(02, 20002);
        DHM.matricularAluno(03, 20002);
        DHM.matricularAluno(04, 20002);//fazer logica para codigo que não existe

        DHM.alocarProfessores(20001, 00, 02);
        DHM.alocarProfessores(20002, 01, 03);


    }
}
