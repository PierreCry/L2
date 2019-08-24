
public class LigneCommande {
	
	String name;
	double val;
	int nbr;

	public LigneCommande(String n, double d, int nb) {
		this.name = n;
		this.val = d;
		this.nbr = nb;
	}
	
	public static double total(LigneCommande[] tab) {
		double result = 0;
		for (int i=0; i<tab.length; i++) {result = result + (tab[i].nbr*tab[i].val);}
		return result;
	}

	public static void main(String[] args) {
		LigneCommande[] lignes = new LigneCommande[3];
		lignes[0] = new LigneCommande("Bac 16L tri matière renforcé",86.80,1);
		lignes[1] = new LigneCommande("Protection ThermaQuiet aluminium noir",14.90,1);
		lignes[2] = new LigneCommande("Fixation à clip 1/8 6.5mm",4.35,5);
		System.out.println(total(lignes));
	}

}
