package TAD_ArbreBinaire;

import java.util.ArrayList;

import TAD_File.FileContigue;
import TAD_Pile.PileContigue;

public class Arbrebinaire {
	
	protected Object racine;
	protected Arbrebinaire sag;
	protected Arbrebinaire sad;
	
	public Arbrebinaire() {
		this.racine = null;
		this.sag = null; 
		this.sad = null;
	}
	
	public Arbrebinaire(Object r, Arbrebinaire g, Arbrebinaire d) {
		this.racine = r; 
		this.sag = g; 
		this.sad = d;
	}
	
	public boolean est_vide() {
		return (this.racine == null);
	}
	
	public Object racine() throws Exception {
		if (this.est_vide()) throw new Exception();
		return this.racine;
	}
	
	public Arbrebinaire sag() throws Exception {
		if (this.est_vide()) throw new Exception();
		return this.sag;
	}
	
	public Arbrebinaire sad() throws Exception {
		if (this.est_vide()) throw new Exception();
		return this.sad;
	}
	
	public int taille() throws Exception {
		if (this.est_vide()) {return 0;}
		else {return (1 + this.sag().taille() + this.sad().taille());}
	}
	
	public int hauteur() throws Exception {
		if (this.est_vide()) {return 0;}
		else {
			if (this.sag().hauteur() > this.sad().hauteur()) {
				return (1 + this.sag().hauteur());
			} else {
				return (1 + this.sad().hauteur());
			}
		}
	}
	
	////////////////////////////////////////////////////////////
	
	public void parcoursProfondeurInfixe() throws Exception {
		if (!this.sag().est_vide()) {this.sag().parcoursProfondeurInfixe();}
		System.out.print(this.racine() + " ");
		if (!this.sad().est_vide()) {this.sad().parcoursProfondeurInfixe();}
	}
	
	public void parcoursProfondeurPrefixe() throws Exception {
		System.out.print(this.racine() + " ");
		if (!this.sag().est_vide()) {this.sag().parcoursProfondeurInfixe();}
		if (!this.sad().est_vide()) {this.sad().parcoursProfondeurInfixe();}
	}
	
	public void parcoursProfondeurSuffixe() throws Exception {
		if (!this.sag().est_vide()) {this.sag().parcoursProfondeurInfixe();}
		if (!this.sad().est_vide()) {this.sad().parcoursProfondeurInfixe();}
		System.out.print(this.racine() + " ");
	}
	
	////////////////////////////////////////////////////////////
	
	public ArrayList<Object> parcoursProfondeur() throws Exception {
		
		ArrayList<Object> result = new ArrayList();
		PileContigue p = new PileContigue();
		p.empiler(this);
		
		while (!p.est_vide()) {
			Object ab = p.sommet();
			result.add(((Arbrebinaire) ab).racine());
			p.depiler();
			if (!((Arbrebinaire) ab).sad().est_vide()) {
				p.empiler(((Arbrebinaire) ab).sad());
			} if (!((Arbrebinaire) ab).sag().est_vide()) {
				p.empiler(((Arbrebinaire) ab).sag());
			}
		}
		
		return result;
		
	}
	
	public ArrayList<Object> parcoursLargeur() throws Exception {
			
		ArrayList<Object> result = new ArrayList();
		FileContigue f = new FileContigue();
		f.enfiler(this);
		
		while (!f.est_vide()) {
			Object ab = f.premier();
			result.add(((Arbrebinaire) ab).racine());
			f.defiler();
			if (!((Arbrebinaire) ab).sag().est_vide()) {
				f.enfiler(((Arbrebinaire) ab).sag());
			} if (!((Arbrebinaire) ab).sad().est_vide()) {
				f.enfiler(((Arbrebinaire) ab).sad());
			}
		}
		
		return result;	
		
	}

}
