package view;

import java.awt.Graphics;
import java.io.IOException;


/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     * @throws IOException 
     */
	
    void displayMessage(String message) throws IOException;

}
