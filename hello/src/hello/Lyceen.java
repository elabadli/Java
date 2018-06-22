package hello;

public class Lyceen extends Eleve {
	private String niveau;
	
	public Lyceen(String nom,String niveau) {
	super(nom);
	this.niveau = niveau;
	}
	public Lyceen(String niveau) {
		this("indefini",niveau);
	}
	
}

//Eleve eleveSec = new Eleve("Yann");