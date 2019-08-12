package br.digitalHouse.javaSemObjeto.tarefa;

import sun.font.TrueTypeFont;

public class tarefa5 {
    public static void main(String[] args) {
        int numA = 1;
        int numB = 10;
        int numC = 6;
        int numD = 7;
        if ((numA > numC && numA > numD) || (numB > numC && numB > numD)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
