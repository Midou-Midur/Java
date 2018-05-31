package view;

import view.Panneau;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade extends Fenetre implements IView {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */


    

    public final void displayMessage(final String message) throws IOException {
    	 String[] splitArray = null;
    	 splitArray = message.split(" ");
    	 for(int i = 0; i<= 19;i++)
    	 {
 
    		   String oui = splitArray[i];
    		   this.setContentPane(new dessineNiveau(null, oui));s

    	 }
    }



}
