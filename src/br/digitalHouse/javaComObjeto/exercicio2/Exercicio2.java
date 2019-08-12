package br.digitalHouse.javaComObjeto.exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        //criar dois jogadores de futebol, configurando os atributos necessários
        JogadorDeFutebol Jogador1=new JogadorDeFutebol("Messi",50,25,160,200);
        JogadorDeFutebol Jogador2=new JogadorDeFutebol("C7",70,50,155,150);

        //criar uma sessão de treinamento, também com os atributos necessários
            SessaoDeTreinamento Treinamento1=new SessaoDeTreinamento();// não precisou de atributo pq vc nao contrui um construtor em Sessao
            Treinamento1.TreinarA(Jogador1);
            SessaoDeTreinamento Treinamento2=new SessaoDeTreinamento();
            Treinamento2.TreinarA(Jogador2);








    }
}
