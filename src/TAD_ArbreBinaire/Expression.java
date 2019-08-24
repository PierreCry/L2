package TAD_ArbreBinaire;

import java.util.ArrayList;

public class Expression {

	public static void main(String[] args) throws Exception {

		Arbrebinaire ab = new Arbrebinaire('+',
				new Arbrebinaire('-',
						new Arbrebinaire(5,new Arbrebinaire(),new Arbrebinaire()),
						new Arbrebinaire('*',
								new Arbrebinaire(2,new Arbrebinaire(),new Arbrebinaire()),
								new Arbrebinaire(6,new Arbrebinaire(),new Arbrebinaire()))),
				new Arbrebinaire('*',
						new Arbrebinaire('+',
								new Arbrebinaire(5,new Arbrebinaire(),new Arbrebinaire()),
								new Arbrebinaire('/',
										new Arbrebinaire(6,new Arbrebinaire(),new Arbrebinaire()),
										new Arbrebinaire(2,new Arbrebinaire(),new Arbrebinaire()))),
						new Arbrebinaire(3,new Arbrebinaire(),new Arbrebinaire())));
		
		System.out.println("Taille = " + ab.taille());
		System.out.println("Hauteur = " + ab.hauteur());
		
		////////////////////////////////////////////////////////////
		
		System.out.print("Infixe -> ");
		ab.parcoursProfondeurInfixe();
		System.out.println("");
		System.out.print("Prefixe -> ");
		ab.parcoursProfondeurPrefixe();
		System.out.println("");
		System.out.print("Suffixe -> ");
		ab.parcoursProfondeurSuffixe();
		System.out.println("");
		
		////////////////////////////////////////////////////////////

		ArrayList<Object> profondeur = ab.parcoursProfondeur();
		System.out.print("Profondeur -> ");
		for (int i=0; i<profondeur.size(); i++) {
			System.out.print(profondeur.get(i) + " ");
		}
		System.out.println("");
		
		ArrayList<Object> largeur = ab.parcoursLargeur();
		System.out.print("Largeur -> ");
		for (int i=0; i<largeur.size(); i++) {
			System.out.print(largeur.get(i) + " ");
		}
		System.out.println("");
		
	}

}
