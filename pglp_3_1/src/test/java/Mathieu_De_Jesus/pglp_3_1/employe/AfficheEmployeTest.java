package Mathieu_De_Jesus.pglp_3_1.employe;

import org.junit.Test;

public class AfficheEmployeTest {

	@Test
	public void testAffichage() {
		AfficheEmploye e = new AfficheEmploye("Marie","Paris");
		e.afficheCoordonnees();
	}

}
