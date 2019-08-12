package br.digitalHouse.javaSemObjeto.classe;

import com.sun.xml.internal.ws.api.model.WSDLOperationMapping;

public class exercicio6 {
    public static void main(String[] args) {
        int lista1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12,20};
        int soma=0;
        for (int i=0;i < lista1.length;i++) {//definindo quantos elementos pares existem para o novo vetor
            if (lista1[i] % 2==0) {
             soma++;
            }
        }

        double pares[]; //criando o vetor
        pares = new double[soma];// alocando espaço na memoria, ou seja definindo os numeros de elementos)

        int k=0; //primeiro ponto do vetor de numeros pares
        //incrementa o vetor pares e insere o numero para da lista1
        for (int j=0;j < lista1.length;j++ ){
            if (lista1[j]%2==0){
                pares[k++]=lista1[j];
                }
        }
        //validar se todos os elementos pares foram transferidoa para o novo vetor.
        for (int l=0;l<pares.length;l++){
        System.out.println(pares[l]);
        }
    }

}


