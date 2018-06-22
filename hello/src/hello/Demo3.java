package hello;

class MonThread implements Runnable{
	Thread t;
	MonThread(){
		t = new Thread(this ,"Mon Thread");
		t.start();
	}
	public void run() {
		System.out.println("Thread enfant demaré "+t);
		System.out.println("Thread enfant terminé "+t);
	}
	
}
public class Demo3 {
	public static void main(String[]args) {
		new MonThread();
		
	}

}
