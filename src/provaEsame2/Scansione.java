package provaEsame2;
import java.util.ArrayList;
import java.util.Scanner;
public class Scansione {
	
	private Scanner _scanner;
	
	void apriScanner() {
		 _scanner= new Scanner(System.in);
	}
	
	void chiudiScanner() {
		 _scanner.close();
	}
	
	
	//INSERIMENTO SQUADRA
	
	MainMenu sceltaMainMenu() {
		apriScanner();
		Print.mainMenu();
		MainMenu sceltaMenu= MainMenu.values()[_scanner.nextInt()];
		
		chiudiScanner();
		
		return sceltaMenu;
	}
	
	String inserimentoNomeSquadra() {
		apriScanner();
		Print.printInserimentoNomeSquadra();
		String nomeSquadra = _scanner.nextLine();
		chiudiScanner();
		
		return nomeSquadra;
	}
	
	int inserimentoPartiteVinteCasa() {
		apriScanner();
		Print.printInserimentoDatiSquadra("partite", "VINTE", "CASA");
		int partiteVinteCasa = _scanner.nextInt();
		chiudiScanner();
		
		return partiteVinteCasa;
	}
	
	int inserimentoPartiteVinteTrasferta() {
		apriScanner();
		Print.printInserimentoDatiSquadra("partite", "VINTE", "TRASFERTA");
		int partiteVinteTrasferta = _scanner.nextInt();
		chiudiScanner();
		
		return partiteVinteTrasferta;
	}
	
	int inserimentoPartitePareggiateCasa() {
		apriScanner();
		Print.printInserimentoDatiSquadra("partite", "PAREGGIATE", "CASA");
		int partitePareggiateCasa = _scanner.nextInt();
		chiudiScanner();
		
		return partitePareggiateCasa;
	}
	
	int inserimentoPartitePareggiateTrasferta() {
		apriScanner();
		Print.printInserimentoDatiSquadra("partite", "PAREGGIATE", "TRASFERTA");
		int partitePareggiateTrasferta = _scanner.nextInt();
		chiudiScanner();
		
		return partitePareggiateTrasferta;
	}
	
	int inserimentoPartitePerseCasa() {
		apriScanner();
		Print.printInserimentoDatiSquadra("partite", "PERSE", "CASA");
		int partitePerseCasa = _scanner.nextInt();
		chiudiScanner();
		
		return partitePerseCasa;
	}
	
	int inserimentoPartitePerseTrasferta() {
		apriScanner();
		Print.printInserimentoDatiSquadra("partite", "PERSE", "TRASFERTA");
		int partitePerseTrasferta = _scanner.nextInt();
		chiudiScanner();
		
		return partitePerseTrasferta;
	}
	
	int inserimentoGolFattiCasa() {
		apriScanner();
		Print.printInserimentoDatiSquadra("GOL", "FATTI", "CASA");
		int golFattiCasa = _scanner.nextInt();
		chiudiScanner();
		
		return golFattiCasa;
	}
	
	int inserimentoGolFattiTrasferta() {
		apriScanner();
		Print.printInserimentoDatiSquadra("GOL", "FATTI", "TRASFERTA");
		int golFattiTrasferta = _scanner.nextInt();
		chiudiScanner();
		
		return golFattiTrasferta;
	}
	
	int inserimentoGolSubitiCasa() {
		apriScanner();
		Print.printInserimentoDatiSquadra("GOL", "SUBITI", "CASA");
		int golSubitiCasa = _scanner.nextInt();
		chiudiScanner();
		
		return golSubitiCasa;
	}
	
	int inserimentoGolSubitiTrasferta() {
		apriScanner();
		Print.printInserimentoDatiSquadra("GOL", "SUBITI", "TRASFERTA");
		int golSubitiTrasferta = _scanner.nextInt();
		chiudiScanner();
		
		return golSubitiTrasferta;
	}
	
	
	//MODIFICA PARTITE
	
	String modPartite_nomeSquadra() {
		apriScanner();
		Print.printNomeSquadra_modPartite();
		String nomeSquadra = _scanner.nextLine();
		chiudiScanner();
		
		return nomeSquadra;
	}
	
	CasaOTrasferta modPartite_casaOTrasferta() {
		apriScanner();
		int input;
		while(true) {
			Print.printModPartite_casaOTrasferta();
		input = _scanner.nextInt();
		if(input>=1 && input<=3) {
			break;
			}
		Print.inputErrato();
		}
		CasaOTrasferta casaOTrasferta = CasaOTrasferta.values()[input];
		chiudiScanner();
		
		return casaOTrasferta;
	}
	
	VinteOPerse modPartite_vinteOPerse(){
		apriScanner();
		int input;
		
		while(true) {
		System.out.println("Scegli tra le varie opzioni. Digita:\n"
				+ "1)Se vuoi cambiare il valore delle partite VINTE\n"
				+ "2)Se vuoi cambiare il valore delle partite PERSE\n"
				+ "3)se vuoi cambiare il valore delle partite PAREGGIATE\n"
				+ "4)se vuoi cambiarle TUTTE\n");
		input = _scanner.nextInt();
		if(input>=1 && input<=4) {
			break;
			}
		Print.inputErrato();
		}
		
		chiudiScanner();
		VinteOPerse vinteOPerse = VinteOPerse.values()[input];

		return vinteOPerse;
	}
	
	int modPartite_quantitaModifica() {
		apriScanner();
		int quantitaModifica = _scanner.nextInt();
		Print.printModPartite_valorePartite(vinteOPerse, casaOTrasferta, partite, true);
		chiudiScanner();
		
		return quantitaModifica;
	}
	
}
