package hello;

public class Demo {
	public static void main(String []args) {
		double examen[] = {70.22,100.35};
		calcNote(examen);
	}
	static double calcNote(double valeur[])
	{
		return (valeur[0]/valeur[1])*100;
	}
	
}






