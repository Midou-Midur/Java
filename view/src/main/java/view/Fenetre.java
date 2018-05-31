package view;

import java.awt.Color;

import javax.swing.JFrame;

 
public class Fenetre extends JFrame {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Fenetre(){             
    this.setTitle("Lorann");
    this.setSize(655, 419);
    this.setLocationRelativeTo(null);               
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setBackground(Color.BLACK);
    this.repaint();
  }       
}