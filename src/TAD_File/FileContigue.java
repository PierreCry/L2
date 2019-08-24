package TAD_File;

import java.util.ArrayList;

public class FileContigue extends ArrayList<Object> {
	
	public FileContigue() {
		super();
	}
	
	public boolean est_vide() {
		return this.isEmpty();
	}
	
	public Object premier() throws ExceptionFileVide {
		if (this.est_vide()) throw new ExceptionFileVide();
		return this.get(0);
	}
	
	public void enfiler (Object element) {
		this.add(element);
	}
	
	public void defiler() throws ExceptionFileVide {
		if (this.est_vide()) throw new ExceptionFileVide();
		this.remove(0);
	}
	
}
