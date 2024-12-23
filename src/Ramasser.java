
class Ramasser {
	Inventaire inventaire = new Inventaire();

	public String Arc() {
		if (inventaire.inventaire >= 6) {
			return "votre inventaire est plein veuillez jeter un element avant de pouvoir un ramasser un arc";
		} else {
			inventaire.Ajouter();
			return "arc";
		}
	}

	public String Pioche() {
		if (inventaire.inventaire >= 6) {
			return "votre inventaire est plein veuillez jeter un element avant de pouvoir un ramasser une pioche";
		} else {
			inventaire.Ajouter();
			return "pioche";
		}
	}

	public String Nourriture() {
		if (inventaire.inventaire >= 6) {
			return "votre inventaire est plein veuillez jeter un element avant de pouvoir un ramasser de la nourriture";
		} else {
			inventaire.Ajouter();
			return "nourriture";
		}
	}


}