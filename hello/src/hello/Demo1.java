package hello;

 abstract class Personne {
	abstract void afficher();
}
class Etudiant extends Personne {
	protected int noEtudiant;
	Etudiant(){
		noEtudiant = 12345;
	}
	void afficher() {
		 System.out.println("Classe etudiant"+noEtudiant);
	}
}
class EtudiantCycle2 extends Etudiant {
	void afficher() {
		 System.out.println("EtudiantCycle2:");
		 System.out.println("Numero d'etudiant:"+noEtudiant);
	}

	 }
public class Demo1 {
	public static void main(String []args) {
		Etudiant numero	= new Etudiant();
		EtudiantCycle2 numero2=new EtudiantCycle2();
		numero.afficher();
		numero2.afficher();
}
}