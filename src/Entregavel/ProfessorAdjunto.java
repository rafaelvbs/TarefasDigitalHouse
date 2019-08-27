package Entregavel;

import java.util.ArrayList;

public class ProfessorAdjunto extends Professor {
    private Integer monitoria;

    public ProfessorAdjunto(Integer codigoProfessor, String nome,String sobrenome,Integer tempoCasa,Integer monitoria) {
        super(codigoProfessor,nome,sobrenome,tempoCasa);
        this.monitoria=monitoria;
    }

    public Integer getMonitoria() {
        return monitoria;
    }

    public void setMonitoria(Integer monitoria) {
        this.monitoria = monitoria;
    }


}
