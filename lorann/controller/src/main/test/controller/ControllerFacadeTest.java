package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ControllerFacadeTest {

	@Test
	public void testGetView() {
		ControllerFacade control = new ControllerFacade(view, model);
		assertEquals(view, control.getView());
	}

	@Test
	public void testGetModel() {
		fail("Not yet implemented");
	}

}
