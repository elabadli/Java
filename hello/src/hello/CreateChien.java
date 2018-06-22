package hello;

public class CreateChien {
	public static void main(String []args) {
		Chien animal= new Chien();
		animal.setNom("Dogy");
		animal.setCouleur("Black");
		String nom = animal.getNom();
		String couleur = animal.getCouleur();
		System.out.println(nom +" "+couleur);
	
	}
}