package hello;
import java.io.*;

public class Secu {
	public static void main(String[]args) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Saisisez votre numero de secu");
			String noSecu = stdin.readLine();
			System.out.println(" numero de secu"+noSecu);
		}catch(IOException e) {
			System.out.println("Exeption:"+e);
		}
			
}
}