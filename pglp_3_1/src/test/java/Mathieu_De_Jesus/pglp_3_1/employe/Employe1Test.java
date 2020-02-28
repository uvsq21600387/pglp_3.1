package Mathieu_De_Jesus.pglp_3_1.employe;

import static org.junit.Assert.*;

import org.junit.Test;

public class Employe1Test {
	
	@Test
	public void testCalculSalaire() {
		Employe1 e = new Employe1("Marie", "Paris");
		assertTrue(e.calculSalaire() == 1500.56);
	}
	
	@Test
	public void testGetters() {
		Employe1 e = new Employe1("Marie", "Paris");
		assertTrue(e.getAdresse().equalsIgnoreCase("Paris") && e.getName().equalsIgnoreCase("Marie"));
	}
}
