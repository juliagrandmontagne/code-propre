package ex2;

public class LivretA extends CompteBancaire {
	/** constructeur
	 @param= type
	 @param=solde
	 @param= taux Remuneration
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0, tauxRemuneration);
	}
	/**   */
	public void appliquerRemuAnnuelle(){
		if (type.equals("LA")){
			this.solde = solde + solde*tauxRemuneration/100;
		}
	}
	@Override
	/**  */
	public void debiterMontant(double montant){
			if (this.solde - montant > 0){
				this.solde = solde - montant;
			}
	}

}
