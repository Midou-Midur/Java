package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import game.commons.GameException;
import game.commons.Position;
import model.mapgame.IMapElement;
import model.mapgame.IMapGame;
import model.mapgame.MapGame;
import model.mapgame.sprite.character.ILorann;

public class MapGameDAO extends AbstractDAO {

	private static String sqlGameByLevel[] = { "{call readMap1()}", "{call readMap2()}", "{call readMap3()}",
			"{call readMap4()}", "{call readMap5()}" };

	public MapGameDAO() {
	}

	public IMapGame getGameByLevel(int level) throws SQLException, GameException {
		final CallableStatement callStatement = prepareCall(sqlGameByLevel[level - 1]);
		IMapGame result = new MapGame();
		if (callStatement.execute()) {
			final ResultSet resultSet = callStatement.getResultSet();
			int posY = 0;
			while (resultSet.next()) {
				String row[] = resultSet.getString(2).split(" ");
				for (int posX = 0; posX < row.length; posX++) {
					IMapElement element = null;
					switch (row[posX]) {
					case "purse":
						element = new PurseDAO().getElementByName("purse");
						break;
					case "bone":
						element = new ObstacleDAO().getElementByName("bone");
						break;
					case "vbone":
						element = new ObstacleDAO().getElementByName("vbone");
						break;
					case "hbone":
						element = new ObstacleDAO().getElementByName("hbone");
						break;
					case "lorann":
						element = new LorannDAO().getElementByName("lorann");
						break;
					case "monster1":
						element = new MonsterDAO().getElementByName("monster1");
						break;
					case "monster2":
						element = new MonsterDAO().getElementByName("monster2");
						break;
					case "monster3":
						element = new MonsterDAO().getElementByName("monster3");
						break;
					case "monster4":
						element = new MonsterDAO().getElementByName("monster4");
						break;
					case "cball":
						element = new CBallDAO().getElementByName("monster4");
						break;
					case "gate":
						element = new GateDAO().getElementByName("gate");
						break;
					case "void":
						break;
					default:
						System.err.println("Unknown type of element " + row[posX]);

					}
					if (element != null) {
						result.addElement(new Position(posX, posY), element);
						if ("lorann".equals(row[posX])) {
							result.setLorann((ILorann) element);
						}
					}
				}
				posY++;
			}
			resultSet.close();
		}
		return result;
	}
}
