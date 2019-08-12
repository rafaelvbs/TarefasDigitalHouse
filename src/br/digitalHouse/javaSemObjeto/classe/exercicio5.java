package br.digitalHouse.javaSemObjeto.classe;

public class exercicio5 {
    public static void main(String[] args) {

        int lista[]={1,2,3,4,5,6,8};
        int soma=0;

        for (int i=0;i<lista.length;i++){
if (lista[i]%2==0){
            soma=soma+lista[i];}
        }
        System.out.println(soma);

    }
}