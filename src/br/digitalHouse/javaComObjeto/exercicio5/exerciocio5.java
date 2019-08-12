package br.digitalHouse.javaComObjeto.exercicio5;

public class exerciocio5 {


    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jose"," da Silva",1199059603);


        Veiculo carro = new Veiculo("Bugatii","Veyron Super Sport",2015,"azul",158);


        Concessionaria concessionaria = new Concessionaria();
        concessionaria.registrarVenda(carro, cliente, 1500500.00);
    }

}

