package TAD_Liste;

public interface Liste {
	
	boolean estVide();
	int longueur();
	Object ieme (int indice) throws ExceptionIndiceHorsLimites;
	void inserer (int indice, Object element) throws ExceptionIndiceHorsLimites;
	void supprimer (int indice) throws ExceptionIndiceHorsLimites;
	String toString();

}
