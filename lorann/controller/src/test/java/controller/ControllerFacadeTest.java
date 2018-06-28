package controller;

import static org.junit.Assert.assertEquals;

import java.awt.event.KeyEvent;
import java.sql.SQLException;

import javax.swing.JPanel;

import org.junit.Before;
import org.junit.Test;

import game.commons.GameException;
import game.commons.Position;
import model.IModel;
import model.mapgame.IMapElement;
import model.mapgame.IMapGame;
import model.mapgame.sprite.character.FBallEnum;
import model.mapgame.sprite.character.ILorann;
import model.mapgame.sprite.character.IResult;
import view.IView;

/**
 * Afin de tester les mouvements de Lorann provoqués par les touches clavier, on doit créer des classes Mocking pour : le modèle, la game, et Lorann
 *
 * @author Mehdi
 * @version 1.0
 */
public class ControllerFacadeTest {
    private ControllerFacade controller;
    private IModel model;
    private IView view;
    private JPanel emptyPanel = new JPanel();

    private static class LorannMocker implements ILorann {
        private Position position;

        @Override
        public boolean isAlive() {
            return true;
        }

        @Override
        public FBallEnum getFBall() {
            return null;
        }

        @Override
        public void setFBall(FBallEnum fBall) {
        }

        @Override
        public Long getId() {
            return 1l;
        }

        @Override
        public void setPosition(Position position) {
            this.position = position;
        }

        @Override
        public Position getPosition() {
            return position;
        }

        @Override
        public IResult getResult() {
            return null;
        }
    }

    private static class GameMocker implements IMapGame {
        private ILorann lorann;

        @Override
        public void addElement(Position position, IMapElement element) throws GameException {
            element.setPosition(position);
        }

        @Override
        public IMapElement getElement(Position position) throws GameException {
            return null;
        }

        @Override
        public void removeElement(Position position) throws GameException {
        }

        @Override
        public void setLorann(ILorann lorann) {
            this.lorann = lorann;
        }

        @Override
        public boolean isPositionBusy(Position position) throws GameException {
            return false;
        }

        @Override
        public ILorann getLorann() {
            return lorann;
        }
    }

    private static class ModelMocker implements IModel {
        private IMapGame game;

        @Override
        public IMapGame getGameByLevel(int level) throws SQLException, GameException {
            if (game == null) {
                game = new GameMocker();
                ILorann lorann = new LorannMocker();
                lorann.setPosition(new Position(0, 0));
                game.setLorann(lorann);
            }
            return game;
        }
    }

    private static class ViewMocker implements IView {
        @Override
        public void setMapGame(IMapGame mapGame) {
        }

        @Override
        public JPanel getGamePanel() {
            return null;
        }

        @Override
        public void drawLorann() {
        }

        @Override
        public int convY(int y) {
            return 0;
        }

        @Override
        public int convX(int x) {
            return 0;
        }
    }

    @Before
    public void setUp() throws Exception {
        model = new ModelMocker();
        view = new ViewMocker();
        controller = new ControllerFacade(view, model);
    }

    /**
     * Test if the view of controller is the same of the view resulted
     */
    @Test
    public void testGetView() {
        assertEquals(view, controller.getView());
    }

    /**
     * Test if the model of controller is the same of the model resulted
     */
    @Test
    public void testGetModel() {
        assertEquals(model, controller.getModel());
    }

    /**
     * Tester que la touche VK_RIGHT fasse bouger Lorann à droite d'un case : (0,0) --> (1, 0)
     * 
     * @throws GameException
     * @throws SQLException
     */
    @Test
    public void testKeyPressedRight() throws SQLException, GameException {
        //on met lorann à la position (0;0)
    	model.getGameByLevel(1).getLorann().setPosition(new Position(0, 0));
        //on créé la position attendue suite à l'appui de touche VK_RIGHT
    	final Position expectedPos = new Position(1, 0);
        //on créé l'event VK_RIGHT avec lequel on appelle la méthode keyPressed du controller
    	KeyEvent e = new KeyEvent(emptyPanel, 1, 1, 1, KeyEvent.VK_RIGHT, (char) 0);
        //on simule l'arrivée de l'event sur le controller
    	controller.keyPressed(e);
        //on teste que la nouvelle position calculée par le controller est bien celle attendue
    	assertEquals(expectedPos, model.getGameByLevel(1).getLorann().getPosition());
    }

    /**
     * Tester que la touche VK_UP fasse bouger Lorann en haut d'un case : (10,10) --> (10, 11)
     * 
     * @throws GameException
     * @throws SQLException
     */
    @Test
    public void testKeyPressedUp() throws SQLException, GameException {
        model.getGameByLevel(1).getLorann().setPosition(new Position(10, 10));
        final Position expectedPos = new Position(10, 11);
        KeyEvent e = new KeyEvent(emptyPanel, 1, 1, 1, KeyEvent.VK_UP, (char) 0);
        controller.keyPressed(e);
        assertEquals(expectedPos, model.getGameByLevel(1).getLorann().getPosition());
    }

    /**
     * Tester que la touche VK_LEFT ne fasse pas bouger Lorann : (0,8) --> (0, 8)
     * 
     * @throws GameException
     * @throws SQLException
     */
    @Test
    public void testKeyPressedLeftInterdite() throws SQLException, GameException {
        model.getGameByLevel(1).getLorann().setPosition(new Position(0, 8));
        final Position expectedPos = new Position(0, 8);
        KeyEvent e = new KeyEvent(emptyPanel, 1, 1, 1, KeyEvent.VK_LEFT, (char) 0);
        controller.keyPressed(e);
        assertEquals(expectedPos, model.getGameByLevel(1).getLorann().getPosition());
    }
}