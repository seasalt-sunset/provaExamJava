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
	
	public static void ModificaPartite(ArrayList <Partite> elencoPartite, ArrayList <Squadra> elencoSquadre) {
		boolean casa, trasferta;
		casa=false; trasferta=false;
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
					if (casaOTrasferta=="Casa" || casaOTrasferta=="Entrambe") {
						ModificaPartiteVinteCasa(elencoPartite, indexSquadra);
					}
					if (casaOTrasferta=="Trasferta" || casaOTrasferta=="Entrambe") {
						ModificaPartiteVinteTrasferta(elencoPartite, indexSquadra);
					}
				break;
			case Perse:
				if (casaOTrasferta=="Casa" || casaOTrasferta=="Entrambe") {
					ModificaPartitePerseCasa(elencoPartite, indexSquadra);
				}
				if (casaOTrasferta=="Trasferta" || casaOTrasferta=="Entrambe") {
					ModificaPartitePerseTrasferta(elencoPartite, indexSquadra);
				}
				break;
			case Pareggiate:
				if (casaOTrasferta=="Casa" || casaOTrasferta=="Entrambe") {
					ModificaPartitePareggiateCasa(elencoPartite, indexSquadra);
				}
				if (casaOTrasferta=="Trasferta" || casaOTrasferta=="Entrambe") {
					ModificaPartitePareggiateTrasferta(elencoPartite, indexSquadra);
				}
				break;
			case Tutte:
				if (casaOTrasferta=="Casa" || casaOTrasferta=="Entrambe") {
					ModificaPartiteVinteCasa(elencoPartite, indexSquadra);
					ModificaPartitePerseCasa(elencoPartite, indexSquadra);
					ModificaPartitePareggiateCasa(elencoPartite, indexSquadra);
				}
				if (casaOTrasferta=="Trasferta" || casaOTrasferta=="Entrambe") {
					ModificaPartiteVinteTrasferta(elencoPartite, indexSquadra);
					ModificaPartitePerseTrasferta(elencoPartite, indexSquadra);
					ModificaPartitePareggiateTrasferta(elencoPartite, indexSquadra);
				}
				break;
		}
	}
	
	public static void ModificaPartiteVinteCasa(ArrayList<Partite> elencoPartite, int indexSquadra) {
		
		Partite modPartite= elencoPartite.get(indexSquadra);
		System.out.println("Il valore delle partite VINTE giocate in CASA da " +modPartite.getNomeSquadra() + " e' " +modPartite.getPartiteVinteCasa() + ".\n"
				+ "Digitare la quantità da aggiungere/rimuovere (se devi rimuoverne inserisci il segno -)\n");
		int quantitaModifica = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Il valore delle partite VINTE giocate in CASA da " +modPartite.getNomeSquadra() + " e' ora " +modPartite.setPartiteVinteCasa(quantitaModifica) +".\n");
	}
	public static void ModificaPartitePerseCasa(ArrayList<Partite> elencoPartite, int indexSquadra) {
		Partite modPartite= elencoPartite.get(indexSquadra);
		System.out.println("Il valore delle partite PERSE giocate in CASA da " +modPartite.getNomeSquadra() + " e' " +modPartite.getPartitePerseCasa() + ".\n"
				+ "Digitare la quantità da aggiungere/rimuovere (se devi rimuoverne inserisci il segno -)\n");
		int quantitaModifica = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Il valore delle partite PERSE giocate in CASA da " +modPartite.getNomeSquadra() + " e' ora " +modPartite.setPartitePerseCasa(quantitaModifica) +".\n");
		
	}
	public static void ModificaPartitePareggiateCasa(ArrayList<Partite> elencoPartite, int indexSquadra) {
		Partite modPartite= elencoPartite.get(indexSquadra);
		System.out.println("Il valore delle partite PAREGGIATE giocate in CASA da " +modPartite.getNomeSquadra() + " e' " +modPartite.getPartitePareggiateCasa() + ".\n"
			+ "Digitare la quantità da aggiungere/rimuovere (se devi rimuoverne inserisci il segno -)\n");
		int quantitaModifica = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Il valore delle partite PAREGGIATE giocate in CASA da " +modPartite.getNomeSquadra() + " e' ora " +modPartite.setPartitePareggiateCasa(quantitaModifica) +".\n");

	}
	public static void ModificaPartiteVinteTrasferta(ArrayList<Partite> elencoPartite, int indexSquadra) {
		Partite modPartite= elencoPartite.get(indexSquadra);
		System.out.println("Il valore delle partite VINTE giocate in TRASFERTA da " +modPartite.getNomeSquadra() + " e' " +modPartite.getPartiteVinteTrasferta() +".\n"
				+ "Digitare la quantità da aggiungere/rimuovere (se devi rimuoverne inserisci il segno -)\n");
		int quantitaModifica = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Il valore delle partite VINTE giocate in TRASFERTA da " +modPartite.getNomeSquadra() + " e' ora " +modPartite.setPartiteVinteTrasferta(quantitaModifica) +".\n");
		
	}
	public static void ModificaPartitePerseTrasferta(ArrayList<Partite> elencoPartite, int indexSquadra) {
		Partite modPartite= elencoPartite.get(indexSquadra);
		System.out.println("Il valore delle partite PERSE giocate in TRASFERTA da " +modPartite.getNomeSquadra() + " e' " +modPartite.getPartitePerseTrasferta() +".\n"
				+ "Digitare la quantità da aggiungere/rimuovere (se devi rimuoverne inserisci il segno -)\n");
		int quantitaModifica = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Il valore delle partite PERSE giocate in TRASFERTA da " +modPartite.getNomeSquadra() + " e' ora " +modPartite.setPartitePerseTrasferta(quantitaModifica) +".\n");
	}
	public static void ModificaPartitePareggiateTrasferta(ArrayList<Partite> elencoPartite, int indexSquadra) {
		Partite modPartite= elencoPartite.get(indexSquadra);
		System.out.println("Il valore delle partite PAREGGIATE giocate in TRASFERTA da " +modPartite.getNomeSquadra() + " e' " +modPartite.getPartitePareggiateTrasferta() +".\n"
				+ "Digitare la quantità da aggiungere/rimuovere (se devi rimuoverne inserisci il segno -)\n");
		int quantitaModifica = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Il valore delle partite PAREGGIATE giocate in TRASFERTA da " +modPartite.getNomeSquadra() + " e' ora " +modPartite.setPartitePareggiateTrasferta(quantitaModifica) +".\n");
	}
	
}
