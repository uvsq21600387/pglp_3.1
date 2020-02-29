package Mathieu_De_Jesus.pglp_3_1.employe;

import org.junit.Test;

/**
 * tests unitaires pour la classe AfficheEmploye
 */
public class AfficheEmployeTest {
	
	/**
	 * test de l'affichage dans le terminal
	 */
	@Test
	public void testAffichage() {
		AfficheEmploye e = new AfficheEmploye("Marie","Paris");
		e.afficheCoordonnees();
	}
}
