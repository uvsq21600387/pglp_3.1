package Mathieu_De_Jesus.pglp_3_1.employe;

/**
 * class affichant les coordonnées d'un employé,
 * contient les informations nom et adresse de l'employé.
 */
class AfficheEmploye {
	/**
	 * nom de l'employé.
	 */
	private String name;
	/**
	 * adresse de l'employé.
	 */
	private String adresse;
	/**
	 * constructeur de la classe.
	 * @param name pour initialiser l'attribut name
	 * @param adresse pour initialiser l'attribut adresse
	 */
	public AfficheEmploye(final String name, final String adresse) {
		this.name = name;
		this.adresse = adresse;
	}
	/**
	 * affiche les coordonnées de l'employé dans le terminal.
	 */
	public void afficheCoordonnees() {
		System.out.println(name + ", " + adresse);
	}
}
