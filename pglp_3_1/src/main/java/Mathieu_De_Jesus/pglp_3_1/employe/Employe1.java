package Mathieu_De_Jesus.pglp_3_1.employe;

class Employe1 {
	
	private String name;
	private String adresse;
	
	public Employe1(String name, String adresse) {
		this.name = name;
		this.adresse = adresse;
	}
	
	public double calculSalaire() {
		return 1500.56;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAdresse() {
		return adresse;
	}
}
