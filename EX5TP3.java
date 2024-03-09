package TP3_Tableau;
import java.util.Scanner;
public class EX5TP3 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Lecture de la taille N du tableau
	        System.out.print("Entrez la taille du tableau : ");
	        int N = scanner.nextInt();

	        // Déclaration et initialisation du tableau T de taille N
	        int[] T = new int[N];

	        // Remplissage du tableau avec les valeurs saisies par l'utilisateur
	        System.out.println("Veuillez entrer les " + N + " éléments du tableau : ");
	        for (int i = 0; i < N; i++) {
	            System.out.print("Élément " + (i + 1) + " : ");
	            T[i] = scanner.nextInt();
	        }

	        // Affichage du tableau initial
	        System.out.println("Le tableau initial est : ");
	        afficherTableau(T);

	        // Inversion des éléments du tableau
	        for (int i = 0; i < N / 2; i++) {
	            int temp = T[i];
	            T[i] = T[N - 1 - i];
	            T[N - 1 - i] = temp;
	        }

	        // Affichage du tableau résultant après inversion
	        System.out.println("Le tableau résultant après inversion est : ");
	        afficherTableau(T);

	        scanner.close();
	    }

	    // Méthode pour afficher un tableau d'entiers
	    public static void afficherTableau(int[] tableau) {
	        for (int i = 0; i < tableau.length; i++) {
	            System.out.println("Élément " + (i + 1) + " : " + tableau[i]);
	        }
	}

}
