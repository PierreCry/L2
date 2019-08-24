package TAD_Pile;

public class PileChainee extends Maillon {
	
	public boolean est_vide() {
		return (this.valeur == null);
	}

	public Object sommet() throws Exception {
		if (this.est_vide()) throw new Exception();
		return this.valeur;
	}

	public Maillon empiler (Object element) {
		Maillon nouveau = new Maillon();
		nouveau.valeur = element;
		nouveau.succ = this;
		return nouveau;
	}

	public Maillon depiler() throws Exception {
		if (this.est_vide()) throw new Exception();
		return this.succ;
	}

}
