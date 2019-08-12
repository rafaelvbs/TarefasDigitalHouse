package br.digitalHouse.javaComObjeto.exercicio3;

public class exerciocio3 {
    public static void main(String[] args) {
        atleta atleta1=new atleta();
            atleta1.setEnergia(20);
            atleta1.setNivel(15);
            atleta1.setNome("Joao");

       atleta atleta2=new atleta();
        atleta2.setEnergia(50);
        atleta2.setNivel(50);
        atleta2.setNome("Bob");

        prova prova1 = new prova();
        prova1.setDificuldade(1);
        prova1.setEnergiaNecessaria(1);

        prova prova2 = new prova();
        prova2.setDificuldade(12);
        prova2.setEnergiaNecessaria(11);

        prova prova3 = new prova();
        prova3.setDificuldade(27);
        prova3.setEnergiaNecessaria(10);

        System.out.println(prova3.podeRealizar(atleta1));
        System.out.println(atleta1.getEnergia());
        System.out.println(atleta1.getNivel());






    }
}
