package br.digitalHouse.javaComObjeto.exercicio2;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;
import sun.reflect.generics.tree.VoidDescriptor;

public class SessaoDeTreinamento {
// O EXERCICIO PEDE ESSE BLOCO DE CODIGO, MAS O PROGRAMA FUNCIONA SEM ELE PELA RESOLUÇÃO, QUAL SUA NECESSIADE???
//    private int experiencia;
//
//    public int getExperiencia() {
//        return experiencia;
//    }
//
//    public void setExperiencia(int experiencia) {
//        this.experiencia = experiencia;
//    }

    public void TreinarA(JogadorDeFutebol jogador) {
        System.out.println("Experiência antes do treino: " + jogador.getExperiencia());
        jogador.Correr();
        jogador.fazerGol();
        jogador.Correr();
        jogador.setExperiencia(jogador.getExperiencia() + 1);
        System.out.println("Experiência após o treino: " + jogador.getExperiencia());
    }















}
