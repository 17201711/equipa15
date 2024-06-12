package utente.atividade;

import java.util.ArrayList;
import java.util.List;

public class GestaoAtividade {
    private List<Atividade> atividades = new ArrayList<>();

    public void registarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public List<Atividade> consultarAtividades(Atividade atividade) {
        List<Atividade> atividadePedida = new ArrayList<>();

        for(Atividade atividadeExistente: atividades) {
            atividade.getInicio();
            if(atividadeExistente.getInicio().isBefore(atividade.getInicio() )
                    && atividadeExistente.getFim().isAfter(atividade.getFim())) {
                atividadePedida.add(atividadeExistente);
            }
        }
        return atividadePedida;
    }
}
