package TAD_Dictionnaire;

public class TableHachage<Clef,Valeur> {
	
	class Couple {
		Clef clef; Valeur valeur;
		public Couple(Clef c, Valeur v) {this.clef = c;this.valeur = v;}
	}
	
	public static int N = 15;
	Object[] donnees;

	public TableHachage() {
		this.donnees = new Object[N];
	}
	
	public boolean est_present (Clef c) {
		int i = Math.abs(c.hashCode()) % N;;
		int cpt = 0;
		while (this.donnees[i] != null && cpt<N) {
			Couple co = (Couple) this.donnees[i];
			if (co.clef.equals(c)) {return true;}
			i = (i+1)%N;
			cpt++;
		}
		return false;
	}
	
	public Valeur rechercher (Clef c) throws ExceptionCléIntrouvable {
		int i = Math.abs(c.hashCode()) % N;;
		int cpt = 0;
		while (this.donnees[i] != null && cpt<N) {
			Couple co = (Couple) this.donnees[i];
			if (co.clef.equals(c)) {return co.valeur;}
			i = (i+1)%N;
			cpt++;
		} if (cpt==N) throw new ExceptionCléIntrouvable();
		return null;
	}
	
	public void ajouter (Clef c, Valeur v) throws ExceptionCléDéjàExistante {
		
		int i = Math.abs(c.hashCode()) % N;;
		int cpt = 0;
		
		while (this.donnees[i] != null && cpt<N) {
			Couple co = (Couple) this.donnees[i];
			if (co.clef.equals(c)) throw new ExceptionCléDéjàExistante();
			i = (i+1)%N;
			cpt++;
		} if (this.donnees[i] == null) {
			Couple co = new Couple(c,v);
			this.donnees[i] = co;
		} 
		
	}
	
	public void supprimer (Clef c) throws ExceptionCléIntrouvable {
			
		int i = Math.abs(c.hashCode()) % N;;
		int cpt = 0;
		
		while (this.donnees[i] != null && cpt<N) {
			Couple co = (Couple) this.donnees[i];
			if (co.clef.equals(c)) {
				this.donnees[i] = null;
				break;
			}
			i = (i+1)%N;
			cpt++;
		} if (cpt<N) throw new ExceptionCléIntrouvable();

	}
	
	public String toString() {
		int i = 0;
		String output = "";
		while (this.donnees[i] != null && i<N) {
			Couple co = (Couple) this.donnees[i];
			output = output + (i + " - <" + co.clef + "," + co.valeur + ">\n");
			i++;
		}
		return output; 
	}
	
}
