package TAD_Dictionnaire;

public class Main {

	public static void main(String[] args) {

		TableHachage h = new TableHachage();
		Object[] clef = {"USB","BIOS","IP","BYTE","PC","MAC","ROM","CPU"};
		Object[] valeur = {"Universal Serial Bus","Basic input-Output System",
				"Internet Protocol","A byte is a storage unit for data",
				"Personel Computer","Apple Macintosh","Read-Only Memory",
				"Central Processing Unit"};
		
		for (int i=0; i<clef.length; i++) {
			try {h.ajouter(clef[i], valeur[i]);} 
			catch (ExceptionCléDéjàExistante e) {e.printStackTrace();}
		}
		
		System.out.println(h.toString());

	}

}
