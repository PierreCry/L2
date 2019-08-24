package TAD_Liste;

public class ListeContigue implements Liste{
	
	public static int N = 1000000;
	
	private Object[] valeurs;
	int taille;
	
	public ListeContigue() {
		this.taille = 0;
		this.valeurs = new Object[N];
	}
	
	@Override
	public boolean estVide() {
		return (this.taille == 0);
	}
	
	@Override
	public int longueur() {
		return this.taille;
	}

	@Override
	public Object ieme (int indice) throws ExceptionIndiceHorsLimites {
		if (indice<0 || indice>=this.taille) throw new ExceptionIndiceHorsLimites(indice);
		return this.valeurs[indice];
	}

	@Override
	public void inserer (int indice, Object element) throws ExceptionIndiceHorsLimites {
		if (indice<0 || indice>this.taille) throw new ExceptionIndiceHorsLimites(indice);
		int j = this.taille;
		while (j>indice) {
			this.valeurs[j] = this.valeurs[j-1];
			j--;
		}
		this.valeurs[j] = element;
		this.taille++;
	}

	@Override
	public void supprimer (int indice) throws ExceptionIndiceHorsLimites {
		if (indice<0 || indice>=this.taille) throw new ExceptionIndiceHorsLimites(indice);
		int j = indice;
		while (j<this.taille-1) {
			this.valeurs[j] = this.valeurs[j+1];
			j++;
		}
		this.taille--;
	}
	
	@Override
	public String toString() {
		String output = "[ ";
		for (int i=this.taille-1; i>=0; i--) {
			output = output + this.valeurs[i] + " ";
		}
		output = output + "]";
		return output;
	}

}
