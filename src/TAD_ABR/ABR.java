package TAD_ABR;

import TAD_ArbreBinaire.Arbrebinaire;

public class ABR extends Arbrebinaire {
	
	public ABR() {
		super();
	}
	
	public ABR(Object r, Arbrebinaire g, Arbrebinaire d) {
		super(r,g,d);
	}
	
	public Comparable max() throws Exception {
		if (this.sad().est_vide()) {return (Comparable) this.racine();}
		else return ((ABR)this.sad()).max();
	}
	
	public void inserer (Comparable e) throws Exception {
		if (this.est_vide()) {
			this.racine = e;
			this.sag = new ABR();
			this.sad = new ABR();
		} else if (((Comparable) this.racine()).compareTo(e)<0) {
			((ABR)this.sad()).inserer(e);
		} else {
			((ABR)this.sag()).inserer(e);
		}
	}
	
	public void supprimer (Comparable e) throws Exception {
		if (!this.est_vide()) {
			if (((Comparable) this.racine()).compareTo(e)<0) {
				((ABR)this.sad()).supprimer(e);
			} else if (((Comparable) this.racine()).compareTo(e)>0) {
				((ABR)this.sag()).inserer(e);
			} else {
				if (this.sag().est_vide() && this.sad().est_vide()) {
					this.racine = null;
					this.sag = null;
					this.sad = null;
				} else if (this.sag().est_vide()) {
					this.racine = this.sad().racine();
					this.sag = this.sad().sag();
					this.sad = this.sad().sad();
				} else if (this.sad().est_vide()) {
					this.racine = this.sag().racine();
					this.sad = this.sag().sad();
					this.sag = this.sag().sag();
				} else {
					Comparable max = ((ABR)this.sag()).max();
					this.racine = max;
					((ABR)this.sag()).supprimer(max);
				}
			}
		}
	}
	
	public boolean rechercher(Comparable e) throws Exception {
		if (this.est_vide()) {
			return false;
		} else {
			if (((Comparable) this.racine()).compareTo(e)==0) {
				return true;
			}
			if (((Comparable) this.racine()).compareTo(e)<0) { 
				return ((ABR)this.sad()).rechercher(e);
			}
			return ((ABR)this.sag()).rechercher(e);
		}
	}

}
