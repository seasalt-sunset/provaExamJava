package provaEsame2;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		String nomeSquadra;
		int pVinteCasa=0, pVinteTrasferta=0, pPareggiateCasa=0, pPareggiateTrasferta=0, pPerseCasa=0, pPerseTrasferta = 0;
		int golFattiCasa=0, golSubitiCasa=0, golFattiTrasferta=0, golSubitiTrasferta=0;
		int sceltaMenu, vinteOPerse, casaOTrasferta, fattiOSubiti;
		int quantitaModifica;
		int scelta;
		ArrayList <Squadra> listaSquadre = new ArrayList <>();
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Benvenuto in questo programma elettronico digitale!!!!!\n");
		System.out.println("Inserisci il nome della prima squadra da aggiungere:\n");
		nomeSquadra = scanner.nextLine();
		System.out.println("Inserisci il numero di partite VINTE in CASA:\n");
		pVinteCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di partite VINTE in TRASFERTA:\n");
		pVinteTrasferta = scanner.nextInt();
		System.out.println("Inserisci il numero di partite PAREGGIATE in CASA:\n");
		pPareggiateCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di partite PAREGGIATE in TRASFERTA:\n");
		pPareggiateTrasferta = scanner.nextInt();
		System.out.println("Inserisci il numero di partite PERSE in CASA:\n");
		pPerseCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di partite PERSE in TRASFERTA:\n");
		pPerseTrasferta = scanner.nextInt();
		System.out.println("Inserisci il numero di GOL FATTI in CASA:\n");
		golFattiCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di GOL FATTI in TRASFERTA:\n");
		golFattiTrasferta = scanner.nextInt();
		System.out.println("Inserisci il numero di GOL SUBITI in CASA:\n");
		golSubitiCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di GOL SUBITI in TRASFERTA:\n");
		golSubitiTrasferta = scanner.nextInt();
		scanner.nextLine();
		Squadra squadra = new Squadra(nomeSquadra, pVinteCasa, pVinteTrasferta, pPareggiateCasa, pPareggiateTrasferta, pPerseCasa, 
				pPerseTrasferta, golFattiCasa, golSubitiCasa, golFattiTrasferta, golSubitiTrasferta);
		listaSquadre.add(squadra);
		System.out.println("Squadra aggiunta!");
		
		
		do {
			System.out.println("MENU DI CAMPIONAPP!!!!!! FORZA BARI E ALCUNE SQUADRE?! SCEGLI TRA LE VARIE OPZIONI:\n"
					+ "1) Crea Nuova Squadra\n"
					+ "2)Modifica partite di una Squadra\n"
					+ "3)Modifica gol di una Squadra\n"
					+ "4)Visualizza punteggio di una Squadra\n"
					+ "5)Visualizza dettagli Squadra\n"
					+ "6)Visualizza Classifica\n"
					+ "7) Azzera Punteggio Squadre e inizia nuova stagione\n"
					+ "0) Esci");
			sceltaMenu= scanner.nextInt();
			scanner.nextLine();
			
			switch(sceltaMenu) {
			case 1:
				System.out.println("Inserisci il nome della squadra da aggiungere:\n");
				nomeSquadra = scanner.nextLine();
				System.out.println("Inserisci il numero di partite VINTE in CASA:\n");
				pVinteCasa = scanner.nextInt();
				System.out.println("Inserisci il numero di partite VINTE in TRASFERTA:\n");
				pVinteTrasferta = scanner.nextInt();
				System.out.println("Inserisci il numero di partite PAREGGIATE in CASA:\n");
				pPareggiateCasa = scanner.nextInt();
				System.out.println("Inserisci il numero di partite PAREGGIATE in TRASFERTA:\n");
				pPareggiateTrasferta = scanner.nextInt();
				System.out.println("Inserisci il numero di partite PERSE in CASA:\n");
				pPerseCasa = scanner.nextInt();
				System.out.println("Inserisci il numero di partite PERSE in TRASFERTA:\n");
				pPerseTrasferta = scanner.nextInt();
				System.out.println("Inserisci il numero di GOL FATTI in CASA:\n");
				golFattiCasa = scanner.nextInt();
				System.out.println("Inserisci il numero di GOL FATTI in TRASFERTA:\n");
				golFattiTrasferta = scanner.nextInt();
				System.out.println("Inserisci il numero di GOL SUBITI in CASA:\n");
				golSubitiCasa = scanner.nextInt();
				System.out.println("Inserisci il numero di GOL SUBITI in TRASFERTA:\n");
				golSubitiTrasferta = scanner.nextInt();
				scanner.nextLine();
				Squadra aggSquadra = new Squadra(nomeSquadra, pVinteCasa, pVinteTrasferta, pPareggiateCasa, pPareggiateTrasferta, pPerseCasa, 
						pPerseTrasferta, golFattiCasa, golSubitiCasa, golFattiTrasferta, golSubitiTrasferta);
				listaSquadre.add(aggSquadra);
				break;
			case 2:
				System.out.println("Scrivi il nome della Squadra di cui vuoi modificare le partite:\n");
				nomeSquadra = scanner.nextLine();
				squadra = TrovaSquadra(nomeSquadra, listaSquadre);
				if (nomeSquadra.equalsIgnoreCase(squadra.getNomeSquadra())) {
					System.out.println("Scegli tra le varie opzioni. Digita:\n"
							+ "1)Se vuoi cambiare il valore delle partite VINTE\n"
							+ "2)Se vuoi cambiare il valore delle partite PERSE\n"
							+ "3)se vuoi cambiare il valore delle partite PAREGGIATE\n"
							+ "4)se vuoi cambiarle TUTTE\n");
					vinteOPerse = scanner.nextInt();
					if (vinteOPerse==1 || vinteOPerse==4) {
						System.out.println("Vuoi cambiare il valore delle partite VINTE giocate in CASA (digita 1), in TRASFERTA (digita 2) o ENTRAMBE (digita 3)?\n");
						casaOTrasferta = scanner.nextInt();
						if (casaOTrasferta==1 || casaOTrasferta==3) {
							System.out.println("Il valore delle partite VINTE giocate in CASA da " +squadra.getNomeSquadra() + " e' " +squadra.getPartiteVinteCasa() + ".\n"
									+ "Vuoi aggiungere partite (digita 1) o toglierne (digita 0)?\n");
							scelta = scanner.nextInt();
							System.out.println("Digitare la quantità da aggiungere/rimuovere (senza il simbolo -)\n");
							quantitaModifica = scanner.nextInt();
							System.out.println("Il valore delle partite VINTE giocate in CASA da " +squadra.getNomeSquadra() + " e' ora " +squadra.setPartiteVinteCasa(quantitaModifica, scelta) +".\n");
							
						}
						if (casaOTrasferta==2 || casaOTrasferta==3) {
							System.out.println("Il valore delle partite VINTE giocate in TRASFERTA da " +squadra.getNomeSquadra() + " e' " +squadra.getPartiteVinteTrasferta() +".\n"
									+ "Vuoi aggiungere partite (digita 1) o toglierne (digita 0)?\n");
							scelta = scanner.nextInt();
							System.out.println("Digitare la quantità da aggiungere/rimuovere (senza il simbolo - )\n");
							quantitaModifica = scanner.nextInt();
							System.out.println("Il valore delle partite VINTE giocate in TRASFERTA da " +squadra.getNomeSquadra() + " e' ora " +squadra.setPartiteVinteTrasferta(quantitaModifica, scelta) +".\n");
							
						}
						
					}
					if (vinteOPerse==2 || vinteOPerse==4) {
						System.out.println("Vuoi cambiare il valore delle partite PERSE giocate in CASA (digita 1), in TRASFERTA (digita 2) o ENTRAMBE (digita 3)?\n");
						casaOTrasferta = scanner.nextInt();
						if (casaOTrasferta==1 || casaOTrasferta==3) {
							System.out.println("Il valore delle partite PERSE giocate in CASA da " +squadra.getNomeSquadra() + " e' " +squadra.getPartitePerseCasa() + ".\n"
									+ "Vuoi aggiungere partite (digita 1) o toglierne (digita 0)?\n");
							scelta = scanner.nextInt();
							System.out.println("Digitare la quantità da aggiungere/rimuovere (senza il simbolo -)\n");
							quantitaModifica = scanner.nextInt();
							System.out.println("Il valore delle partite PERSE giocate in CASA da " +squadra.getNomeSquadra() + " e' ora " +squadra.setPartitePerseCasa(quantitaModifica, scelta) +".\n");
							
							}
					if (casaOTrasferta==2 || casaOTrasferta==3) {
							System.out.println("Il valore delle partite PERSE giocate in TRASFERTA da " +squadra.getNomeSquadra() + " e' " +squadra.getPartitePerseTrasferta() +".\n"
									+ "Vuoi aggiungere partite (digita 1) o toglierne (digita 0)?\n");
							scelta = scanner.nextInt();
							System.out.println("Digitare la quantità da aggiungere/rimuovere (senza il simbolo - )\n");
							quantitaModifica = scanner.nextInt();
							System.out.println("Il valore delle partite PERSE giocate in TRASFERTA da " +squadra.getNomeSquadra() + " e' ora " +squadra.setPartitePerseTrasferta(quantitaModifica, scelta) +".\n");
							
						
					}
					if (vinteOPerse==3 || vinteOPerse==4) {
						System.out.println("Vuoi cambiare il valore delle partite PAREGGIATE giocate in CASA (digita 1), in TRASFERTA (digita 2) o ENTRAMBE (digita 3)?\n");
						casaOTrasferta = scanner.nextInt();
						if (casaOTrasferta==1 || casaOTrasferta==3) {
							System.out.println("Il valore delle partite PAREGGIATE giocate in CASA da " +squadra.getNomeSquadra() + " e' " +squadra.getPartitePareggiateCasa() + ".\n"
									+ "Vuoi aggiungere partite (digita 1) o toglierne (digita 0)?\n");
							scelta = scanner.nextInt();
							System.out.println("Digitare la quantità da aggiungere/rimuovere (senza il simbolo -)\n");
							quantitaModifica = scanner.nextInt();
							System.out.println("Il valore delle partite PAREGGIATE giocate in CASA da " +squadra.getNomeSquadra() + " e' ora " +squadra.setPartitePareggiateCasa(quantitaModifica, scelta) +".\n");
							
						}
						if (casaOTrasferta==2 || casaOTrasferta==3) {
							System.out.println("Il valore delle partite PAREGGIATE giocate in TRASFERTA da " +squadra.getNomeSquadra() + " e' " +squadra.getPartitePareggiateTrasferta() +".\n"
									+ "Vuoi aggiungere partite (digita 1) o toglierne (digita 0)?\n");
							scelta = scanner.nextInt();
							System.out.println("Digitare la quantità da aggiungere/rimuovere (senza il simbolo - )\n");
							quantitaModifica = scanner.nextInt();
							System.out.println("Il valore delle partite PAREGGIATE giocate in TRASFERTA da " +squadra.getNomeSquadra() + " e' ora " +squadra.setPartitePareggiateTrasferta(quantitaModifica, scelta) +".\n");
							
						}
						
					}					
				} else {
					System.out.println("Nessuna squadra trovata.");					
				}
			}
			break;
				
			case 3:
				System.out.println("Scrivi il nome della Squadra di cui vuoi modificare i gol:\n");
				nomeSquadra = scanner.nextLine();
				squadra = TrovaSquadra(nomeSquadra, listaSquadre);
				if (nomeSquadra == squadra.getNomeSquadra()) {
					System.out.println("Scegli tra le varie opzioni. Digita:\n"
							+ "1)Se vuoi cambiare il valore dei gol FATTI\n"
							+ "2)Se vuoi cambiare il valore dei gol SUBITI\n");
					fattiOSubiti= scanner.nextInt();
					System.out.println("Digita:\n"
							+ "1) Se vuoi cambiare il valore dei gol nelle partite giocate in CASA\n"
							+ "2) Se vuoi cambiare il valore dei gol nelle partite giocate in TRASFERTA\n");
					casaOTrasferta= scanner.nextInt();
					System.out.println("Digita:"
							+ "1) Se vuoi aggiungere gol\n"
							+ "0) Se vuoi togliere gol");
					scelta= scanner.nextInt();
					switch (fattiOSubiti + "-" + casaOTrasferta + "-") {
						case "1-1":
							System.out.println("I gol FATTI in CASA da " + squadra.getNomeSquadra() +" sono " + squadra.getGolFattiCasa() + ".\n"
									+ "Quanti gol vuoi aggiungere/togliere? (scrivi il numero senza il simbolo -)");
							quantitaModifica= scanner.nextInt();
							System.out.println("Modifica apportata. I gol FATTI in CASA da " + squadra.getNomeSquadra() +" sono ora " + squadra.setGolFattiCasa(quantitaModifica, scelta) + ".\n");
							break;
							
						case "1-2":
							System.out.println("I gol FATTI in TRASFERTA da " + squadra.getNomeSquadra() +" sono " + squadra.getGolFattiTrasferta() + ".\n"
									+ "Quanti gol vuoi aggiungere/togliere? (scrivi il numero senza il simbolo -)");
							quantitaModifica= scanner.nextInt();
							System.out.println("Modifica apportata. I gol FATTI in TRASFERTA da " + squadra.getNomeSquadra() +" sono ora " + squadra.setGolFattiTrasferta(quantitaModifica, scelta) + ".\n");
							break;
						case "2-1":
							System.out.println("I gol SUBITI in CASA da " + squadra.getNomeSquadra() +" sono " + squadra.getGolSubitiCasa() + ".\n"
									+ "Quanti gol vuoi aggiungere/togliere? (scrivi il numero senza il simbolo -)");
							quantitaModifica= scanner.nextInt();
							System.out.println("Modifica apportata. I gol SUBITI in CASA da " + squadra.getNomeSquadra() +" sono ora " + squadra.setGolSubitiCasa(quantitaModifica, scelta) + ".\n");
							break;
						case "2-2":
							System.out.println("I gol SUBITI in TRASFERTA da " + squadra.getNomeSquadra() +" sono " + squadra.getGolSubitiTrasferta() + ".\n"
									+ "Quanti gol vuoi aggiungere/togliere? (scrivi il numero senza il simbolo -)");
							quantitaModifica= scanner.nextInt();
							System.out.println("Modifica apportata. I gol SUBITI in TRASFERTA da " + squadra.getNomeSquadra() +" sono ora " + squadra.setGolSubitiTrasferta(quantitaModifica, scelta) + ".\n");
							break;
					}
				}
				
				break;
			case 4:
				System.out.println("Scrivi il nome della Squadra di cui vuoi visualizzare i punti:\n");
				nomeSquadra = scanner.nextLine();
				squadra = TrovaSquadra(nomeSquadra, listaSquadre);
				if (nomeSquadra == squadra.getNomeSquadra()) {
					System.out.println("I punti totalizzati da " + squadra.getNomeSquadra() + "sono " + squadra.getPunti()+".\n"
							+ "La media inglese e' " + squadra.getMediaInglese());
				}
				else {
					System.out.println("Squadra non trovata");
				}
				break;
			case 5:
				System.out.println("Scrivi il nome della Squadra di cui vuoi visualizzare i dettagli:\n");
				nomeSquadra = scanner.nextLine();
				squadra = TrovaSquadra(nomeSquadra, listaSquadre);
				if (nomeSquadra == squadra.getNomeSquadra()) {
					squadra.visualizzaDettagli();
				}
				else {
					System.out.println("Squadra non trovata");
				}
				break;
			case 6:
				break;
			case 7:
				break;
			case 0:
				break;
			default:
				System.out.println("Input non corretto! Testa di cazzo!!! Riprova!!!!!!");
				break;
			}
			
		} while(sceltaMenu!=0);
	}
		
		
	
	public static Squadra TrovaSquadra(String nome, ArrayList <Squadra> elencoSquadre) {
		for(int i=0; i<elencoSquadre.size(); i++) {
			if(elencoSquadre.get(i).getNomeSquadra().equalsIgnoreCase(nome)) {
				return elencoSquadre.get(i);
			}
		}
		System.out.println("Nessuna squadra trovata");
		return null;
	}
	
	public static void Classifica(ArrayList<Squadra>listaSquadre) {
		ArrayList<Integer> listaPunti = new ArrayList<>();
		ArrayList<Integer> listaMediaInglese = new ArrayList<>();
		ArrayList<Squadra> classifica = new ArrayList<>();
		ArrayList<Integer> daAggiungere = new ArrayList<>();
		int maxPunti=0, maxMediaInglese=0;
		for(Squadra i:listaSquadre) {
			listaPunti.add(i.getPunti());
		}
		
		for(int i=0; i<listaPunti.size(); i++) {
			daAggiungere.set(i, 1);
		}
		
		for(int i=0; i<listaPunti.size(); i++) {
			
			for(int a=0; a<listaPunti.size(); a++) {
				if(listaPunti.get(a)>maxPunti) {
					maxPunti= listaPunti.get(a);
				}
			}
			
			for(int b=0; b<listaPunti.size(); b++) {
				if(listaPunti.get(b) == maxPunti && daAggiungere.get(b)==1) {
					classifica.add(listaSquadre.get(b));
					listaPunti.set(b, -100);
					daAggiungere.set(b, 0);
				}			
				
			}
		}
		
		for(int i=0; i < classifica.size(); i++) {
			System.out.println("CLASSIFICA:\n"
					+ i + " - "+ classifica.get(i).getNomeSquadra() + " ----- PUNTI: " +  classifica.get(i).getPunti() + " - PARTITE VINTE: " + classifica.get(i).getPartiteVinte() + " - PARTITE PAREGGIATE: " + classifica.get(i).getPartitePareggiate()
					+ " - PARTITE PERSE: " + classifica.get(i).getPartitePerse());
		}
		
		
		for(Squadra i:listaSquadre) {
			listaMediaInglese.add(i.getMediaInglese());
		}
		for(int i=0; i<listaMediaInglese.size(); i++) {
			if(listaMediaInglese.get(i)>maxMediaInglese) {
				maxMediaInglese= listaMediaInglese.get(i);
			}
		}
		
		
	}

}
