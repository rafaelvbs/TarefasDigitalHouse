package br.digitalHouse.javaComObjeto.exercicio1;

public class Principal {
    public static void main(String[] args) {

        cliente cliente1=new cliente("Rafael","Villas Boas");//vc pode colocar uma classe como parametro do construtor se
        // definir essa classe antes de criar o objeto pelo construtor no caso criei cliente1 antes de criar conta1 pelo construtor

        conta conta1=new conta(24583,10,cliente1/*,0*/);// o que esta marcado é um exemplo da maneira errada de usar o construtor
        System.out.println("Saldo atual de: "+conta1.getSaldo());
        conta1.Deposito(300);
         conta1.Saque(20);



        cliente cliente2=new cliente("Arlindo","Cruz");//so posso criar usando paametros, pos só construi um construtor definido.
        conta conta2=new conta();
        conta2.setTitular(cliente2);//cliente2 é o objeto criado e deve estar antes do objeto conta2 no codigo. Tanm é o vinculo entre conta e cliente
        conta2.setSaldo(500);
        conta2.setNumero(3000);
        System.out.println("\n\nSaldo atual de: "+conta2.getSaldo());
        conta2.Deposito(20);
        conta2.Saque(400);





    }
}
