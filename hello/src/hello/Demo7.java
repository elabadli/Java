package hello;

import java.io.File;

public class Demo7 {
	public static void main(String[]args) {
		String rep ="/Users/elabadli/eclipse-workspace";
		File fichier1 = new File(rep);
		if(fichier1.isDirectory()) {
			System.out.println("Repertoire:"+rep);
			String str[]=fichier1.list();
			for(int i=0;i<str.length;i++) {
				//j'inctancie la class File je lui passe en prarmetre rep qui est le chemin du dossier parent après on fait le/et après le fichier courant
				File fichier2 = new File(rep+"/"+str[i]);
				if(fichier2.isDirectory()) {
					System.out.println("Repertoire:"+ str[i]);	
				}
				else {
					System.out.println(str[i]);
				}
			}
		}
		
	}}
