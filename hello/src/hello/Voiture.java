package hello;

public class Voiture implements Alderange {
	public void ralentir() {
		System.out.println("la voiture ralenti");
	}

	public void accelerer() {
		System.out.println("la voiture accelere");
	}
	public static void main(String []args) {
		Alderange voiture = new Voiture();
		voiture.ralentir();
		voiture.accelerer();
		
		Alderange voiture2 = new Velo();
		voiture2.ralentir();
		voiture2.accelerer();
	}
}