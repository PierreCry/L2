package commandes;

import java.util.Vector;

public class FichierClient {
	
	Vector<Client> catalogue;
	
	public FichierClient() {
		
		this.catalogue = new Vector();
		
		Client c1 = new Client("Martin","Valérie","Albi");
		c1.ajouterCommande(new Commande(12897,0));
		c1.ajouterCommande(new Commande(86416,1));
		c1.ajouterCommande(new Commande(98716,2));
		this.catalogue.add(c1);

		Client c2 = new Client("Ndiaye","Marie","Dakar");
		c2.ajouterCommande(new Commande(61573,0));
		c2.ajouterCommande(new Commande(36475,2));
		this.catalogue.add(c2);
		
		Client c3 = new Client("Smith","Peter","New-York");
		this.catalogue.add(c3);
		
	}
	
	public Vector<Client> clientsVierges() {
		Vector<Client> cv = new Vector();
		for (int i=0; i<this.catalogue.size(); i++) {
			if (this.catalogue.get(i).historique.isEmpty()) {
				cv.add(this.catalogue.get(i));
			}
		}
		return cv;
	}
	
	public Vector<Commande> listerCommandes(int cs) {
		Vector<Commande> cp = new Vector();
		for (int i=0; i<this.catalogue.size(); i++) {
			for (int j=0; j<this.catalogue.get(i).historique.size(); j++) {
				if (this.catalogue.get(i).historique.get(j).codeStatus == cs) {
					cp.add(this.catalogue.get(i).historique.get(j));
				}
			}
		}
		return cp;
	}

}
