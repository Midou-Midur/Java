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
    this.setSize(640, 384);
    this.setLocationRelativeTo(null);
 
    //Instanciation d'un objet JPanel
    //Définition de sa couleur de fond     
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setVisible(true);

  }       
}