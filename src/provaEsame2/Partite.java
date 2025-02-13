package provaEsame2;

public class Partite extends Squadra {

	private int partiteVinteCasa, partiteVinteTrasferta, partitePareggiateCasa, partitePareggiateTrasferta, partitePerseCasa, partitePerseTrasferta;
	
	Partite(String nomeSquadra, int partiteVinteCasa, int partiteVinteTrasferta, int partitePareggiateCasa, int partitePareggiateTrasferta, int partitePerseCasa, int partitePerseTrasferta) {
		super(nomeSquadra);
		this.partiteVinteCasa=partiteVinteCasa;
		this.partitePareggiateCasa=partitePareggiateCasa;
		this.partitePerseCasa=partitePerseCasa;
		this.partiteVinteTrasferta=partiteVinteTrasferta;
		this.partitePareggiateTrasferta=partitePareggiateTrasferta;
		this.partitePerseTrasferta=partitePerseTrasferta;
	}
	
	int getPartiteVinteCasa() {return partiteVinteCasa;}
	int getPartiteVinteTrasferta() {return partiteVinteTrasferta;}
	int getPartiteVinte() {return partiteVinteCasa + partiteVinteTrasferta;}
	int getPartitePareggiateCasa() {return partitePareggiateCasa;}
	int getPartitePareggiateTrasferta() {return partitePareggiateTrasferta;}
	int getPartitePareggiate() {return partitePareggiateCasa + partitePareggiateTrasferta;}
	int getPartitePerseCasa() {return partitePerseCasa;}
	int getPartitePerseTrasferta() {return partitePerseTrasferta;}
	int getPartitePerse() {return partitePerseCasa + partitePerseTrasferta;}
	int getPunti() {return 3*(partiteVinteCasa + partiteVinteTrasferta) + partitePareggiateCasa + partitePareggiateTrasferta;}
	int getTotPartite() {return partiteVinteCasa + partitePareggiateCasa + partitePerseCasa + partiteVinteTrasferta + partitePareggiateTrasferta + partitePerseTrasferta;}
	int getTotPartiteCasa() {return partiteVinteCasa + partitePareggiateCasa + partitePerseCasa;}
	int getTotPartiteTrasferta() {return partiteVinteTrasferta + partitePareggiateTrasferta + partitePerseTrasferta;}
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

	
	void azzeraPartite() {
		partiteVinteCasa= 0;
		partiteVinteTrasferta = 0;
		partitePareggiateCasa = 0;
		partitePareggiateTrasferta = 0;
		partitePerseCasa= 0;
		partitePerseTrasferta =0;
		return;
	}
}
