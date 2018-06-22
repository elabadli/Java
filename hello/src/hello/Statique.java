package hello;

public class Statique {
	public static int addition(int nombre1,int nombre2) {
		
	return nombre1 + nombre2;
	}
	public static int addition(int nombre1,int nombre2,int nombre3) {
		
		return nombre1 + nombre2 + nombre3;
		}
public static double addition(double nombre1,double nombre2) {
		
		return nombre1 + nombre2;
		}
	public static void main(String[]args) {
		int x=5, y=7,z=8;
		double t=12.4,w=8.2;
		System.out.println(addition(t,w));
		
	}
}
