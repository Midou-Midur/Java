package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.Map1;

public class Map1DAO extends AbstractDAO{
	
    /** The sql example by id. */
    private static String sqlReadMap1   = "{call readMap1(?)}";

    /** The id column index. */
    private static int    idColumnIndex    = 1;

    /** The name column index. */
    private static int    nameColumnIndex  = 2;

    	
    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    public static Map1 getMap1ById(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlReadMap1);
        Map1 map1 = null;

		callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                map1 = new Map1(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
            }
            result.close();
        }
        return map1;
    }

}
