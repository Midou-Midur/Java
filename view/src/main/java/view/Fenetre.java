package view;

import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Fenetre(){             
    this.setTitle("Lorann");
    this.setSize(640, 380);
    this.setLocationRelativeTo(null);               
 
    //Instanciation d'un objet JPanel
    JPanel pan = new JPanel();
    //Définition de sa couleur de fond
    pan.setBackground(Color.BLACK);        
    //On prévient notre JFrame que notre JPanel sera son content pane
    this.setContentPane(pan);               
    this.setVisible(true);
  }       
}