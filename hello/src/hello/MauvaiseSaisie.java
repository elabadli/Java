package hello;

	public class MauvaiseSaisie extends Throwable {
		//recupere le constructeur de l'exception 
		public  MauvaiseSaisie () {
		super();

		}
		//reprend le constructeur de la class pour lui passé un paramettre que je peus l'utiliser
		//je personalise ma methode
		public MauvaiseSaisie (String c) {
			super(c);
		}
		//throws:lever l' exception MauvaiseSaisie qui s'aplique sur la methode verif
		public static void verif (String s) throws MauvaiseSaisie {	
			if(s.equals("")==true)
				throw new MauvaiseSaisie("chaine non conforme car vide");
		}
		public static void main (String[]args){	
		String a="bonjour",b="";
		try {
			verif(a);
		}catch(MauvaiseSaisie e) {
			System.out.println(e);
		}
		try {
			verif(b);
		}catch(MauvaiseSaisie e) {
			System.out.println(e);
		}
  }
	
	}
		

		

		
