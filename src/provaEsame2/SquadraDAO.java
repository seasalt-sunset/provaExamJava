package provaEsame2;

import java.util.ArrayList;

public class SquadraDAO {
	
	private static Scansione _scansione = new Scansione();
	
	public static Squadra aggiungiSquadra() {
		String nomeSquadra = _scansione.inserimentoNomeSquadra();
		
		Squadra aggSquadra = new Squadra(nomeSquadra);


		
		return aggSquadra;
	}
	
	public static int trovaIndexSquadra(String nome, ArrayList <Squadra> elencoSquadre) {
		for(int i=0; i<elencoSquadre.size(); i++) {
			if(elencoSquadre.get(i).getNomeSquadra().equalsIgnoreCase(nome)) {
				return i;
			}
		}
		return -1;
	}

}
