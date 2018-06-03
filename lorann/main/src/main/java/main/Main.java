package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import game.commons.GameException;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(final String[] args) {
		try {
			final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());
			controller.start();
		} catch (final SQLException | GameException exception) {
			exception.printStackTrace();
		}
	}

}
