package provaEsame2;
import java.lang.String;
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
	
	public static void VisualizzaDettagli(ArrayList <Squadra> elencoSquadre, ArrayList <Partite> elencoPartite, ArrayList <Gol> elencoGol) {
		int indexSquadra;
		String nomeSquadra;
		do{
			nomeSquadra= _scansione.visualizzaDettagli_nomeSquadra();
			if(nomeSquadra.equalsIgnoreCase("menu")) {
				return;
			}
			indexSquadra = trovaIndexSquadra(nomeSquadra, elencoSquadre);
			if (indexSquadra==(-1)) {
				System.out.println("Nessuna squadra trovata.");
			}
		} while (indexSquadra==(-1));
		
		Partite partite = elencoPartite.get(indexSquadra);
		Gol gol = elencoGol.get(indexSquadra);
		
		Print.printVisualizzaDettagli(partite, gol, nomeSquadra);
	}
	
	public static void Classifica(ArrayList <Partite> elencoPartite) {
		int scelta;
		scelta=_scansione.classifica_tipologiaClassifica();
		switch (scelta) {
			case 1:
				ClassificaNormale(elencoPartite);
				break;
			case 2:
				ClassificaMediaInglese(elencoPartite);
				break;
			case 3:
				ClassificaNormale(elencoPartite);
				ClassificaMediaInglese(elencoPartite);
				break;
		}
	}
	
	
	public static void ClassificaNormale(ArrayList <Partite> elencoPartite) {
		ArrayList<Integer> listaPunti = new ArrayList<>();
		ArrayList<Partite> classifica = new ArrayList<>();
		ArrayList<Boolean> daAggiungere = new ArrayList<>();
		int maxPunti=-1000000;
		for(Partite i:elencoPartite) {
			listaPunti.add(i.getPunti());
		}

		for(int i=0; i<listaPunti.size(); i++) {
			daAggiungere.add(true);
		}
		
		int size = listaPunti.size();
		
		for(int i=0; i<size; i++) {
			
			for(int a=0; a<size; a++) {
				if(listaPunti.get(a)>maxPunti) {
					maxPunti= listaPunti.get(a);
				}
			}
			
			for(int b=0; b<size; b++) {
				if(listaPunti.get(b) == maxPunti && daAggiungere.get(b)==true) {
					classifica.add(elencoPartite.get(b));
					listaPunti.set(b, -100);
					daAggiungere.set(b, false);
					maxPunti=-10000000;
				}			
				
			}
		}
		System.out.println("CLASSIFICA SECONDO PUNTEGGIO NORMALE:\n\n");

		for(int i=0; i < classifica.size(); i++) {
			System.out.println((i+1) + " - "+ classifica.get(i).getNomeSquadra() + " ----- PUNTI: " +  classifica.get(i).getPunti() + " - PARTITE VINTE: " + classifica.get(i).getPartiteVinte() + " - PARTITE PAREGGIATE: " + classifica.get(i).getPartitePareggiate()
					+ " - PARTITE PERSE: " + classifica.get(i).getPartitePerse());
		}
		System.out.println("\n\n");
		return;
		
	}
	
	public static void ClassificaMediaInglese(ArrayList<Partite>elencoPartite) {
		ArrayList<Integer> listaMediaInglese = new ArrayList<>();
		ArrayList<Partite> classifica = new ArrayList<>();
		ArrayList<Boolean> daAggiungere = new ArrayList<>();
		int maxMediaInglese=-1000000;
		for(Partite i:elencoPartite) {
			listaMediaInglese.add(i.getMediaInglese());
		}
		
		for(int i=0; i<listaMediaInglese.size(); i++) {
			daAggiungere.add(true);
		}
		
		for(int i=0; i<listaMediaInglese.size(); i++) {
			
			for(int a=0; a<listaMediaInglese.size(); a++) {
				if(listaMediaInglese.get(a)>maxMediaInglese) {
					maxMediaInglese= listaMediaInglese.get(a);
				}
			}
			
			for(int b=0; b<listaMediaInglese.size(); b++) {
				if(listaMediaInglese.get(b) == maxMediaInglese && daAggiungere.get(b)==true) {
					classifica.add(elencoPartite.get(b));
					listaMediaInglese.set(b, -10000);
					daAggiungere.set(b, false);
					maxMediaInglese=-10000000;
				}			
				
			}
		}
		System.out.println("CLASSIFICA SECONDO MEDIA INGLESE:\n\n");
		for(int i=0; i < classifica.size(); i++) {
			System.out.println(""
					+ (i+1) + " - "+ classifica.get(i).getNomeSquadra() + " ----- PUNTI (SECONDO MEDIA INGLESE): " +  classifica.get(i).getMediaInglese() + " - PARTITE VINTE: " + classifica.get(i).getPartiteVinte() + " - PARTITE PAREGGIATE: " + classifica.get(i).getPartitePareggiate()
					+ " - PARTITE PERSE: " + classifica.get(i).getPartitePerse());
		}
		System.out.println("\n\n");
		return;
	}

	public static void azzeraPunteggio(ArrayList <Partite> elencoPartite, ArrayList <Gol> elencoGol) {
		String scelta;
		scelta=_scansione.azzeraPunteggio();
		
		if (scelta.equalsIgnoreCase("si") || scelta.equalsIgnoreCase("sì")) {
			for (int i=0; i<elencoPartite.size(); i++) {
				elencoPartite.get(i).azzeraPartite();
				elencoGol.get(i).azzeraGol();
			}
			Print.printAzzeraPunteggio_cancellazioneAvvenuta();
			return;
		} else {
			Print.printAzzeraPunteggio_operazioneAnnullata();
			return;
		}
	}
}
