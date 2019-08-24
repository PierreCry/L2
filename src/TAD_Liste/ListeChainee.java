package TAD_Liste;

public class ListeChainee implements Liste {
	
	private Maillon tete;
	
	public ListeChainee() {
		this.tete = null;
	}
	
	@Override
	public boolean estVide() {
		return (this.tete == null);
	}

	@Override
	public int longueur() {
		Maillon courant = this.tete;
		int i = 0;
		while (courant != null) {
			courant = courant.succ;
			i++;
		}
		return i;
	}

	@Override
	public Object ieme (int indice) throws ExceptionIndiceHorsLimites {
		Maillon courant = this.tete;
		int j = indice;
		while (j>0) {
			courant = courant.succ;
			j--;
		}
		return courant.valeur;
	}

	@Override
	public void inserer (int indice, Object element) throws ExceptionIndiceHorsLimites {
		Maillon courant = this.tete;
		Maillon nouveau = new Maillon();
		nouveau.valeur = element;
		int j = 0;
		if (indice==0) {
			System.out.println("oui");
			nouveau.succ = courant;
			courant = nouveau;
		} else {
			while (j<indice-1 || courant != null) {courant=courant.succ;j++;} 
			if (courant == null) throw new ExceptionIndiceHorsLimites(indice);
			nouveau.succ = courant.succ;
			courant.succ = nouveau;
		}
	}

	@Override
	public void supprimer (int indice) throws ExceptionIndiceHorsLimites {
		Maillon courant = this.tete;
		Maillon parent = new Maillon();
		int j = 0;
		if (indice==0) {
			this.tete = this.tete.succ;
		} else {
			try {
				while(j<indice) {parent=courant;courant=courant.succ;j++;}
			} catch (NullPointerException e) {
				throw new ExceptionIndiceHorsLimites(indice);
			}
			parent.succ = courant.succ;
		}
	}
	
	@Override
	public String toString() {
		Maillon courant = this.tete;
		String output = "[ ";
		while (courant != null) {
			output = output + courant.valeur + " ";
			courant = courant.succ;
		}
		output = output + "]";
		return output;
	}
	
}
