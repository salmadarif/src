package TP1_2;
import java.util.Scanner;
public class Ex5TP1_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] butsJoueurs = new int[22];
        // Entrée du nombre de buts inscrits par chaque joueur
        for (int i = 0; i < butsJoueurs.length; i++) {
            System.out.print("Entrez le nombre de buts inscrits par le joueur " + (i + 1) + " : ");
            butsJoueurs[i] = scanner.nextInt();
        }
        // Recherche du numéro du buteur et du nombre total de buts inscrits par l'équipe
        int numeroButeur = -1;
        int totalButs = 0;
        int joueursSansButs = 0;
        for (int i = 0; i < butsJoueurs.length; i++) {
            totalButs += butsJoueurs[i];
            if (butsJoueurs[i] == 0) {
                joueursSansButs++;
            } else if (i == 8) { // Mise à jour du nombre de buts pour le joueur n°9
                butsJoueurs[i] += 2;
            }
            if (numeroButeur == -1 && butsJoueurs[i] > 0) {
                numeroButeur = i + 1;
            }
        }
        // Affichage des résultats
        System.out.println("Le numéro du buteur de l'équipe est : Joueur " + numeroButeur);
        System.out.println("Le nombre total de buts inscrits par l'équipe est : " + totalButs);
        System.out.println("Le nombre de joueurs qui n'ont pas marqué de buts est : " + joueursSansButs);
        scanner.close();

	}

}
