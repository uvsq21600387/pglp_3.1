package Mathieu_De_Jesus.pglp_3_1.employe;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * test unitaires de la classe Employe1
 */
public class Employe1Test {
	
	/**
	 * teste le résultat du calcul du salaire de l'employe
	 */
	@Test
	public void testCalculSalaire() {
		Employe1 e = new Employe1("Marie", "Paris");
		assertTrue(e.calculSalaire() == 1500.56);
	}
	
	/**
	 * teste les getters pour les attributs adresse et name de la classe Employe1
	 */
	@Test
	public void testGetters() {
		Employe1 e = new Employe1("Marie", "Paris");
		assertTrue(e.getAdresse().equalsIgnoreCase("Paris") && e.getName().equalsIgnoreCase("Marie"));
	}
}
