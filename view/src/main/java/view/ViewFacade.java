package view;

import view.Panneau;

import java.awt.Graphics;
import java.io.IOException;


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

    public static String oui = null;
	public static int a=0;
	public static int b=0;

    
    
    public final void displayMessage(final String message) throws IOException {
    	
    	 String[] splitArray = null;
    	 int a = 0;
    	 int b = 0;
    	 splitArray = message.split(" ");
    	 for(int i = 0; i<= 19;i++)
    	 {
    		 
    		   oui = splitArray[i];
    		   System.out.println(ViewFacade.oui);
    		   
			this.setContentPane(new Panneau());
    		   this.repaint();

    	 }
    }


	@Override
	public void Fenetre() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void oui11() {
		// TODO Auto-generated method stub
		
	}





}
