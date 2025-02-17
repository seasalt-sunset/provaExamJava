package provaEsame2;

import java.util.ArrayList;

public class PartiteDAO {
	private static Scansione _scansione = new Scansione();
	
	public static Partite aggiungiPartiteSquadra(Squadra squadra) {
		String nomeSquadra = squadra.getNomeSquadra();
		int pVinteCasa = _scansione.inserimentoPartiteVinteCasa();
		int pVinteTrasferta = _scansione.inserimentoPartiteVinteTrasferta();
		int pPareggiateCasa = _scansione.inserimentoPartitePareggiateCasa();
		int pPareggiateTrasferta = _scansione.inserimentoPartitePareggiateTrasferta();
		int pPerseCasa =  _scansione.inserimentoPartitePerseCasa();
		int pPerseTrasferta =  _scansione.inserimentoPartitePerseTrasferta();
		
		Partite aggPartiteSquadra = new Partite(nomeSquadra, pVinteCasa, pVinteTrasferta, pPareggiateCasa, pPareggiateTrasferta, pPerseCasa, 
				pPerseTrasferta);


		
		return aggPartiteSquadra;
	}
	
	public static void modificaPartite(ArrayList <Partite> elencoPartite, ArrayList <Squadra> elencoSquadre) {
		CasaOTrasferta casaOTrasferta;
		VinteOPerse vinteOPerse;
		int indexSquadra;
		String nomeSquadra;
		do {
			nomeSquadra = _scansione.modPartite_nomeSquadra();
			if(nomeSquadra.equalsIgnoreCase("menu")) {
				return;
			}
			indexSquadra = SquadraDAO.trovaIndexSquadra(nomeSquadra, elencoSquadre);
			if (indexSquadra==-1) {
				System.out.println("Nessuna squadra trovata.");
			}
		} while (indexSquadra==-1);
			
		casaOTrasferta = _scansione.modPartite_casaOTrasferta();
		vinteOPerse = _scansione.modPartite_vinteOPerse();
		
		switch (vinteOPerse) {
			case Vinte:
					if (casaOTrasferta.toString()=="Casa" || casaOTrasferta.toString()=="Entrambe") {
						ModificaPartiteVinteCasa(elencoPartite, indexSquadra);
					}
					if (casaOTrasferta.toString()=="Trasferta" || casaOTrasferta.toString()=="Entrambe") {
						ModificaPartiteVinteTrasferta(elencoPartite, indexSquadra);
					}
				break;
			case Perse:
				if (casaOTrasferta.toString()=="Casa" || casaOTrasferta.toString()=="Entrambe") {
					ModificaPartitePerseCasa(elencoPartite, indexSquadra);
				}
				if (casaOTrasferta.toString()=="Trasferta" || casaOTrasferta.toString()=="Entrambe") {
					ModificaPartitePerseTrasferta(elencoPartite, indexSquadra);
				}
				break;
			case Pareggiate:
				if (casaOTrasferta.toString()=="Casa" || casaOTrasferta.toString()=="Entrambe") {
					ModificaPartitePareggiateCasa(elencoPartite, indexSquadra);
				}
				if (casaOTrasferta.toString()=="Trasferta" || casaOTrasferta.toString()=="Entrambe") {
					ModificaPartitePareggiateTrasferta(elencoPartite, indexSquadra);
				}
				break;
			case Tutte:
				if (casaOTrasferta.toString()=="Casa" || casaOTrasferta.toString()=="Entrambe") {
					ModificaPartiteVinteCasa(elencoPartite, indexSquadra);
					ModificaPartitePerseCasa(elencoPartite, indexSquadra);
					ModificaPartitePareggiateCasa(elencoPartite, indexSquadra);
				}
				if (casaOTrasferta.toString()=="Trasferta" || casaOTrasferta.toString()=="Entrambe") {
					ModificaPartiteVinteTrasferta(elencoPartite, indexSquadra);
					ModificaPartitePerseTrasferta(elencoPartite, indexSquadra);
					ModificaPartitePareggiateTrasferta(elencoPartite, indexSquadra);
				}
				break;
		}
	}
	
	public static void ModificaPartiteVinteCasa(ArrayList<Partite> elencoPartite, int indexSquadra) {
		Partite modPartite= elencoPartite.get(indexSquadra);
		Print.printModPartite_valorePartite(VinteOPerse.Vinte, CasaOTrasferta.Casa, modPartite, false, modPartite.getPartiteVinteCasa());
		int quantitaModifica= _scansione.quantitaModifica();
		modPartite.setPartiteVinteCasa(quantitaModifica);
		Print.printModPartite_valorePartite(VinteOPerse.Vinte, CasaOTrasferta.Casa, modPartite, true, modPartite.getPartiteVinteCasa());
	}
	public static void ModificaPartitePerseCasa(ArrayList<Partite> elencoPartite, int indexSquadra) {
		Partite modPartite= elencoPartite.get(indexSquadra);
		Print.printModPartite_valorePartite(VinteOPerse.Perse, CasaOTrasferta.Casa, modPartite, false, modPartite.getPartitePerseCasa());
		int quantitaModifica= _scansione.quantitaModifica();
		modPartite.setPartitePerseCasa(quantitaModifica);
		Print.printModPartite_valorePartite(VinteOPerse.Perse, CasaOTrasferta.Casa, modPartite, true, modPartite.getPartitePerseCasa());
	}
	public static void ModificaPartitePareggiateCasa(ArrayList<Partite> elencoPartite, int indexSquadra) {
		Partite modPartite= elencoPartite.get(indexSquadra);
		Print.printModPartite_valorePartite(VinteOPerse.Pareggiate, CasaOTrasferta.Casa, modPartite, false, modPartite.getPartitePareggiateCasa());
		int quantitaModifica= _scansione.quantitaModifica();
		modPartite.setPartitePerseCasa(quantitaModifica);
		Print.printModPartite_valorePartite(VinteOPerse.Pareggiate, CasaOTrasferta.Casa, modPartite, true, modPartite.getPartitePareggiateCasa());
	}
	public static void ModificaPartiteVinteTrasferta(ArrayList<Partite> elencoPartite, int indexSquadra) {
		Partite modPartite= elencoPartite.get(indexSquadra);
		Print.printModPartite_valorePartite(VinteOPerse.Vinte, CasaOTrasferta.Trasferta, modPartite, false, modPartite.getPartiteVinteTrasferta());
		int quantitaModifica= _scansione.quantitaModifica();
		modPartite.setPartitePerseCasa(quantitaModifica);
		Print.printModPartite_valorePartite(VinteOPerse.Vinte, CasaOTrasferta.Trasferta, modPartite, true, modPartite.getPartiteVinteTrasferta());
	}
	public static void ModificaPartitePerseTrasferta(ArrayList<Partite> elencoPartite, int indexSquadra) {
		Partite modPartite= elencoPartite.get(indexSquadra);
		Print.printModPartite_valorePartite(VinteOPerse.Perse, CasaOTrasferta.Trasferta, modPartite, false, modPartite.getPartitePerseTrasferta());
		int quantitaModifica= _scansione.quantitaModifica();
		modPartite.setPartitePerseCasa(quantitaModifica);
		Print.printModPartite_valorePartite(VinteOPerse.Perse, CasaOTrasferta.Trasferta, modPartite, true, modPartite.getPartitePerseTrasferta());
	}
	public static void ModificaPartitePareggiateTrasferta(ArrayList<Partite> elencoPartite, int indexSquadra) {
		Partite modPartite= elencoPartite.get(indexSquadra);
		Print.printModPartite_valorePartite(VinteOPerse.Pareggiate, CasaOTrasferta.Trasferta, modPartite, false, modPartite.getPartitePareggiateTrasferta());
		int quantitaModifica= _scansione.quantitaModifica();
		modPartite.setPartitePerseCasa(quantitaModifica);
		Print.printModPartite_valorePartite(VinteOPerse.Pareggiate, CasaOTrasferta.Trasferta, modPartite, true, modPartite.getPartitePareggiateTrasferta());
	}
	
}
