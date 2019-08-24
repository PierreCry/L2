package aventure;

public class Choix {
	
	String descriptionC;
	String message;
	Situation situation;
	
	public Choix (String des, String mes, Situation s) {
		this.descriptionC = des;
		this.message = mes;
		this.situation = s;
	}

}
