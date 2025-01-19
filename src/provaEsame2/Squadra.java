package provaEsame2;
import java.util.Scanner;
import java.lang.String;

public class Squadra {
	Scanner scanner = new Scanner(System.in);
	private String nomeSquadra;
	private int partiteVinteCasa, partiteVinteTrasferta, partitePareggiateCasa, partitePareggiateTrasferta, partitePerseCasa, partitePerseTrasferta;
	private int golFattiCasa, golSubitiCasa, golFattiTrasferta, golSubitiTrasferta;
	
	private int golFatti = golFattiCasa + golFattiTrasferta;
	private int golSubiti = golSubitiCasa + golSubitiTrasferta;
	private int partiteVinte = partiteVinteCasa + partiteVinteTrasferta;
	private int partitePareggiate = partitePareggiateCasa + partitePareggiateTrasferta;
	private int partitePerse = partitePerseCasa + partitePerseTrasferta;
	
	private int punti= 3*(partiteVinte) + partitePareggiate;
	private int mediaInglese = (-2) * partitePareggiateCasa + (-3) * partitePerseCasa + 2 * partiteVinteTrasferta + (-1) * partitePerseTrasferta;
	private int totPartite= partiteVinte + partitePareggiate + partitePerse;
	private int differenzaGol= golFatti - golSubiti;
	
	Squadra(String nomeSquadra, int partiteVinteCasa, int partiteVinteTrasferta, int partitePareggiateCasa, int partitePareggiateTrasferta,
			int partitePerseCasa, int partitePerseTrasferta, int golFattiCasa, int golSubitiCasa, int golFattiTrasferta, int golSubitiTrasferta) {
		this.nomeSquadra = nomeSquadra;
		this.partiteVinteCasa=partiteVinteCasa;
		this.partitePareggiateCasa=partitePareggiateCasa;
		this.partitePerseCasa=partitePerseCasa;
		this.partiteVinteTrasferta=partiteVinte;
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
	int getPartiteVinte() {return partiteVinte;}
	int getPartitePareggiateCasa() {return partitePareggiateCasa;}
	int getPartitePareggiateTrasferta() {return partitePareggiateTrasferta;}
	int getPartitePareggiate() {return partitePareggiate;}
	int getPartitePerseCasa() {return partitePerseCasa;}
	int getPartitePerseTrasferta() {return partitePerseTrasferta;}
	int getPartitePerse() {return partitePerse;}
	int getGolFatti() {return golFatti;}
	int getGolSubiti() {return golSubiti;}
	int getGolFattiCasa() {return golFattiCasa;}
	int getGolSubitiCasa() {return golSubitiCasa;}
	int getGolFattiTrasferta() {return golFattiTrasferta;}
	int getGolSubitiTrasferta() {return golSubitiTrasferta;}
	int getPunti() {return punti;}
	int getTotPartite() {return totPartite;}
	int getDifferenzaGol() {return differenzaGol;}
	int getMediaInglese() {return mediaInglese;}
	
	void aggSquadra() {
		System.out.println("Inserisci il nome della prima squadra da aggiungere:\n");
		nomeSquadra = scanner.nextLine();
		System.out.println("Inserisci il numero di partite VINTE in CASA:\n");
		partiteVinteCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di partite VINTE in TRASFERTA:\n");
		partiteVinteTrasferta = scanner.nextInt();
		System.out.println("Inserisci il numero di partite PAREGGIATE in CASA:\n");
		partitePareggiateCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di partite PAREGGIATE in TRASFERTA:\n");
		partitePareggiateTrasferta = scanner.nextInt();
		System.out.println("Inserisci il numero di partite PERSE in CASA:\n");
		partitePerseCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di partite PERSE in TRASFERTA:\n");
		partitePerseTrasferta = scanner.nextInt();
		System.out.println("Inserisci il numero di GOL FATTI in CASA:\n");
		golFattiCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di GOL FATTI in TRASFERTA:\n");
		golFattiTrasferta = scanner.nextInt();
		System.out.println("Inserisci il numero di GOL SUBITI in CASA:\n");
		golSubitiCasa = scanner.nextInt();
		System.out.println("Inserisci il numero di GOL SUBITI in TRASFERTA:\n");
		golSubitiTrasferta = scanner.nextInt();
		return;
	}
	
	int setPartiteVinteCasa(int aggParVinteCasa, boolean scelta) {
		if (scelta=true) 
			{partiteVinteCasa+=aggParVinteCasa;}
		else 
			{partiteVinteCasa-=aggParVinteCasa;}
		return partiteVinteCasa;
		}
	int setPartiteVinteTrasferta(int aggParVinteTrasferta, boolean scelta) {
		if (scelta=true) 
			{partiteVinteTrasferta+=aggParVinteTrasferta;}
		else 
			{partiteVinteTrasferta-=aggParVinteTrasferta;}
		return partiteVinteTrasferta;
		}
	
	int setPartitePareggiateCasa(int aggParPareggiateCasa, boolean scelta) {
		if (scelta=true) 
			{partitePareggiateCasa+=aggParPareggiateCasa;}
		else 
			{partitePareggiateCasa-=aggParPareggiateCasa;}
		return partitePareggiateCasa;
		}
	
	int setPartitePareggiateTrasferta(int aggParPareggiateTrasferta, boolean scelta) {
		if (scelta=true) 
			{partitePareggiateTrasferta+=aggParPareggiateTrasferta;}
		else 
			{partitePareggiateTrasferta-=aggParPareggiateTrasferta;}
		return partitePareggiateTrasferta;
		}
	
	int setPartitePerseCasa(int aggParPerseCasa, boolean scelta) {
		if (scelta=true) 
		{partitePerseCasa+=aggParPerseCasa;}
	else 
		{partitePerseCasa-=aggParPerseCasa;}
		return partitePerseCasa;
		}
	int setPartitePerseTrasferta(int aggParPerseTrasferta, boolean scelta) {
		if (scelta=true) 
		{partitePerseTrasferta+=aggParPerseTrasferta;}
	else 
		{partitePerseTrasferta-=aggParPerseTrasferta;}
		return partitePerseTrasferta;
		}

	
	int setGolFattiCasa(int aggGolFattiCasa, boolean scelta) {
		if (scelta=true) 
		{golFattiCasa+=aggGolFattiCasa;}
	else 
		{golFattiCasa-=aggGolFattiCasa;}
		return golFattiCasa;
		}
	
	int setGolFattiTrasferta(int aggGolFattiTrasferta, boolean scelta) {
		if (scelta=true) 
		{golFattiTrasferta+=aggGolFattiTrasferta;}
	else 
		{golFattiTrasferta-=aggGolFattiTrasferta;}
		return golFattiTrasferta;
		}
	
	int setGolSubitiCasa(int aggGolSubitiCasa, boolean scelta) {
		if (scelta=true) 
		{golSubitiCasa+=aggGolSubitiCasa;}
	else 
		{golSubitiCasa-=aggGolSubitiCasa;}
		return golSubitiCasa;
		}
	
	int setGolSubitiTrasferta(int aggGolSubitiTrasferta, boolean scelta) {
		if (scelta=true) 
		{golSubitiTrasferta+=aggGolSubitiTrasferta;}
	else 
		{golSubitiTrasferta-=aggGolSubitiTrasferta;}
		return golSubiti;
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
