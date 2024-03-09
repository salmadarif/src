package TP3_Tableau;
import java.util.Scanner;
public class EX3TP3 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Lecture de la taille N du tableau
	        int N;
	        do {
	            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
	            N = scanner.nextInt();
	        } while (N < 10 || N > 50);

	        // Déclaration du tableau T de taille N
	        int[] T = new int[N];

	        // Remplissage du tableau avec les valeurs saisies par l'utilisateur
	        System.out.println("Veuillez entrer les " + N + " éléments du tableau : ");
	        for (int i = 0; i < N; i++) {
	            System.out.print("Élément " + (i + 1) + " : ");
	            T[i] = scanner.nextInt();
	        }

	        // Affichage du contenu du tableau
	        System.out.println("Le contenu du tableau est : ");
	        for (int i = 0; i < N; i++) {
	            System.out.println("Élément " + (i + 1) + " : " + T[i]);
	        }
	        scanner.close();

        

	}

}
