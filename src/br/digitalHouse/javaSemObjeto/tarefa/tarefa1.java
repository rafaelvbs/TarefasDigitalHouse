package br.digitalHouse.javaSemObjeto.tarefa;

import com.sun.deploy.security.SelectableSecurityManager;

public class tarefa1 {
    public static void main(String[] args) {


        int numA = 1;
        int numB = 50;
        int numC = 3;

        if (numA > numB && numA > numC) {
            System.out.println(numA);
        }else if (numB>numA && numB>numC){
            System.out.println(numB);
        }else{
            System.out.println(numC);
        }


    }
}
