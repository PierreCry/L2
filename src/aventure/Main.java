package aventure;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Situation s0, s1, s2, s3, s4, s5, s6;

		s0 = new Situation("Vous sortez de l'épaisse forêt et vous trouvez désormais à l'entrée de la caverne. Il fait noir là-dedans.");
		s1 = new Situation("La nuit commence à tomber, mieux vaut ne pas retourner dans cette forêt angoissante");
		s2 = new Situation("Vous vous tenez désormais à l'intérieur de la caverne où règne une quasi obscurité. Il vous semble apercevoir quelque chose d'étincellant plus loin vers le fond. Le trésor ?");
		s3 = new Situation("La lumière de la torche révèle en fait deux chemins.");
		s4 = new Situation("Horreur ! Ce que vous avez pris pour un trésor en fait une paire d'yeux menaçante ! En essayant de vous enfuir, vous sentez une paire de crocs se refermer sur votre nuque. Votre aventure s'arrête ici.");
		s5 = new Situation("Vous avancez dans la grotte, éclairé par votre torche. Soudain, le chemin se termine. Devant vous, une petite porte en bois. Au dessus, une trappe.");
		s6 = new Situation("Des centaines de pièces d'or gisent à vos pieds. Vous avez trouvé le trésor perdu du prince Salzao ! Votre quête est terminée !"); 
		
		s0.ajouterChoix(new Choix("Se reposer","Vous vous réveillez après une bonne sieste", s0));
		s0.ajouterChoix(new Choix("Retourner dans la forêt","Vous rebroussez chemin", s1));
		s0.ajouterChoix(new Choix("Entrer","Vous entrez prudemment", s2));
		s1.ajouterChoix(new Choix("Retourner devant la grotte","Vous retournez devant la grotte", s0));
		s2.ajouterChoix(new Choix("Avancer dans la grotte","Vous avancez prudemment", s4));
		s2.ajouterChoix(new Choix("Allumer une torche","Vous allumez votre torche d'aventurier", s3));
		s2.ajouterChoix(new Choix("Sortir","Vous quittez la grotte", s0));
		s3.ajouterChoix(new Choix("Prendre le chemin de gauche","Vous empruntez prudemment le chemin de gauche", s4));
		s3.ajouterChoix(new Choix("Prendre le chemin de droite","Vous empruntez prudemment le chemin de droite", s5));
		s3.ajouterChoix(new Choix("Sortir","Vous quittez la grotte", s0));
		s5.ajouterChoix(new Choix("Ouvrir la trappe","Vous empruntez la trappe et vous retrouvez à la surface, à l'orée du bois", s1));
		s5.ajouterChoix(new Choix("Ouvrir la porte","Vous entrez dans une petite pièce", s6));
		
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
				System.err.println("Je n’ai pas compris\n");
			}
		}
		
		System.out.println(actuelS.toString());
		sc.close();
		
	}

}
