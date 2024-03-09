package TP2_Boucle;
import java.util.Scanner;
public class EX4TP2 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 // Entrée du nombre de lignes N
	        System.out.print("Entrez le nombre de lignes N : ");
	        int N = scanner.nextInt();
	        // Affichage du triangle d'étoiles
	        for (int i = 1; i <= N; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println(); // Passer à la ligne suivante après avoir affiché une ligne d'étoiles
	        }
	        scanner.close();

	}

}
