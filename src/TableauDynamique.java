import java.util.Random;
import java.util.Vector;

public class TableauDynamique {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		Random r = new Random();
		char[] alpha = {'a','b','c','d','e'};
		
		/////////////////////////////////////////////////////////////////////
		
		for (int i=0; i<500; i++) {
			v.add(alpha[r.nextInt(alpha.length)]);
			System.out.println("-- " + (i+1) + " ------------------");
			System.out.println("Taille: " + v.size());
			System.out.println("Capacité: " + v.capacity());
		}
		
		/////////////////////////////////////////////////////////////////////
		
		for (int j=0; j<300; j++) {v.remove(r.nextInt(v.size()));}
		System.out.println("-- " + "Suppression" + " ------------------");
		System.out.println("Taille Final: " + v.size());
		System.out.println("Capacité Final: " + v.capacity());
		
		/////////////////////////////////////////////////////////////////////
		
		v.trimToSize();
		System.out.println("-- " + "trimToSize" + " ------------------");
		System.out.println("Taille Final: " + v.size());
		System.out.println("Capacité Final: " + v.capacity());
		
	}

}
