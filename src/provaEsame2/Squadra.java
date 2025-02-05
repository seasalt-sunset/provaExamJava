package provaEsame2;
import java.util.Scanner;
import java.lang.String;

public class Squadra {
	Scanner scanner = new Scanner(System.in);
	private String nomeSquadra;
	private int partiteVinteCasa, partiteVinteTrasferta, partitePareggiateCasa, partitePareggiateTrasferta, partitePerseCasa, partitePerseTrasferta;
	private int golFattiCasa, golSubitiCasa, golFattiTrasferta, golSubitiTrasferta;
	
	private int golFatti;
	private int golSubiti;
	private int partiteVinte;
	private int partitePareggiate;
	private int partitePerse;
	
	private int punti= 3*(partiteVinte) + partitePareggiate;
	private int mediaInglese = (-2) * partitePareggiateCasa + (-3) * partitePerseCasa + 2 * partiteVinteTrasferta + (-1) * partitePerseTrasferta;
	private int totPartite= partiteVinte + partitePareggiate + partitePerse;
	private int totPartiteCasa= partiteVinteCasa + partitePareggiateCasa + partitePerseCasa;
	private int totPartiteTrasferta= partiteVinteTrasferta + partitePareggiateTrasferta + partitePerseTrasferta;
	private int differenzaGol= golFatti - golSubiti;
	
	Squadra(String nomeSquadra, int partiteVinteCasa, int partiteVinteTrasferta, int partitePareggiateCasa, int partitePareggiateTrasferta,
			int partitePerseCasa, int partitePerseTrasferta, int golFattiCasa, int golSubitiCasa, int golFattiTrasferta, int golSubitiTrasferta) {
		this.nomeSquadra = nomeSquadra;
		this.partiteVinteCasa=partiteVinteCasa;
		this.partitePareggiateCasa=partitePareggiateCasa;
		this.partitePerseCasa=partitePerseCasa;
		this.partiteVinteTrasferta=partiteVinteTrasferta;
		this.partitePareggiateTrasferta=partitePareggiateTrasferta;
		this.partitePerseTrasferta=partitePerseTrasferta;
		this.golFattiCasa=golFattiCasa;
		this.golSubitiCasa=golSubitiCasa;
		this.golFattiTrasferta=golFattiTrasferta;
		this.golSubitiTrasferta=golSubitiTrasferta;
	}
	
	String getNomeSquadra() {return nomeSquadra;}
	int getPartiteVinteCasa() {return partiteVinteCasa;}
	int getPartiteVinteTrasferta() {return partiteVinteTrasferta;}
	int getPartiteVinte() {return partiteVinteCasa + partiteVinteTrasferta;}
	int getPartitePareggiateCasa() {return partitePareggiateCasa;}
	int getPartitePareggiateTrasferta() {return partitePareggiateTrasferta;}
	int getPartitePareggiate() {return partitePareggiateCasa + partitePareggiateTrasferta;}
	int getPartitePerseCasa() {return partitePerseCasa;}
	int getPartitePerseTrasferta() {return partitePerseTrasferta;}
	int getPartitePerse() {return partitePerseCasa + partitePerseTrasferta;}
	int getGolFatti() {return golFattiCasa + golFattiTrasferta;}
	int getGolSubiti() {return golSubitiCasa + golSubitiTrasferta;}
	int getGolFattiCasa() {return golFattiCasa;}
	int getGolSubitiCasa() {return golSubitiCasa;}
	int getGolFattiTrasferta() {return golFattiTrasferta;}
	int getGolSubitiTrasferta() {return golSubitiTrasferta;}
	int getPunti() {return 3*(partiteVinteCasa + partiteVinteTrasferta) + partitePareggiateCasa + partitePareggiateTrasferta;}
	int getTotPartite() {return partiteVinteCasa + partitePareggiateCasa + partitePerseCasa + partiteVinteTrasferta + partitePareggiateTrasferta + partitePerseTrasferta;}
	int getTotPartiteCasa() {return partiteVinteCasa + partitePareggiateCasa + partitePerseCasa;}
	int getTotPartiteTrasferta() {return partiteVinteTrasferta + partitePareggiateTrasferta + partitePerseTrasferta;}
	int getDifferenzaGol() {return golFattiCasa + golFattiTrasferta - golSubitiCasa - golSubitiTrasferta;}
	int getMediaInglese() {return (-2) * partitePareggiateCasa + (-3) * partitePerseCasa + 2 * partiteVinteTrasferta + (-1) * partitePerseTrasferta;}

	
	int setPartiteVinteCasa(int aggParVinteCasa) {
		partiteVinteCasa+=aggParVinteCasa;
		return partiteVinteCasa;
		}
	
	int setPartiteVinteTrasferta(int aggParVinteTrasferta) {
		partiteVinteTrasferta+=aggParVinteTrasferta;
		return partiteVinteTrasferta;
		}
	
	int setPartitePareggiateCasa(int aggParPareggiateCasa) {
		partitePareggiateCasa+=aggParPareggiateCasa;
		return partitePareggiateCasa;
		}
	
	int setPartitePareggiateTrasferta(int aggParPareggiateTrasferta) {
		partitePareggiateTrasferta+=aggParPareggiateTrasferta;
		return partitePareggiateTrasferta;
		}
	
	int setPartitePerseCasa(int aggParPerseCasa) {
		partitePerseCasa+=aggParPerseCasa;
		return partitePerseCasa;
		}

	int setPartitePerseTrasferta(int aggParPerseTrasferta) {
		partitePerseTrasferta+=aggParPerseTrasferta;
		return partitePerseTrasferta;
		}

	
	int setGolFattiCasa(int aggGolFattiCasa) {
		golFattiCasa+=aggGolFattiCasa;
		return golFattiCasa;
		}
	
	int setGolFattiTrasferta(int aggGolFattiTrasferta) {
		golFattiTrasferta+=aggGolFattiTrasferta;
		return golFattiTrasferta;
		}
	
	int setGolSubitiCasa(int aggGolSubitiCasa) {
		golSubitiCasa+=aggGolSubitiCasa;
		return golSubitiCasa;
		}
	
	int setGolSubitiTrasferta(int aggGolSubitiTrasferta) {
		golSubitiTrasferta+=aggGolSubitiTrasferta;
		return golSubiti;
		}
	
	void visualizzaDettagli() {
		System.out.println("Ecco i dettagli di " + nomeSquadra + ":\n"
				+ "Partite Vinte: " + partiteVinte + " di cui " + partiteVinteCasa + " in Casa e " + partiteVinteTrasferta + " in Trasferta\n"
				+ "Partite Pareggiate: " + partitePareggiate + " di cui " + partitePareggiateCasa + " in Casa e " + partitePareggiateTrasferta + " in Trasferta\n"
				+ "Partite Perse: " + partitePerse + " di cui " + partitePerseCasa + " in Casa e " + partitePerseTrasferta + " in Trasferta\n"
				+ "Totale Partite Giocate: " + totPartite + " di cui " + totPartiteCasa + " in Casa e " + totPartiteTrasferta + " in Trasferta\n"
				+ "Gol Fatti" + golFatti + " di cui " + golFattiCasa + " in Casa e " + golFattiTrasferta + " in Trasferta\n"
				+ "Gol Subiti" + golSubiti + " di cui " + golSubitiCasa + " in Casa e " + golSubitiTrasferta + " in Trasferta\n"
				+ "Differenza Gol Fatti - Gol Subiti:" + differenzaGol + "\n"
				+ "Punti: " + punti + "\n"
				+ "Media Inglese:" + mediaInglese + "\n");			
	}
	
	void azzeraPartite() {
		partiteVinteCasa= 0;
		partiteVinteTrasferta = 0;
		partitePareggiateCasa = 0;
		partitePareggiateTrasferta = 0;
		partitePerseCasa= 0;
		partitePerseTrasferta =0;
		golFattiCasa = 0;
		golSubitiCasa = 0;
		golFattiTrasferta = 0;
		golSubitiTrasferta = 0;
		return;
	}
}
