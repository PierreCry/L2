package aventure;

import java.util.Vector;

public class Situation {
	
	String descriptionS;
	Vector<Choix> choix;
	
	public Situation (String des) {
		this.descriptionS = des;
		this.choix = new Vector();
	}
	
	public void ajouterChoix(Choix ch) {
		this.choix.add(ch);
	}
	
	public boolean estFinale() {
		return this.choix.isEmpty();
	}
	
	public String toString() {
		String output = this.descriptionS + "\n";
		for (int i=0; i<this.choix.size(); i++) {
			output = output + "[" + i + "]" + this.choix.get(i).descriptionC + "\n";
		}
		return output;
	}

}
