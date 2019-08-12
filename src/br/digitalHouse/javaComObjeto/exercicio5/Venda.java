package br.digitalHouse.javaComObjeto.exercicio5;

public class Venda {
    private Cliente cliente;
    private Veiculo veiculo;
    private double valor;

    //  no exercicio pediu para usar o construtor e na resolução nao está usando
//    public Venda(Cliente novoCliente, Veiculo novoVeiculo, double novaVenda){
//        this.cliente=novoCliente;
//        this.veiculo=novoVeiculo;
//        this.valor=novaVenda;
//    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setCliente(Cliente novoCliente) {
        cliente = novoCliente;
    }

    public void setValor(double novoValor) {
        valor = novoValor;
    }

    public void setVeiculo(Veiculo novoVeiculo) {
        veiculo = novoVeiculo;
    }
}
