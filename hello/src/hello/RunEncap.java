package hello;

public class RunEncap {
	public static void main(String []args) {
	EncapTest article = new EncapTest();
	article.setName("james");
	article.setIdNum("1234ms");
	article.setAge(20);
	String nom = article.getName();
	String IdNum = article.getIdNum();
	int age = article.getAge();
	System.out.println(nom+" "+IdNum +" "+age+"ans");
	}
}
