package TAD_Dictionnaire;

public class ExceptionCléDéjàExistante extends Exception {
	
	public ExceptionCléDéjàExistante() {
		super("La clef existe déjà");
	}

}
