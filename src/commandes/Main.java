package commandes;

public class Main {

	public static void main(String[] args) {
		
		FichierClient fc = new FichierClient();
		System.out.println(fc.clientsVierges());
		System.out.println(fc.listerCommandes(2));

	}

}
