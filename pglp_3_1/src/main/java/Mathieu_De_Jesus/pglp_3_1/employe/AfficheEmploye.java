package Mathieu_De_Jesus.pglp_3_1.employe;

class AfficheEmploye {
	
	private String name;
	private String adresse;
	
	public AfficheEmploye(String name, String adresse) {
		this.name = name;
		this.adresse = adresse;
	}
	
	public void afficheCoordonnees() {
		System.out.println(name + ", " + adresse);
	}
}
