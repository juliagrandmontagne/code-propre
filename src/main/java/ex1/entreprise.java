package ex1;

import java.util.Date;

public class entreprise {

	public int siret;
	public String nom;
	public String adresse;
	public Date dateCreation;
	
	public static final int capitalMax = 3000000;
	/**Affiche l'ensemble des information de l'uilisateur*/
	public void AffichertSatut(){
		System.out.println(this.siret+this.nom+this.adresse+this.dateCreation);
	}
	/** Getter for getSiret
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}
	/** Setter
	 * @param siret the solde to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}
	/** Getter for getNom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 * @param nom the solde to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter for getAdresse
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/** Setter
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/** Getter for dateCreation
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}
	/** Setter
	 * @param dateCreation
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}
