package br.digitalHouse.javaComObjeto.exercicio4;

public class exercicio4 {
    public static void main(String[] args) {
     Tripe tripe1=new Tripe();
     tripe1.setAlturaAtual(30);
     tripe1.setAlturaMax(50);
     tripe1.setAlturaMin(20);
     tripe1.setDobrado(false);

    // testes
        System.out.println(tripe1.getAlturaAtual());
        tripe1.definirAltura(35);
        System.out.println(tripe1.getAlturaAtual());
        System.out.println(tripe1.getDobrado());
        tripe1.dobrar();
        System.out.println(tripe1.getDobrado());
        tripe1.desdobrar();
        System.out.println(tripe1.getDobrado());
        System.out.println(tripe1.getAlturaAtual());
        System.out.println(tripe1.getAlturaMin());
        tripe1.guardar();
        System.out.println(tripe1.getAlturaAtual());
        System.out.println(tripe1.getAlturaMin());
        System.out.println(tripe1.prontoParaGuardar());


    }
}
