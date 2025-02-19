package provaEsame2;
import java.lang.String;
import java.util.ArrayList;
public class Main {
	
	private static Scansione _scansione = new Scansione();

	public static void main(String[] args) {
		MainMenu sceltaMenu;
		ArrayList <Squadra> listaSquadre = new ArrayList <>();
		ArrayList <Partite> listaPartite = new ArrayList <>();
		ArrayList <Gol> listaGol = new ArrayList <>();
		
		System.out.println("Benvenuto in questo programma elettronico digitale!!!!!\n");
		Squadra squadra = SquadraDAO.aggiungiSquadra();
		Partite partite = PartiteDAO.aggiungiPartiteSquadra(squadra);
		Gol gol = GolDAO.aggiungiGolSquadra(squadra);
		listaSquadre.add(squadra);
		listaPartite.add(partite);
		listaGol.add(gol);
		Print.SquadraAggiunta();
		
		do {
			sceltaMenu = _scansione.sceltaMainMenu();
			
			switch(sceltaMenu) {
			case MainMenu.CreaNuovaSquadra:
				squadra = SquadraDAO.aggiungiSquadra();
				partite = PartiteDAO.aggiungiPartiteSquadra(squadra);
				gol = GolDAO.aggiungiGolSquadra(squadra);
				listaSquadre.add(squadra);
				listaPartite.add(partite);
				listaGol.add(gol);
				Print.SquadraAggiunta();
				break;
				
			case MainMenu.ModificaPartite:
				PartiteDAO.modificaPartite(listaPartite, listaSquadre);
				break;
				
			case MainMenu.ModificaGol:
				GolDAO.modificaGol(listaGol, listaSquadre);
				break;
				
			case MainMenu.PunteggioSquadra:
				PartiteDAO.VisualizzaPunti(listaPartite, listaSquadre);
				break;
				
			case MainMenu.DettagliSquadra:
				SquadraDAO.VisualizzaDettagli(listaSquadre, listaPartite, listaGol);
				break;
				
			case MainMenu.Classifica:
				SquadraDAO.Classifica(listaPartite);
				break;
				
			case MainMenu.Azzera:
				SquadraDAO.azzeraPunteggio(listaPartite, listaGol);
				break;
				
			case MainMenu.Esci:
				System.out.println("Uscita in corso...");
				break;
				
			default:
				System.out.println("Input non corretto!!! Riprova!!!");
				break;
				
			}
			
		} while(sceltaMenu!=MainMenu.Esci);
	_scansione.chiudiScanner();
	}
}
