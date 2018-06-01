package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.Map1;

public class Map1DAO extends AbstractDAO{
	
    /** The sql example by id. */
    private static String sqlReadMap1   = "{call readMap1(?)}";
    
    private static String sqlReadMap2   = "{call readMap2(?)}";
    
    private static String sqlReadMap3   = "{call readMap3(?)}";
    
    private static String sqlReadMap4   = "{call readMap4(?)}";
    
    private static String sqlReadMap5   = "{call readMap5(?)}";

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

    	final CallableStatement callStatement1 = prepareCall(sqlReadMap1);
    	final CallableStatement callStatement2 = prepareCall(sqlReadMap2);
    	final CallableStatement callStatement3 = prepareCall(sqlReadMap3);
    	final CallableStatement callStatement4 = prepareCall(sqlReadMap4);
    	final CallableStatement callStatement5 = prepareCall(sqlReadMap5);
        Map1 map1 = null;


    	int level = 3;
        switch (level)
        {
        case 1:
    		callStatement1.setInt(1, id);
            if (callStatement1.execute()) {
                final ResultSet result = callStatement1.getResultSet();
                if (result.first()) {
                    map1 = new Map1(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
                }
                result.close();
                break;
            }
        case 2:
    		callStatement2.setInt(1, id);
            if (callStatement2.execute()) {
                final ResultSet result = callStatement2.getResultSet();
                if (result.first()) {
                    map1 = new Map1(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
                }
                result.close();
                break;
            }
        case 3:
    		callStatement3.setInt(1, id);
            if (callStatement3.execute()) {
                final ResultSet result = callStatement3.getResultSet();
                if (result.first()) {
                    map1 = new Map1(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
                }
                result.close();
                break;
            }
        case 4:
    		callStatement4.setInt(1, id);
            if (callStatement4.execute()) {
                final ResultSet result = callStatement4.getResultSet();
                if (result.first()) {
                    map1 = new Map1(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
                }
                result.close();
                break;
            }
        case 5:
    		callStatement5.setInt(1, id);
            if (callStatement5.execute()) {
                final ResultSet result = callStatement5.getResultSet();
                if (result.first()) {
                    map1 = new Map1(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
                }
                result.close();
                break;
            }
        }

        return map1;
    }

}
