package br.digitalHouse.javaComObjeto.exercicio1;

import com.sun.xml.internal.ws.client.ClientTransportException;
import jdk.nashorn.internal.ir.IfNode;

public class conta {
    private int numero;
    private double saldo;
    private cliente titular;// esse atributo/objeto ajuda a vincular cliente a conta
    // private double  saldoManeiraErrada=200;

    public conta(int novoNumero, double novoSaldo, cliente novoTitular/*, double saldoManeiraErrada*/) {
        this.numero = novoNumero;// usar o "this" para entender que o saldo é um para a "conta nota", se não ele usa o atributo saldo que é zero, exemplo usar o saldomaneira errada
        this.saldo = novoSaldo;
        this.titular=novoTitular;
    }

    public conta(){}//construtor vazio

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public cliente getTitular() {
        return titular;
    }

    public void setSaldo(double NovoSaldo) {
        saldo = NovoSaldo;
    }

    public void setNumero(int NovoNumero) {
        numero = NovoNumero;
    }

    public void setTitular(cliente novoTitular) {
        titular = novoTitular;
    }

    public void Saque(double saque) {
        if (saque >= saldo) {
            System.out.println("Saldo Insuficiente");
        } else {
            saldo-=saque;
            System.out.println("saque no valor de: " + saque);
            System.out.println("Novo Saldo no valor de: " + saldo);
        }}

    public void Deposito(double deposito) {
        saldo = deposito + saldo;
        // saldoManeiraErrada=deposito+saldoManeiraErrada;
        System.out.println("o novo Saldo é de: " + saldo);
        // System.out.println("o deposito é de: "+saldoManeiraErrada);
    }



}
