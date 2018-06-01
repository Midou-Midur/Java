package view;

import view.Panneau;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade extends JPanel implements IView {

	public ViewFacade() {
		super();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see view.IView#displayMessage(java.lang.String)
	 */

	public static String oui = null;
	public static String non = null;
	public static int a = -620;
	public static int b = -350;
	public static int px = 32;
	public static int py = 32;
	Fenetre fen = new Fenetre();

	public final void displayMessage(final String message) throws IOException {

		String[] splitArray = null;
		splitArray = message.split(" ");
		for (int i = 0; i <= 19; i++) {

			oui = splitArray[i];
			System.out.println(ViewFacade.oui);
			non = non+" "+oui;
			fen.setContentPane(new Panneau());

		}

		System.out.println("\n");
	}

	public Fenetre getFen() {
		return fen;
	}

	public void setFen(Fenetre fen) {
		this.fen = fen;
	}

	@Override
	public void Fenetre() {
		// TODO Auto-generated method stub

	}

	@Override
	public void oui11() {
		// TODO Auto-generated method stub

	}

	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub

	}

	@Override
	public Component getGamePanel() {
		// TODO Auto-generated method stub
		return null;
	}

}
