package provaEsame2;

public class Gol extends Squadra{
	private int golFattiCasa, golSubitiCasa, golFattiTrasferta, golSubitiTrasferta;
	
	Gol(String nomeSquadra, int golFattiCasa, int golSubitiCasa, int golFattiTrasferta, int golSubitiTrasferta) {
		super(nomeSquadra);
		this.golFattiCasa=golFattiCasa;
		this.golSubitiCasa=golSubitiCasa;
		this.golFattiTrasferta=golFattiTrasferta;
		this.golSubitiTrasferta=golSubitiTrasferta;
	}
	
	int getGolFatti() {return golFattiCasa + golFattiTrasferta;}
	int getGolSubiti() {return golSubitiCasa + golSubitiTrasferta;}
	int getGolFattiCasa() {return golFattiCasa;}
	int getGolSubitiCasa() {return golSubitiCasa;}
	int getGolFattiTrasferta() {return golFattiTrasferta;}
	int getGolSubitiTrasferta() {return golSubitiTrasferta;}
	int getDifferenzaGol() {return golFattiCasa + golFattiTrasferta - golSubitiCasa - golSubitiTrasferta;}
	
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
		return golSubitiTrasferta;
		}
	
	void azzeraGol() {
		golFattiCasa = 0;
		golSubitiCasa = 0;
		golFattiTrasferta = 0;
		golSubitiTrasferta = 0;
		return;
	}
}
