package hello;
import java.io.*;
public class Interaction {
public static void main(String[]args) {
	File fichier1 = new File("\\divers\\test");
	System.out.println("Nom:"+fichier1.getName());
	System.out.println("chemin:"+fichier1.getPath());
	System.out.println("chemin complet:"+fichier1.getAbsolutePath());
	System.out.println("parent:"+fichier1.getParent());
	System.out.println("Existe:"+fichier1.exists());
	System.out.println("Ecriture:"+fichier1.canWrite());
	System.out.println("Lecture:"+fichier1.canRead());
	System.out.println("Repertoire:"+fichier1.isDirectory());
	System.out.println("Fichier:"+fichier1.isFile());
	System.out.println("Taille:"+fichier1.length());
	
	


	
}
}