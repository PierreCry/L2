package commandes;

import java.util.Vector;

public class Client {
	
	String nom;
	String prenom;
	String ville;
	Vector<Commande> historique;
	
	public Client (String n, String p, String v) {
		this.nom = n;
		this.prenom = p;
		this.ville = v;
		this.historique = new Vector();
	}
	
	public void ajouterCommande(Commande c) {
		this.historique.add(c);
	}
	
	public String toString() {
		return this.prenom + " " + this.nom + " (" + this.ville + ")";
	}

}
