import java.io.Console;

public class Main {
	public static void main(String[] args) {

		String[] inventaire = new String[6];
		Ramasser objet = new Ramasser();
		inventaire[0] = objet.Arc();
		inventaire[1] = objet.Nourriture();
		System.out.println(inventaire[0]);
		// System.out.println( objet.Arc());
		// System.out.println( objet.Pioche());
		// System.out.println(objet.Nourriture());
		// System.out.println(objet.Nourriture());
		// System.out.println(objet.Nourriture());
		// System.out.println(objet.Nourriture());
		// System.out.println( objet.Arc());
		// objet.Jeter();
		// System.out.println( objet.Nourriture());
		// System.out.println( objet.Pioche());
		// objet.Afficher();

	}
}
