package provaEsame2;

public class GolDAO {
	
	private static Scansione _scansione = new Scansione();
	
	public static Gol aggiungiGolSquadra(Squadra squadra) {
		String nomeSquadra = squadra.getNomeSquadra();
		int golFattiCasa = _scansione.inserimentoGolFattiCasa();
		int golFattiTrasferta =  _scansione.inserimentoGolFattiTrasferta();
		int golSubitiCasa = _scansione.inserimentoGolSubitiCasa();
		int golSubitiTrasferta = _scansione.inserimentoGolSubitiTrasferta();
		
		Gol aggGolSquadra = new Gol(nomeSquadra, golFattiCasa, golSubitiCasa, golFattiTrasferta, golSubitiTrasferta);


		
		return aggGolSquadra;
	}
}
