package Mathieu_De_Jesus.pglp_3_1.employe;

class AfficheEmploye {
	
	Employe1 e;
	
	public AfficheEmploye(Employe1 e) {
		this.e = e;
	}
	
	public void afficheCoordonnees() {
		System.out.println(e.getName() + ", " + e.getAdresse());
	}
}
