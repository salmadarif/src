package TP2_Boucle;
import java.util.Scanner;
public class EX6TP2part2 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Entrée du nombre N
	        System.out.print("Entrez un entier N pour tester les nombres premiers jusqu'à N : ");
	        int N = scanner.nextInt();

	        // Tester tous les nombres entre 1 et N
	        System.out.println("Les nombres premiers jusqu'à " + N + " sont : ");
	        for (int i = 2; i <= N; i++) {
	            if (estPremier(i)) {
	                System.out.print(i + " ");
	            }
	        }

	        scanner.close();
	    }

	    // Méthode pour tester si un nombre est premier
	    public static boolean estPremier(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	}

}
