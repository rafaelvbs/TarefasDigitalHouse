package br.digitalHouse.javaComObjeto.exercicio3;

public class prova {
    private int dificuldade;
    private int energiaNecessaria;

    public int getDificuldade() {
        return dificuldade;
    }

    public int getEnergianecessaria() {
        return energiaNecessaria;
    }

    public void setDificuldade(int novaDificuldade) {
        dificuldade = novaDificuldade;
    }

    public void setEnergiaNecessaria(int novaEnergiaNecessaria) {
        energiaNecessaria = novaEnergiaNecessaria;
    }

    public boolean podeRealizar(atleta esportista) { //precisa retornar um True or false, por isso o uso do "boolean e não o void
        return (esportista.getEnergia() > this.energiaNecessaria && esportista.getNivel() > this.dificuldade);
    }
}


