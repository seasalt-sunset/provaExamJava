package provaEsame2;

import java.util.ArrayList;

public class GolDAO {
	
	private static Scansione _scansione = new Scansione();
	
	public static Gol aggiungiGolSquadra(Squadra squadra) {
		String nomeSquadra = squadra.getNomeSquadra();
		int golFattiCasa = _scansione.inserimentoGolFattiCasa();
		int golFattiTrasferta =  _scansione.inserimentoGolFattiTrasferta();
		int golSubitiCasa = _scansione.inserimentoGolSubitiCasa();
		int golSubitiTrasferta = _scansione.inserimentoGolSubitiTrasferta();
		
		Gol aggGolSquadra = new Gol(nomeSquadra, golFattiCasa, golSubitiCasa, golFattiTrasferta, golSubitiTrasferta);


		
		return aggGolSquadra;
	}
	
	public static void modificaGol(ArrayList <Gol> elencoGol, ArrayList <Squadra> elencoSquadre) {
		CasaOTrasferta casaOTrasferta;
		FattiOSubiti fattiOSubiti;
		int indexSquadra;
		String nomeSquadra;
		do {
			nomeSquadra = _scansione.modGol_nomeSquadra();
			if(nomeSquadra.equalsIgnoreCase("menu")) {
				return;
			}
			indexSquadra = SquadraDAO.trovaIndexSquadra(nomeSquadra, elencoSquadre);
			if (indexSquadra==-1) {
				System.out.println("Nessuna squadra trovata.");
			}
		} while (indexSquadra==-1);
	
		fattiOSubiti = _scansione.modGol_fattiOSubiti();
		casaOTrasferta = _scansione.modGol_casaOTrasferta();
		
		switch (fattiOSubiti) {
			case Fatti:
					if (casaOTrasferta.toString()=="Casa" || casaOTrasferta.toString()=="Entrambe") {
						ModificaGolFattiCasa(elencoGol, indexSquadra);
					}
					if (casaOTrasferta.toString()=="Trasferta" || casaOTrasferta.toString()=="Entrambe") {
						ModificaGolFattiTrasferta(elencoGol, indexSquadra);
					}
				break;
			case Subiti:
				if (casaOTrasferta.toString()=="Casa" || casaOTrasferta.toString()=="Entrambe") {
					ModificaGolSubitiCasa(elencoGol, indexSquadra);
				}
				if (casaOTrasferta.toString()=="Trasferta" || casaOTrasferta.toString()=="Entrambe") {
					ModificaGolSubitiTrasferta(elencoGol, indexSquadra);
				}
				break;
			case Entrambi:
				if (casaOTrasferta.toString()=="Casa" || casaOTrasferta.toString()=="Entrambe") {
					ModificaGolFattiCasa(elencoGol, indexSquadra);
					ModificaGolSubitiCasa(elencoGol, indexSquadra);
				}
				if (casaOTrasferta.toString()=="Trasferta" || casaOTrasferta.toString()=="Entrambe") {
					ModificaGolFattiTrasferta(elencoGol, indexSquadra);
					ModificaGolSubitiTrasferta(elencoGol, indexSquadra);				}
				break;
		}
	}
	
	public static void ModificaGolFattiCasa(ArrayList<Gol> elencoGol, int indexSquadra) {
		Gol modGol= elencoGol.get(indexSquadra);
		Print.printModGol_valoreGol(FattiOSubiti.Fatti, CasaOTrasferta.Casa, modGol, false, modGol.getGolFattiCasa());
		int quantitaModifica= _scansione.quantitaModifica();
		modGol.setGolFattiCasa(quantitaModifica);
		Print.printModGol_valoreGol(FattiOSubiti.Fatti, CasaOTrasferta.Casa, modGol, true, modGol.getGolFattiCasa());
	}
	
	public static void ModificaGolFattiTrasferta(ArrayList<Gol> elencoGol, int indexSquadra) {
		Gol modGol= elencoGol.get(indexSquadra);
		Print.printModGol_valoreGol(FattiOSubiti.Fatti, CasaOTrasferta.Trasferta, modGol, false, modGol.getGolFattiTrasferta());
		int quantitaModifica= _scansione.quantitaModifica();
		modGol.setGolFattiTrasferta(quantitaModifica);
		Print.printModGol_valoreGol(FattiOSubiti.Fatti, CasaOTrasferta.Trasferta, modGol, true, modGol.getGolFattiTrasferta());
	}
	
	public static void ModificaGolSubitiCasa(ArrayList<Gol> elencoGol, int indexSquadra) {
		Gol modGol= elencoGol.get(indexSquadra);
		Print.printModGol_valoreGol(FattiOSubiti.Subiti, CasaOTrasferta.Casa, modGol, false, modGol.getGolSubitiCasa());
		int quantitaModifica= _scansione.quantitaModifica();
		modGol.setGolSubitiCasa(quantitaModifica);
		Print.printModGol_valoreGol(FattiOSubiti.Subiti, CasaOTrasferta.Casa, modGol, true, modGol.getGolSubitiCasa());
	}
	
	public static void ModificaGolSubitiTrasferta(ArrayList<Gol> elencoGol, int indexSquadra) {
		Gol modGol= elencoGol.get(indexSquadra);
		Print.printModGol_valoreGol(FattiOSubiti.Subiti, CasaOTrasferta.Trasferta, modGol, false, modGol.getGolSubitiTrasferta());
		int quantitaModifica= _scansione.quantitaModifica();
		modGol.setGolSubitiTrasferta(quantitaModifica);
		Print.printModGol_valoreGol(FattiOSubiti.Subiti, CasaOTrasferta.Trasferta, modGol, true, modGol.getGolSubitiTrasferta());
	}
}
