package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import game.commons.GameConstants;
import game.commons.GameException;
import game.commons.Position;
import model.mapgame.IMapElement;
import model.mapgame.IMapGame;
import model.mapgame.sprite.ICball;
import model.mapgame.sprite.IGate;
import model.mapgame.sprite.IObstacle;
import model.mapgame.sprite.IPurse;
import model.mapgame.sprite.character.ILorann;
import model.mapgame.sprite.character.IMonster;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade extends JFrame implements IView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPane;
	private IMapGame mapGame;
	private JLabel lorannSprite;
	private JLabel score;
	private int img=0;
	private final Map<String, ImageIcon> images = new HashMap<>();

	public ViewFacade() {
		super();
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Lorann");
		contentPane.setBackground(Color.BLACK);
		contentPane.setFocusable(true);
		setContentPane(contentPane);
		loadSpriteImages();
		setVisible(true);
	}

	@Override
	public void setMapGame(final IMapGame mapGame) {
		this.mapGame = mapGame;
	}

	@Override
	public void paint(final Graphics g) {
		super.paint(g);
		try {
			if (mapGame != null) {
				for (int y = 0; y < GameConstants.MAX_GAME_ROWS; y++) {
					for (int x = 0; x < GameConstants.MAX_GAME_COLUMNS; x++) {
						final IMapElement element = mapGame.getElement(new Position(x, y));
						if (element != null) {
							ImageIcon image = null;
							if (element instanceof IMonster) {
								IMonster monster = (IMonster) element;
								switch (monster.getMonsterNumber()) {
								case MONSTER1:
									image = images.get("monster_1");
									break;
								case MONSTER2:
									image = images.get("monster_2");
									break;
								case MONSTER3:
									image = images.get("monster_3");
									break;
								case MONSTER4:
									image = images.get("monster_4");
									break;
								}
							} else if (element instanceof ILorann) {
								drawLorann(2);
								continue;
							} else if (element instanceof IPurse) {
								image = images.get("purse");
							} else if (element instanceof ICball) {
								image = images.get("crystal_ball");
							} else if (element instanceof IGate) {
								image = images.get("gate_closed");
							} else if (element instanceof IObstacle) {
								IObstacle obstacle = (IObstacle) element;
								switch (obstacle.getKindOfObstacle()) {
								case BALL:
									image = images.get("bone");
									break;
								case H_BONE:
									image = images.get("horizontal_bone");
									break;
								case V_BONE:
									image = images.get("vertical_bone");
									break;
								}
							}
							g.drawImage(image.getImage(), convX(element.getPosition().getX()),
									convY(element.getPosition().getY()), null);
							 
						}
					}
				}
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
	
	public void paintScore(Graphics g){
       g.drawString("Actual score : 10", 800, 800);
	}

	@Override
	public void drawLorann(int sens) throws GameException {
		ILorann lorann = mapGame.getLorann();
		switch(sens)
		{
		case 1 :
			getLorannSprite().setIcon(images.get("lorann_r"));
			break;
		case 2 :
			getLorannSprite().setIcon(images.get("lorann_b"));
			break;
		case 3 :
			getLorannSprite().setIcon(images.get("lorann_l"));
			break;
		case 4 :
			getLorannSprite().setIcon(images.get("lorann_u"));
			break;
		}
		getLorannSprite().setLocation(convX(lorann.getPosition().getX())-8, convY(lorann.getPosition().getY())-GameConstants.SPRITE_HEIGHT);
		drawScore();
	}
	
	
	public void drawFireball() throws GameException {
		ILorann lorann = mapGame.getLorann();
		getLorannSprite().setLocation(convX(lorann.getPosition().getX())-8, convY(lorann.getPosition().getY())-GameConstants.SPRITE_HEIGHT);
	}	
	
	
	public void drawScore() throws GameException {
		ILorann lorann = mapGame.getLorann();
		getScoreLabel().setText(Integer.toString(lorann.getResult().getPurse()));
	}


	@Override
	public JPanel getGamePanel() {
		return contentPane;
	}

	/**
	 * return an GUI component for Lorann
	 * 
	 * @return
	 * @throws GameException 
	 */
	protected JLabel getLorannSprite() throws GameException {
		ImageIcon icon = null;
		if (lorannSprite == null) {
			icon = images.get("lorann_b");
			lorannSprite = new JLabel();
			lorannSprite.setIcon(icon);
			lorannSprite.setSize(GameConstants.SPRITE_WIDTH, GameConstants.SPRITE_HEIGHT);
			getGamePanel().add(lorannSprite);
		}
		return lorannSprite;
	}
	
	/**
	 * return an GUI component for Lorann
	 * 
	 * @return
	 * @throws GameException 
	 */
	protected JLabel getScoreLabel() throws GameException {
		if (score == null) {
			score = new JLabel();
			score.setSize(400, 50);
			score.setBackground(Color.WHITE);
			score.setLocation(GameConstants.MAX_GAME_COLUMNS*GameConstants.SPRITE_WIDTH+10, 10 );
			getGamePanel().add(score);
		}
		return score;
	}
	
	
	protected JLabel getFireball() throws GameException {
		img += 1;
		ImageIcon icon = null;
		if (img==5) {
			img = 0;
		}
			icon = images.get("fireball_"+img);
			lorannSprite = new JLabel();
			lorannSprite.setIcon(icon);
			lorannSprite.setSize(GameConstants.SPRITE_WIDTH, GameConstants.SPRITE_HEIGHT);
			getGamePanel().add(lorannSprite);
		
		return lorannSprite;
	}
	
	
	protected JLabel getScore(int score) throws GameException {
		//getGamePanel().paintScore(int score);
		return lorannSprite;
	}

	/**
	 * Convert a model X position to x pixel coordinate of view
	 * 
	 * @param x
	 * @return
	 */
	public int convX(final int x) {
		return x * GameConstants.SPRITE_WIDTH;
	}

	/**
	 * Convert a model Y position to y pixel coordinate of view
	 * 
	 * @param y
	 * @return
	 */
	public int convY(final int y) {
		return (GameConstants.MAX_GAME_ROWS - y) * GameConstants.SPRITE_HEIGHT;
	}

	/**
	 * Permet de mémoriser les imagettes des elements du jeuxOFS
	 */
	protected void loadSpriteImages() {
		images.put("bone", loadImage("bone"));
		images.put("crystal_ball", loadImage("crystal_ball"));
		images.put("fireball_1", loadImage("fireball_1"));
		images.put("fireball_2", loadImage("fireball_2"));
		images.put("fireball_3", loadImage("fireball_3"));
		images.put("fireball_4", loadImage("fireball_4"));
		images.put("fireball_5", loadImage("fireball_5"));
		images.put("gate_closed", loadImage("gate_closed"));
		images.put("gate_open", loadImage("gate_open"));
		images.put("horizontal_bone", loadImage("horizontal_bone"));
		images.put("lorann_b", loadImage("lorann_b"));
		images.put("lorann_bl", loadImage("lorann_bl"));
		images.put("lorann_br", loadImage("lorann_br"));
		images.put("lorann_l", loadImage("lorann_l"));
		images.put("lorann_r", loadImage("lorann_r"));
		images.put("lorann_u", loadImage("lorann_u"));
		images.put("lorann_ul", loadImage("lorann_ul"));
		images.put("lorann_ur", loadImage("lorann_ur"));
		images.put("monster_1", loadImage("monster_1"));
		images.put("monster_2", loadImage("monster_2"));
		images.put("monster_3", loadImage("monster_3"));
		images.put("monster_4", loadImage("monster_4"));
		images.put("purse", loadImage("purse"));
		images.put("vertical_bone", loadImage("vertical_bone"));
	}

	private ImageIcon loadImage(final String shortName) {
		return new ImageIcon(ViewFacade.class.getResource("/resources/" + shortName + ".png"));
	}

}
