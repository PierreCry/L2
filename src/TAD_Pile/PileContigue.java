package TAD_Pile;

public class PileContigue {
	
	public static int N = 1000000;
	
	Object[] valeurs;
	int sommet;
	
	public PileContigue() {
		this.sommet = -1;
		this.valeurs = new Object[N];
	}
	
	public boolean est_vide() {
		return (this.sommet == -1);
	}
	
	public Object sommet() throws Exception {
		if (this.est_vide()) throw new Exception();
		return this.valeurs[this.sommet];
	}
	
	public PileContigue empiler (Object element) {
		this.sommet++;
		this.valeurs[this.sommet] = element;
		return this;
	}
	
	public PileContigue depiler() throws Exception {
		if (this.est_vide()) throw new Exception();
		this.sommet--;
		return this;
	}

}
