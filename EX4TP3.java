package TP3_Tableau;
import java.util.Scanner;
public class EX4TP3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Lecture de la taille N du tableau
        int N;
        do {
            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            N = scanner.nextInt();
        } while (N < 10 || N > 50);

        // Déclaration et initialisation du tableau T de taille N
        int[] T = new int[N];

        // Remplissage du tableau avec les valeurs saisies par l'utilisateur
        System.out.println("Veuillez entrer les " + N + " éléments du tableau : ");
        for (int i = 0; i < N; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            T[i] = scanner.nextInt();
        }

        // Effacement des occurrences de 5 dans le tableau et tassement des éléments restants
        int newSize = 0; // Nouvelle taille du tableau après effacement des occurrences de 5
        for (int i = 0; i < N; i++) {
            if (T[i] != 5) {
                T[newSize] = T[i];
                newSize++;
            }
        }

        // Affichage du tableau résultant après effacement des occurrences de 5
        System.out.println("Le tableau résultant après effacement des occurrences de 5 est : ");
        for (int i = 0; i < newSize; i++) {
            System.out.println("Élément " + (i + 1) + " : " + T[i]);
        }

        scanner.close();

	}

}
