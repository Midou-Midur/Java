package model.dao;

import static org.junit.Assert.assertTrue;

import java.sql.ResultSet;

import org.junit.Test;

public class LorannBDDConnectorTest {

	@Test
	public void testGetConnection() {
		LorannBDDConnector instance = LorannBDDConnector.getInstance();
		assertTrue(instance.getConnection() != null);
	}

	@Test
	public void testExecuteQuery() {
		LorannBDDConnector instance = LorannBDDConnector.getInstance();
		ResultSet create = instance.executeQuery("SELECT * FROM map1");
		assertTrue(create != null);
	}
}