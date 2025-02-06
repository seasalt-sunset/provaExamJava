package provaEsame2;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		int sceltaMenu;
		ArrayList <Squadra> listaSquadre = new ArrayList <>();
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Benvenuto in questo programma elettronico digitale!!!!!\n");
		AggiungiSquadra(listaSquadre, scanner);
		
		do {
			System.out.println("MENU DI CAMPIONAPP!!! FORZA BARI E ALCUNE SQUADRE?! SCEGLI TRA LE VARIE OPZIONI:\n"
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
				AggiungiSquadra(listaSquadre, scanner);
				break;
			case 2:
				ModificaPartite(listaSquadre, scanner);
			break;
				
			case 3:
				ModificaGol(listaSquadre, scanner);
				break;
			case 4:
				VisualizzaPunti(listaSquadre, scanner);
				break;
			case 5:
				VisualizzaDettagli(listaSquadre, scanner);
				break;
			case 6:
				Classifica(listaSquadre, scanner);
				break;
			case 7:
				AzzeraPunteggio(listaSquadre, scanner);
				break;
			case 0:
				System.out.println("Uscita in corso...");
				break;
			default:
				System.out.println("Input non corretto!!! Riprova!!!");
				break;
			}
			
		} while(sceltaMenu!=0);
		scanner.close();
	}
		
		
	
	public static Squadra TrovaSquadra(String nome, ArrayList <Squadra> elencoSquadre) {
		for(int i=0; i<elencoSquadre.size(); i++) {
			if(elencoSquadre.get(i).getNomeSquadra().equalsIgnoreCase(nome)) {
				return elencoSquadre.get(i);
			}
		}
		return null;
	}
	
	public static void AggiungiSquadra(ArrayList <Squadra> elencoSquadre, Scanner scanner) {
		System.out.println("Inserisci il nome della squadra da aggiungere:\n");
		String nomeSquadra = scanner.nextLine();
		System.out.println("Inserisci il numero di partite VINTE in CASA:\n");
		int pVinteCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di partite VINTE in TRASFERTA:\n");
		int pVinteTrasferta = scanner.nextInt();
		System.out.println("Inserisci il numero di partite PAREGGIATE in CASA:\n");
		int pPareggiateCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di partite PAREGGIATE in TRASFERTA:\n");
		int pPareggiateTrasferta = scanner.nextInt();
		System.out.println("Inserisci il numero di partite PERSE in CASA:\n");
		int pPerseCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di partite PERSE in TRASFERTA:\n");
		int pPerseTrasferta = scanner.nextInt();
		System.out.println("Inserisci il numero di GOL FATTI in CASA:\n");
		int golFattiCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di GOL FATTI in TRASFERTA:\n");
		int golFattiTrasferta = scanner.nextInt();
		System.out.println("Inserisci il numero di GOL SUBITI in CASA:\n");
		int golSubitiCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di GOL SUBITI in TRASFERTA:\n");
		int golSubitiTrasferta = scanner.nextInt();
		scanner.nextLine();
		Squadra aggSquadra = new Squadra(nomeSquadra, pVinteCasa, pVinteTrasferta, pPareggiateCasa, pPareggiateTrasferta, pPerseCasa, 
				pPerseTrasferta, golFattiCasa, golSubitiCasa, golFattiTrasferta, golSubitiTrasferta);
		elencoSquadre.add(aggSquadra);
		System.out.println("Squadra aggiunta!");
	}
	
	
	public static void ModificaPartite(ArrayList <Squadra> elencoSquadre, Scanner scanner) {
		boolean casa, trasferta;
		casa=false; trasferta=false;
		int casaOTrasferta, vinteOPerse;
		Squadra squadra;
		do {
			System.out.println("Scrivi il nome della Squadra di cui vuoi modificare le partite.\nScrivi 'menu' per tornare al menu principale\n");
			String nomeSquadra = scanner.nextLine();
			if(nomeSquadra.equalsIgnoreCase("menu")) {
				return;
			}
			squadra = TrovaSquadra(nomeSquadra, elencoSquadre);
			if (squadra==null) {
				System.out.println("Nessuna squadra trovata.");
			}
		} while (squadra==null);
		
		do {
			System.out.println("Vuoi cambiare il valore delle partite giocate in CASA (digita 1), in TRASFERTA (digita 2) o ENTRAMBE (digita 3)?\n");
			casaOTrasferta = scanner.nextInt();
			switch(casaOTrasferta) {
			case 1: 
				casa=true;
				break;
			case 2:
				trasferta=true;
				break;
			case 3:
				casa=true;
				trasferta=true;
				break;
			default:
				System.out.println("Valore inserito non corretto.");
				break;
			}
		} while(casaOTrasferta<1 && casaOTrasferta>3);
		do {
			System.out.println("Scegli tra le varie opzioni. Digita:\n"
					+ "1)Se vuoi cambiare il valore delle partite VINTE\n"
					+ "2)Se vuoi cambiare il valore delle partite PERSE\n"
					+ "3)se vuoi cambiare il valore delle partite PAREGGIATE\n"
					+ "4)se vuoi cambiarle TUTTE\n");
			vinteOPerse = scanner.nextInt();
			if (vinteOPerse<1 || vinteOPerse>4) {
					System.out.println("Valore inserito non corretto.");
			}
			} while (vinteOPerse<1 && vinteOPerse>4); 
		
		switch (vinteOPerse) {
			case 1:
					if (casa==true) {
						ModificaPartiteVinteCasa(squadra, scanner);
					}
					if (trasferta==true) {
						ModificaPartiteVinteTrasferta(squadra, scanner);
					}
				break;
			case 2:
				if (casa==true) {
					ModificaPartitePerseCasa(squadra, scanner);
				}
				if (trasferta==true) {
					ModificaPartitePerseTrasferta(squadra, scanner);
				}
				break;
			case 3:
				if (casa==true) {
					ModificaPartitePareggiateCasa(squadra, scanner);
				}
				if (trasferta==true) {
					ModificaPartitePareggiateTrasferta(squadra, scanner);
				}
				break;
			case 4:
				if (casa==true) {
					ModificaPartiteVinteCasa(squadra, scanner);
					ModificaPartitePerseCasa(squadra, scanner);
					ModificaPartitePareggiateCasa(squadra, scanner);
				}
				if (trasferta==true) {
					ModificaPartiteVinteTrasferta(squadra, scanner);
					ModificaPartitePerseTrasferta(squadra, scanner);
					ModificaPartitePareggiateTrasferta(squadra, scanner);
				}
				break;
		}
	}
	
	
	
	public static void ModificaPartiteVinteCasa(Squadra squadra, Scanner scanner) {
		System.out.println("Il valore delle partite VINTE giocate in CASA da " +squadra.getNomeSquadra() + " e' " +squadra.getPartiteVinteCasa() + ".\n"
				+ "Digitare la quantità da aggiungere/rimuovere (se devi rimuoverne inserisci il segno -)\n");
		int quantitaModifica = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Il valore delle partite VINTE giocate in CASA da " +squadra.getNomeSquadra() + " e' ora " +squadra.setPartiteVinteCasa(quantitaModifica) +".\n");
	}
	public static void ModificaPartitePerseCasa(Squadra squadra, Scanner scanner) {
		System.out.println("Il valore delle partite PERSE giocate in CASA da " +squadra.getNomeSquadra() + " e' " +squadra.getPartitePerseCasa() + ".\n"
				+ "Digitare la quantità da aggiungere/rimuovere (se devi rimuoverne inserisci il segno -)\n");
		int quantitaModifica = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Il valore delle partite PERSE giocate in CASA da " +squadra.getNomeSquadra() + " e' ora " +squadra.setPartitePerseCasa(quantitaModifica) +".\n");
		
	}
	public static void ModificaPartitePareggiateCasa(Squadra squadra, Scanner scanner) {
		System.out.println("Il valore delle partite PAREGGIATE giocate in CASA da " +squadra.getNomeSquadra() + " e' " +squadra.getPartitePareggiateCasa() + ".\n"
			+ "Digitare la quantità da aggiungere/rimuovere (se devi rimuoverne inserisci il segno -)\n");
		int quantitaModifica = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Il valore delle partite PAREGGIATE giocate in CASA da " +squadra.getNomeSquadra() + " e' ora " +squadra.setPartitePareggiateCasa(quantitaModifica) +".\n");

	}
	public static void ModificaPartiteVinteTrasferta(Squadra squadra, Scanner scanner) {
		System.out.println("Il valore delle partite VINTE giocate in TRASFERTA da " +squadra.getNomeSquadra() + " e' " +squadra.getPartiteVinteTrasferta() +".\n"
				+ "Digitare la quantità da aggiungere/rimuovere (se devi rimuoverne inserisci il segno -)\n");
		int quantitaModifica = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Il valore delle partite VINTE giocate in TRASFERTA da " +squadra.getNomeSquadra() + " e' ora " +squadra.setPartiteVinteTrasferta(quantitaModifica) +".\n");
		
	}
	public static void ModificaPartitePerseTrasferta(Squadra squadra, Scanner scanner) {
		System.out.println("Il valore delle partite PERSE giocate in TRASFERTA da " +squadra.getNomeSquadra() + " e' " +squadra.getPartitePerseTrasferta() +".\n"
				+ "Digitare la quantità da aggiungere/rimuovere (se devi rimuoverne inserisci il segno -)\n");
		int quantitaModifica = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Il valore delle partite PERSE giocate in TRASFERTA da " +squadra.getNomeSquadra() + " e' ora " +squadra.setPartitePerseTrasferta(quantitaModifica) +".\n");
	}
	public static void ModificaPartitePareggiateTrasferta(Squadra squadra, Scanner scanner) {
		System.out.println("Il valore delle partite PAREGGIATE giocate in TRASFERTA da " +squadra.getNomeSquadra() + " e' " +squadra.getPartitePareggiateTrasferta() +".\n"
				+ "Digitare la quantità da aggiungere/rimuovere (se devi rimuoverne inserisci il segno -)\n");
		int quantitaModifica = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Il valore delle partite PAREGGIATE giocate in TRASFERTA da " +squadra.getNomeSquadra() + " e' ora " +squadra.setPartitePareggiateTrasferta(quantitaModifica) +".\n");
	}
	
	
	public static void ModificaGol(ArrayList <Squadra> elencoSquadre, Scanner scanner) {
		int fattiOSubiti, casaOTrasferta, quantitaModifica;
		Squadra squadra;
		do {
			System.out.println("Scrivi il nome della Squadra di cui vuoi modificare i gol:\n");
			String nomeSquadra = scanner.nextLine();
			if(nomeSquadra.equalsIgnoreCase("menu")) {
				return;
			}
			squadra = TrovaSquadra(nomeSquadra, elencoSquadre);
			if (squadra==null) {
				System.out.println("Nessuna squadra trovata.");
			}
		} while (squadra==null);
		
		do {
			System.out.println("Scegli tra le varie opzioni. Digita:\n"
				+ "1)Se vuoi cambiare il valore dei gol FATTI\n"
				+ "2)Se vuoi cambiare il valore dei gol SUBITI\n");
		fattiOSubiti= scanner.nextInt();
		if(fattiOSubiti!=1 && fattiOSubiti!=2) {
			System.out.println("Input errato!");
		}
		} while (fattiOSubiti!=1 && fattiOSubiti!=2);
		
		do {
			System.out.println("Digita:\n"
					+ "1) Se vuoi cambiare il valore dei gol nelle partite giocate in CASA\n"
					+ "2) Se vuoi cambiare il valore dei gol nelle partite giocate in TRASFERTA\n");
			casaOTrasferta= scanner.nextInt();
			scanner.nextLine();
			if(casaOTrasferta!=1 && casaOTrasferta!=2) {
				System.out.println("Input errato!");
			}
		} while (casaOTrasferta!=1 && casaOTrasferta!=2);
		
		switch (fattiOSubiti + "-" + casaOTrasferta) {
			case "1-1":
				System.out.println("I gol FATTI in CASA da " + squadra.getNomeSquadra() +" sono " + squadra.getGolFattiCasa() + ".\n"
						+ "Quanti gol vuoi aggiungere/togliere? (scrivi il numero senza il simbolo -)");
				quantitaModifica= scanner.nextInt();
				System.out.println("Modifica apportata. I gol FATTI in CASA da " + squadra.getNomeSquadra() +" sono ora " + squadra.setGolFattiCasa(quantitaModifica) + ".\n");
				break;
				
			case "1-2":
				System.out.println("I gol FATTI in TRASFERTA da " + squadra.getNomeSquadra() +" sono " + squadra.getGolFattiTrasferta() + ".\n"
						+ "Quanti gol vuoi aggiungere/togliere? (scrivi il numero senza il simbolo -)");
				quantitaModifica= scanner.nextInt();
				System.out.println("Modifica apportata. I gol FATTI in TRASFERTA da " + squadra.getNomeSquadra() +" sono ora " + squadra.setGolFattiTrasferta(quantitaModifica) + ".\n");
				break;
			case "2-1":
				System.out.println("I gol SUBITI in CASA da " + squadra.getNomeSquadra() +" sono " + squadra.getGolSubitiCasa() + ".\n"
						+ "Quanti gol vuoi aggiungere/togliere? (scrivi il numero senza il simbolo -)");
				quantitaModifica= scanner.nextInt();
				System.out.println("Modifica apportata. I gol SUBITI in CASA da " + squadra.getNomeSquadra() +" sono ora " + squadra.setGolSubitiCasa(quantitaModifica) + ".\n");
				break;
			case "2-2":
				System.out.println("I gol SUBITI in TRASFERTA da " + squadra.getNomeSquadra() +" sono " + squadra.getGolSubitiTrasferta() + ".\n"
						+ "Quanti gol vuoi aggiungere/togliere? (scrivi il numero senza il simbolo -)");
				quantitaModifica= scanner.nextInt();
				System.out.println("Modifica apportata. I gol SUBITI in TRASFERTA da " + squadra.getNomeSquadra() +" sono ora " + squadra.setGolSubitiTrasferta(quantitaModifica) + ".\n");
				break;
		}
	}

	public static void VisualizzaPunti(ArrayList <Squadra> elencoSquadre, Scanner scanner) {
		Squadra squadra;
		do{
			System.out.println("Scrivi il nome della Squadra di cui vuoi visualizzare i punti:\n");
			String nomeSquadra = scanner.nextLine();
			if(nomeSquadra.equalsIgnoreCase("menu")) {
				return;
			}
			squadra = TrovaSquadra(nomeSquadra, elencoSquadre);
			if (squadra==null) {
				System.out.println("Nessuna squadra trovata.");
			}
		} while (squadra==null);
		
		System.out.println("I punti totalizzati da " + squadra.getNomeSquadra() + " sono " + squadra.getPunti()+".\n"
					+ "La media inglese e' " + squadra.getMediaInglese());
	}
	
	
	public static void VisualizzaDettagli(ArrayList <Squadra> elencoSquadre, Scanner scanner) {
		Squadra squadra;
		String nomeSquadra;
		do{
			System.out.println("Scrivi il nome della Squadra di cui vuoi visualizzare i dettagli:\n");
			nomeSquadra = scanner.nextLine();
			if(nomeSquadra.equalsIgnoreCase("menu")) {
				return;
			}
			squadra = TrovaSquadra(nomeSquadra, elencoSquadre);
			if (squadra==null) {
				System.out.println("Nessuna squadra trovata.");
			}
		} while (squadra==null);
		
		System.out.println("Ecco i dettagli di " + nomeSquadra + ":\n"
				+ "Partite Vinte: " + squadra.getPartiteVinte() + " di cui " + squadra.getPartiteVinteCasa() + " in Casa e " + squadra.getPartiteVinteTrasferta() + " in Trasferta\n"
				+ "Partite Pareggiate: " + squadra.getPartitePareggiate() + " di cui " + squadra.getPartitePareggiateCasa() + " in Casa e " + squadra.getPartitePareggiateTrasferta() + " in Trasferta\n"
				+ "Partite Perse: " + squadra.getPartitePerse() + " di cui " + squadra.getPartitePerseCasa() + " in Casa e " + squadra.getPartitePerseTrasferta() + " in Trasferta\n"
				+ "Totale Partite Giocate: " + squadra.getTotPartite() + " di cui " + squadra.getTotPartiteCasa() + " in Casa e " + squadra.getTotPartiteTrasferta() + " in Trasferta\n"
				+ "Gol Fatti: " + squadra.getGolFatti() + " di cui " + squadra.getGolFattiCasa() + " in Casa e " + squadra.getGolFattiTrasferta() + " in Trasferta\n"
				+ "Gol Subiti: " + squadra.getGolSubiti() + " di cui " + squadra.getGolSubitiCasa() + " in Casa e " + squadra.getGolSubitiTrasferta() + " in Trasferta\n"
				+ "Differenza Gol Fatti - Gol Subiti: " + squadra.getDifferenzaGol() + "\n"
				+ "Punti: " + squadra.getPunti() + "\n"
				+ "Media Inglese: " + squadra.getMediaInglese() + "\n");	
	}
	
	public static void Classifica(ArrayList<Squadra>elencoSquadre, Scanner scanner) {
		int scelta;
		do {
			System.out.println("Vuoi vedere la classifica secondo il punteggio normale (digita 1), secondo la media inglese (digita 2) o entrambe (digita 3)?");
			scelta= scanner.nextInt();
			scanner.nextLine();
			switch (scelta) {
				case 1:
					ClassificaNormale(elencoSquadre, scanner);
					break;
				case 2:
					ClassificaMediaInglese(elencoSquadre, scanner);
					break;
				case 3:
					ClassificaNormale(elencoSquadre, scanner);
					ClassificaMediaInglese(elencoSquadre, scanner);
					break;
				default:
					System.out.println("Valore non valido!");
					break;
			}
						
		} while (scelta<1 || scelta>3);
	}
	
	public static void ClassificaNormale(ArrayList<Squadra>elencoSquadre, Scanner scanner) {
		ArrayList<Integer> listaPunti = new ArrayList<>();
		ArrayList<Squadra> classifica = new ArrayList<>();
		ArrayList<Boolean> daAggiungere = new ArrayList<>();
		int maxPunti=-1000000;
		for(Squadra i:elencoSquadre) {
			listaPunti.add(i.getPunti());
		}
		
		for(int i=0; i<listaPunti.size(); i++) {
			daAggiungere.add(true);
		}
		
		for(int i=0; i<listaPunti.size(); i++) {
			
			for(int a=0; a<listaPunti.size(); a++) {
				if(listaPunti.get(a)>maxPunti) {
					maxPunti= listaPunti.get(a);
				}
			}
			
			for(int b=0; b<listaPunti.size(); b++) {
				if(listaPunti.get(b) == maxPunti && daAggiungere.get(b)==true) {
					classifica.add(elencoSquadre.get(b));
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
	
	public static void ClassificaMediaInglese(ArrayList<Squadra>elencoSquadre, Scanner scanner) {
		ArrayList<Integer> listaMediaInglese = new ArrayList<>();
		ArrayList<Squadra> classifica = new ArrayList<>();
		ArrayList<Boolean> daAggiungere = new ArrayList<>();
		int maxMediaInglese=-1000000;
		for(Squadra i:elencoSquadre) {
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
					classifica.add(elencoSquadre.get(b));
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
	
	
	public static void AzzeraPunteggio(ArrayList<Squadra>elencoSquadre, Scanner scanner) {
		String scelta;
		do {
			System.out.println("Sei sicuro di voler azzerare i punteggi di TUTTE LE SQUADRE? (scrivi 'si' o 'no')");
			scelta= scanner.nextLine();
			
			if (scelta.equalsIgnoreCase("si") || scelta.equalsIgnoreCase("sì")) {
				for (Squadra i: elencoSquadre) {
					i.azzeraPartite();
				}
				System.out.println("Cancellazione avvenuta!");
				return;
			}
			else if (scelta.equalsIgnoreCase("no")) {
				System.out.println("Operazione annullata.");
				return;
			}
			else {
				System.out.println("Input non corretto!");
			}
		
	     }while(!scelta.equalsIgnoreCase("si") || !scelta.equalsIgnoreCase("sì") || !scelta.equalsIgnoreCase("no"));

	}
}
