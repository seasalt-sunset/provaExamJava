package provaEsame2;

public class Print {
	
	static void visualizzaDettagli(Squadra squadra) {
		System.out.println("Ecco i dettagli di " + squadra.getNomeSquadra() + ":\n"
				+ "Partite Vinte: " + squadra.getPartiteVinte() + " di cui " + squadra.getPartiteVinteCasa() + " in Casa e " + squadra.getPartiteVinteTrasferta() + " in Trasferta\n"
				+ "Partite Pareggiate: " + squadra.getPartitePareggiate() + " di cui " + squadra.getPartitePareggiateCasa() + " in Casa e " + squadra.getPartitePareggiateTrasferta() + " in Trasferta\n"
				+ "Partite Perse: " + squadra.getPartitePerse() + " di cui " + squadra.getPartitePerseCasa() + " in Casa e " + squadra.getPartitePerseTrasferta() + " in Trasferta\n"
				+ "Totale Partite Giocate: " + squadra.getTotPartite() + " di cui " + squadra.getTotPartiteCasa() + " in Casa e " + squadra.getTotPartiteTrasferta() + " in Trasferta\n"
				+ "Gol Fatti" + squadra.getGolFatti() + " di cui " + squadra.getGolFattiCasa() + " in Casa e " + squadra.getGolFattiTrasferta() + " in Trasferta\n"
				+ "Gol Subiti" + squadra.getGolSubiti() + " di cui " + squadra.getGolSubitiCasa() + " in Casa e " + squadra.getGolSubitiTrasferta() + " in Trasferta\n"
				+ "Differenza Gol Fatti - Gol Subiti:" + squadra.getDifferenzaGol() + "\n"
				+ "Punti: " + squadra.getPunti() + "\n"
				+ "Media Inglese:" + squadra.getMediaInglese() + "\n");			
	}
	
	static void mainMenu() {
		System.out.println("MENU DI CAMPIONAPP!!! FORZA BARI E ALCUNE SQUADRE?! SCEGLI TRA LE VARIE OPZIONI:\n"
				+ "1) Crea Nuova Squadra\n"
				+ "2)Modifica partite di una Squadra\n"
				+ "3)Modifica gol di una Squadra\n"
				+ "4)Visualizza punteggio di una Squadra\n"
				+ "5)Visualizza dettagli Squadra\n"
				+ "6)Visualizza Classifica\n"
				+ "7) Azzera Punteggio Squadre e inizia nuova stagione\n"
				+ "0) Esci");
	}
	
	static void inputErrato() {
		System.out.println("Valore inserito non corretto.");
	}
	
	static void printInserimentoNomeSquadra() {
		System.out.println("Inserisci il nome della squadra da aggiungere:\n");
	}
	static void printInserimentoDatiSquadra(String cosaInserire, String stato, String dove) {
		System.out.println("Inserisci il numero di " + cosaInserire + " " + stato + " in " + dove + ":\n");
	}

	static void SquadraAggiunta() {
		System.out.println("Squadra aggiunta!");
	}
	
	static void printNomeSquadra_modPartite() {
		System.out.println("Scrivi il nome della Squadra di cui vuoi modificare le partite.\nScrivi 'menu' per tornare al menu principale\n");
	}
	
	static void printModPartite_casaOTrasferta() {
		System.out.println("Digita:\n"
				+ "1) Se vuoi modificare le partite giocate in CASA\n"
				+ "2) Se vuoi modificare le partite giocate in TRASFERTA\n"
				+ "3) Se vuoi modificare ENTRAMBE");
	}
	
	static void printModPartite_vinteOPerse() {
		System.out.println("Scegli tra le varie opzioni. Digita:\n"
				+ "1)Se vuoi cambiare il valore delle partite VINTE\n"
				+ "2)Se vuoi cambiare il valore delle partite PERSE\n"
				+ "3)se vuoi cambiare il valore delle partite PAREGGIATE\n"
				+ "4)se vuoi cambiarle TUTTE\n");
	}
	
	static void printModPartite_valorePartite(VinteOPerse vinteOPerse, CasaOTrasferta casaOTrasferta, Partite partite, boolean modificaFatta, int getPartite) {
		String modifica="";
		if (modificaFatta=true) {
			modifica.equals("ora ");
		}
		System.out.println("Il valore delle partite " + vinteOPerse.toString().toUpperCase() + " giocate in " + casaOTrasferta.toString().toUpperCase() + " da "
				+ partite.getNomeSquadra() + " e' " + modifica + getPartite + ".\n");
		if (modificaFatta=true) {
			System.out.println("Digitare la quantità da aggiungere/rimuovere (se devi rimuoverne inserisci il segno -)\n");
		}
	}
	
	static void printNomeSquadra_modGol() {
		System.out.println("Scrivi il nome della Squadra di cui vuoi modificare i gol.\nScrivi 'menu' per tornare al menu principale\n");
	}
	
	static void printModGol_fattiOSubiti() {
		System.out.println("Scegli tra le varie opzioni. Digita:\n"
				+ "1) Se vuoi cambiare il valore dei gol FATTI\n"
				+ "2) Se vuoi cambiare il valore dei gol SUBITI\n"
				+ "3) Se vuoi cambiare il valore di ENTRAMBI");
	}
	
	static void printModGol_casaOTrasferta() {
		System.out.println("Digita:\n"
				+ "1) Se vuoi cambiare il valore dei gol nelle partite giocate in CASA\n"
				+ "2) Se vuoi cambiare il valore dei gol nelle partite giocate in TRASFERTA\n"
				+ "3) Se vuoi cambiare il valore di ENTRAMBI");
	}
	
	static void printModGol_valoreGol(FattiOSubiti fattiOSubiti, CasaOTrasferta casaOTrasferta, Gol gol, boolean modificaFatta, int getGol) {
		String modifica="";
		if (modificaFatta=true) {
			modifica.equals("ora ");
		}
		System.out.println("Il valore dei gol " + fattiOSubiti.toString().toUpperCase() + " nelle partite giocate in " + casaOTrasferta.toString().toUpperCase() + " da "
				+ gol.getNomeSquadra() + " e' " + modifica + getGol + ".\n");
		if (modificaFatta=true) {
			System.out.println("Digitare la quantità da aggiungere/rimuovere (se devi rimuoverne inserisci il segno -)\n");
		}
	}
	
}
