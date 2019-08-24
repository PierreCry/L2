package aventure;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Situation s0, s1, s2, s3, s4, s5, s6;

		s0 = new Situation("Vous sortez de l'�paisse for�t et vous trouvez d�sormais � l'entr�e de la caverne. Il fait noir l�-dedans.");
		s1 = new Situation("La nuit commence � tomber, mieux vaut ne pas retourner dans cette for�t angoissante");
		s2 = new Situation("Vous vous tenez d�sormais � l'int�rieur de la caverne o� r�gne une quasi obscurit�. Il vous semble apercevoir quelque chose d'�tincellant plus loin vers le fond. Le tr�sor ?");
		s3 = new Situation("La lumi�re de la torche r�v�le en fait deux chemins.");
		s4 = new Situation("Horreur ! Ce que vous avez pris pour un tr�sor en fait une paire d'yeux mena�ante ! En essayant de vous enfuir, vous sentez une paire de crocs se refermer sur votre nuque. Votre aventure s'arr�te ici.");
		s5 = new Situation("Vous avancez dans la grotte, �clair� par votre torche. Soudain, le chemin se termine. Devant vous, une petite porte en bois. Au dessus, une trappe.");
		s6 = new Situation("Des centaines de pi�ces d'or gisent � vos pieds. Vous avez trouv� le tr�sor perdu du prince Salzao ! Votre qu�te est termin�e !"); 
		
		s0.ajouterChoix(new Choix("Se reposer","Vous vous r�veillez apr�s une bonne sieste", s0));
		s0.ajouterChoix(new Choix("Retourner dans la for�t","Vous rebroussez chemin", s1));
		s0.ajouterChoix(new Choix("Entrer","Vous entrez prudemment", s2));
		s1.ajouterChoix(new Choix("Retourner devant la grotte","Vous retournez devant la grotte", s0));
		s2.ajouterChoix(new Choix("Avancer dans la grotte","Vous avancez prudemment", s4));
		s2.ajouterChoix(new Choix("Allumer une torche","Vous allumez votre torche d'aventurier", s3));
		s2.ajouterChoix(new Choix("Sortir","Vous quittez la grotte", s0));
		s3.ajouterChoix(new Choix("Prendre le chemin de gauche","Vous empruntez prudemment le chemin de gauche", s4));
		s3.ajouterChoix(new Choix("Prendre le chemin de droite","Vous empruntez prudemment le chemin de droite", s5));
		s3.ajouterChoix(new Choix("Sortir","Vous quittez la grotte", s0));
		s5.ajouterChoix(new Choix("Ouvrir la trappe","Vous empruntez la trappe et vous retrouvez � la surface, � l'or�e du bois", s1));
		s5.ajouterChoix(new Choix("Ouvrir la porte","Vous entrez dans une petite pi�ce", s6));
		
		////////////////////////////////////////////////////////////////////////////
		
		Scanner sc = new Scanner(System.in);
		Situation actuelS = s0;
		
		while (!actuelS.estFinale()) {
			try {
				System.out.println(actuelS.toString());
				System.out.print("Votre choix : ");
				Choix actuelC = actuelS.choix.get(sc.nextInt());
				System.out.println(actuelC.message + "\n");
				actuelS = actuelC.situation;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Choix invalide\n");
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Je n�ai pas compris\n");
			}
		}
		
		System.out.println(actuelS.toString());
		sc.close();
		
	}

}
