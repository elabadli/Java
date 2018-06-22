package hello;
import java.util.Scanner;
public class BoxDemo {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez un nombre :");
		int nombre = sc.nextInt();
		System.out.println("\n Vous avez saisi:"+nombre);
	}

}
