import utente.GestaoUtentes;
import utente.Utente;

import java.util.List;

public class Autenticacao {

    private GestaoUtentes gestaoUtentes;

    public Autenticacao(GestaoUtentes gestaoUtentes){
        this.gestaoUtentes = gestaoUtentes;
    }

    public void login(Utente utente) {
        for(Utente utenteExistente: gestaoUtentes.getUtentes()) {
            if  ((utenteExistente.getNome().equals(utente.getNome()))
                    || (utenteExistente.getNumUtente() == utente.getNumUtente())
                    || (utenteExistente.getNumTelefone() == utente.getNumTelefone())) {
                System.out.println("Login falhou!");
            } else {
                System.out.println("Login com sucesso!");            }
        }

    }

    public void registo(Utente utente) {
        List<Utente> utentes = gestaoUtentes.getUtentes();
        utentes.add(utente);

        gestaoUtentes.setUtentes(utentes);
    }
}
