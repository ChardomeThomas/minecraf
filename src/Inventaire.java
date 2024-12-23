public class Inventaire {
		int inventaire = 0;
	
		public void Ajouter() {
			inventaire++;
		}
	
		public void Jeter() {
			inventaire--;
		}
	
		public void Afficher() {
			System.out.println("vous avez " + inventaire + " objets dans votre inventaire");
		}
	
}
