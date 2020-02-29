package Mathieu_De_Jesus.pglp_3_1.employe;

/**
 * classe Employe contenant un nom et une adresse,
 * et une methode calculant son salaire.
 */
class Employe1 {
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
	public Employe1(final String name, final String adresse) {
		this.name = name;
		this.adresse = adresse;
	}
	/**
	 * calcule le salaire de l'employé.
	 * @return le salaire de l'employé
	 */
	public double calculSalaire() {
		return 1500.56;
	}
	/**
	 * obtenir le nom.
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * obtenir l'adresse.
	 * @return adresse
	 */
	public String getAdresse() {
		return adresse;
	}
}
