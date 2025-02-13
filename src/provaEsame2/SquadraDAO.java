package provaEsame2;

public class SquadraDAO {
	
	private static Scansione _scansione = new Scansione();
	
	public static Squadra AggiungiSquadra() {
		String nomeSquadra = _scansione.inserimentoNomeSquadra();
		int pVinteCasa = _scansione.inserimentoPartiteVinteCasa();
		int pVinteTrasferta = _scansione.inserimentoPartiteVinteTrasferta();
		int pPareggiateCasa = _scansione.inserimentoPartitePareggiateCasa();
		int pPareggiateTrasferta = _scansione.inserimentoPartitePareggiateTrasferta();
		int pPerseCasa =  _scansione.inserimentoPartitePerseCasa();
		int pPerseTrasferta =  _scansione.inserimentoPartitePerseTrasferta();
		int golFattiCasa = _scansione.inserimentoGolFattiCasa();
		int golFattiTrasferta =  _scansione.inserimentoGolFattiTrasferta();
		int golSubitiCasa = _scansione.inserimentoGolSubitiCasa();
		int golSubitiTrasferta = _scansione.inserimentoGolSubitiTrasferta();
		
		Squadra aggSquadra = new Squadra(nomeSquadra, pVinteCasa, pVinteTrasferta, pPareggiateCasa, pPareggiateTrasferta, pPerseCasa, 
				pPerseTrasferta, golFattiCasa, golSubitiCasa, golFattiTrasferta, golSubitiTrasferta);


		
		return aggSquadra;
	}

}
