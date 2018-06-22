package hello;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class Onglet {
	public static void main(String[]args) {
		JFrame frame = new JFrame("Nouvel onglet");
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);}});
			
	//on crée un panel pour notre onglet
		JTabbedPane onglets = new JTabbedPane();
		
		//un premier onglet
		JPanel onglet1 = new JPanel();
		JLabel label = new JLabel("salut les parigots");
		onglet1.add(label);
		onglets.addTab("Label",null,onglet1);
		
		//un deuxième onglet
		JPanel onglet2 = new JPanel();
		JTextField text = new JTextField(20);
		onglet2.add(text);
		onglets.addTab("Champ de saisi",null,onglet2);
		
		//et maintenant,il faut en plus ajouter le panel dans le panel principal
		Container contentPane = frame.getContentPane();
		contentPane.add(onglets);
		frame.pack();
		frame.setVisible(true);
	}

}
