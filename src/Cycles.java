
public class Cycles {

	public static void main(String[] args) {

		String[] lib = {"er","nd","ème"};
		int[] dur = {3,2,3};
		
		for (int i=0; i<lib.length; i++) {
			String output = String.format("Le %s%s cycle universitaire dure %s ans. ", i+1, lib[i], dur[i]);
			System.out.println(output);
		}

	}

}
