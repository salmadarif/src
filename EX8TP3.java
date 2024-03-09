package TP3_Tableau;
import java.util.Scanner;
public class EX8TP3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Création du tableau
        int[] tableau = new int[taille];

        // Remplissage du tableau
        System.out.println("Veuillez entrer les éléments du tableau : ");
        for (int i = 0; i < taille; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        // Calcul du plus grand écart
        int plusGrandEcart = calculerPlusGrandEcart(tableau);

        // Affichage du plus grand écart
        System.out.println("Le plus grand écart dans le tableau est : " + plusGrandEcart);

        scanner.close();
    }

    // Méthode pour calculer le plus grand écart dans un tableau
    public static int calculerPlusGrandEcart(int[] tableau) {
        int plusGrandEcart = 0;

        for (int i = 0; i < tableau.length - 1; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                int ecart = Math.abs(tableau[i] - tableau[j]);
                if (ecart > plusGrandEcart) {
                    plusGrandEcart = ecart;
                }
            }
        }

        return plusGrandEcart;

	}

}
