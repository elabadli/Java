package hello;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;
public class Fenetre {
		//private JLabel label;
	
		public static void main(String[]args) {
			
			JFrame fenetre; 
			//creation de l'instance fenetre
			fenetre = new JFrame();
			//modification de la position er de la talle de la fenetre
			fenetre.setBounds(0,0,300,400);
			fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//modification du titre de la fenetre
			fenetre.setTitle("Bienvenue dans ma fenetre");
			//affichage de la fenetre
			
			
			JButton bouton = new JButton("bouton");
			JButton bouton1 = new JButton("bouton1");
			JButton bouton2 = new JButton("bouton2");
			//JLabel label = new JLabel("test label");
			
			
			color(bouton,Color.red);
			color(bouton1,Color.blue);
			color(bouton2,Color.magenta);
			
			//creation du conteneur intermediaire
			JPanel pan = new JPanel();
			
			//ajout du bouton dans le conteneur
			pan.add(bouton);
			pan.add(bouton1);
			pan.add(bouton2);
			//pan.add(label);
			
			//ajout de la zone de text
			JTextArea zt = new JTextArea("text par default",5,30);
			JScrollPane sp = new JScrollPane(zt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			pan.add(sp);
			
			//Ajout du conteneur intermediaire sur le content pane 
			fenetre.getContentPane().add(pan);
			
			
			//Afichage de la fenetre
		
			fenetre.setVisible(true);
				
		}

		static JButton color(JButton button,Color color) {
			button.setBackground (color);
			button.setOpaque(true);
			button.setBorderPainted(false);
			return button;
		}
		}
		



