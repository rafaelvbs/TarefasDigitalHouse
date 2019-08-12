package br.digitalHouse.javaComObjeto.exercicio5;
import java.util.ArrayList;
import java.util.List;
public class Concessionaria {
    //não entendi isso tbm
    List<Venda> vendas = new ArrayList<>();

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> novaVenda) {
        vendas = novaVenda;
    }


//não entendi o vetor e o que é isso
public void registrarVenda(Veiculo novoVeiculo,Cliente novoCliente, Double novoValor){
    Venda venda = new Venda();
    venda.setVeiculo(novoVeiculo);
    venda.setCliente(novoCliente);
    venda.setValor(novoValor);

    this.vendas.add(venda);
}

}
