package provaEsame2;
import java.util.Scanner;
public class Scansione {
	
	private static Scanner _scanner= new Scanner(System.in);
	
	void apriScanner() {
		 _scanner= new Scanner(System.in);
	}
	
	void chiudiScanner() {
		 _scanner.close();
	}
	
	
	//INSERIMENTO SQUADRA
	
	MainMenu sceltaMainMenu() {
		Print.mainMenu();
		MainMenu sceltaMenu= MainMenu.values()[_scanner.nextInt()];
		_scanner.nextLine();
		return sceltaMenu;
	}
	
	String inserimentoNomeSquadra() {
		Print.printInserimentoNomeSquadra();
		String nomeSquadra = _scanner.nextLine();

		return nomeSquadra;
	}
	
	int inserimentoPartiteVinteCasa() {
		Print.printInserimentoDatiSquadra("partite", "VINTE", "CASA");
		int partiteVinteCasa = _scanner.nextInt();
		
		return partiteVinteCasa;
	}
	
	int inserimentoPartiteVinteTrasferta() {
		Print.printInserimentoDatiSquadra("partite", "VINTE", "TRASFERTA");
		int partiteVinteTrasferta = _scanner.nextInt();
		
		return partiteVinteTrasferta;
	}
	
	int inserimentoPartitePareggiateCasa() {
		Print.printInserimentoDatiSquadra("partite", "PAREGGIATE", "CASA");
		int partitePareggiateCasa = _scanner.nextInt();
		
		return partitePareggiateCasa;
	}
	
	int inserimentoPartitePareggiateTrasferta() {
		Print.printInserimentoDatiSquadra("partite", "PAREGGIATE", "TRASFERTA");
		int partitePareggiateTrasferta = _scanner.nextInt();
		
		return partitePareggiateTrasferta;
	}
	
	int inserimentoPartitePerseCasa() {
		Print.printInserimentoDatiSquadra("partite", "PERSE", "CASA");
		int partitePerseCasa = _scanner.nextInt();
		
		return partitePerseCasa;
	}
	
	int inserimentoPartitePerseTrasferta() {
		Print.printInserimentoDatiSquadra("partite", "PERSE", "TRASFERTA");
		int partitePerseTrasferta = _scanner.nextInt();
		
		return partitePerseTrasferta;
	}
	
	int inserimentoGolFattiCasa() {
		Print.printInserimentoDatiSquadra("GOL", "FATTI", "CASA");
		int golFattiCasa = _scanner.nextInt();
		
		return golFattiCasa;
	}
	
	int inserimentoGolFattiTrasferta() {
		Print.printInserimentoDatiSquadra("GOL", "FATTI", "TRASFERTA");
		int golFattiTrasferta = _scanner.nextInt();
		
		return golFattiTrasferta;
	}
	
	int inserimentoGolSubitiCasa() {
		Print.printInserimentoDatiSquadra("GOL", "SUBITI", "CASA");
		int golSubitiCasa = _scanner.nextInt();
		
		return golSubitiCasa;
	}
	
	int inserimentoGolSubitiTrasferta() {
		Print.printInserimentoDatiSquadra("GOL", "SUBITI", "TRASFERTA");
		int golSubitiTrasferta = _scanner.nextInt();
		
		return golSubitiTrasferta;
	}
	
	
	//MODIFICA PARTITE
	
	String modPartite_nomeSquadra() {
		Print.printNomeSquadra_modPartite();
		String nomeSquadra = _scanner.nextLine();
		
		return nomeSquadra;
	}
	
	CasaOTrasferta modPartite_casaOTrasferta() {
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
		
		return casaOTrasferta;
	}
	
	VinteOPerse modPartite_vinteOPerse(){
		int input;
		
		while(true) {
			Print.printModPartite_vinteOPerse();
			input = _scanner.nextInt();
			if(input>=1 && input<=4) {
				break;
				}
			Print.inputErrato();
		}
		
		VinteOPerse vinteOPerse = VinteOPerse.values()[input];

		return vinteOPerse;
	}
	
	int quantitaModifica() {
		int quantitaModifica = _scanner.nextInt();   

		return quantitaModifica;
	}
	
	String modGol_nomeSquadra() {
		Print.printNomeSquadra_modGol();
		String nomeSquadra = _scanner.nextLine();	
		
		return nomeSquadra;
	}
	
	FattiOSubiti modGol_fattiOSubiti() {
		int input;
		while(true) {
			Print.printModGol_fattiOSubiti();
			input = _scanner.nextInt();
			if(input>=1 && input<=3) {
				break;
				}
			Print.inputErrato();
		}
		FattiOSubiti fattiOSubiti = FattiOSubiti.values()[input];
		
		return fattiOSubiti;
	}
	
	CasaOTrasferta modGol_casaOTrasferta() {
		int input;
		while(true) {
			Print.printModGol_casaOTrasferta();
			input = _scanner.nextInt();
			if(input>=1 && input<=3) {
				break;
			}
			Print.inputErrato();
		}
		CasaOTrasferta casaOTrasferta = CasaOTrasferta.values()[input];
		
		return casaOTrasferta;
	}
	
	String visualizzaPunti_nomeSquadra() {
		Print.printVisualizzaPunti_nomeSquadra();
		String nomeSquadra = _scanner.nextLine();
		
		return nomeSquadra;
	}
	
	String visualizzaDettagli_nomeSquadra() {
		Print.printVisualizzaDettagli_nomeSquadra();
		String nomeSquadra = _scanner.nextLine();
		
		return nomeSquadra;
	}
	
	int classifica_tipologiaClassifica() {
		int scelta;
		while(true) {
		Print.printClassifica_tipologiaClassifica();
		scelta= _scanner.nextInt();
		if (scelta>=1 || scelta<=3) {
			break;
		}
		Print.inputErrato();
		}
		
		return scelta;
	}
	
	String azzeraPunteggio() {
		String scelta;
		while(true) {
			Print.printAzzeraPunteggio();
			scelta= _scanner.nextLine();
			 if (scelta.equalsIgnoreCase("sì") || scelta.equalsIgnoreCase("si") || scelta.equalsIgnoreCase("no")) {
				 break;
			 }
			 Print.inputErrato();
		}
		
		return scelta;
	}
}
