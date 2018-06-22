package hello;

public class Demo2 {

	public static void main(String[]args) {
		Thread t = Thread.currentThread();
		System.out.println("Thread actuel :"+t);
		t.setName("Thread Demo2");
		System.out.println("Thread renommé :"+t);
	}
}
