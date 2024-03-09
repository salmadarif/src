package TP2_Boucle;
import java.util.Scanner;
public class EX3TP2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Entrée du nombre N
        System.out.print("Entrez un entier N : ");
        int N = scanner.nextInt();
        // Calcul de la somme des termes de la série harmonique
        double somme = 0.0;
        for (int i = 1; i <= N; i++) {
            somme += 1.0 / i;
        }
        // Affichage du résultat
        System.out.println("La somme des " + N + " premiers termes de la série harmonique est : " + somme);
        scanner.close();

	}

}
