package br.digitalHouse.javaComObjeto.exercicio2;

public class JogadorDeFutebol {
   private String nome;
   private int energia;
   private int alegria;
   private int gols;
   private int experiencia;

   public JogadorDeFutebol(String novoNome, int novaEnergia, int novaAlegria, int novosGols, int novaexperiencia){
       this.nome=novoNome;
       this.energia=novaEnergia;
       this.alegria=novaAlegria;
       this.gols=novosGols;
       this.experiencia=novaexperiencia;
        }

    public String getNome() {
        return nome;
    }

    public int getAlegria() {
        return alegria;
    }

    public int getEnergia() {
        return energia;
    }

    public int getGols() {
        return gols;
    }

    public int getExperiencia() { return experiencia; }

    public void setNome(String novoNome) { nome = novoNome; }

    public void setAlegria(int novaAlegria) { alegria = novaAlegria; }

    public void setEnergia(int novaEnergia) { energia = novaEnergia; }

    public void setExperiencia(int novaExperiencia) {
        experiencia = novaExperiencia;
    }

    public void fazerGol(){
    gols++;
    energia-=5;
    alegria+=10;
    System.out.println("GOOOOL!");
    }

    public void Correr( ){
        energia-=10;
        System.out.println("Cansei");
}


}
