package TP2_Boucle;
import java.util.Scanner;
public class EX2TP2 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		    // Saisie de X et N
	        System.out.print("Entrez la base X : ");
	        int x = scanner.nextInt();

	        System.out.print("Entrez l'exposant N : ");
	        int n = scanner.nextInt();
	        // Calcul de X^N par multiplications successives
	        long resultat = puissance(x, n);
	        // Affichage du résultat
	        System.out.println(x + " ^ " + n + " = " + resultat);

	        scanner.close();
	    }

	    public static long puissance(int x, int n) {
	        long resultat = 1;
	        // Cas particulier si l'exposant est nul
	        if (n == 0) {
	            return 1;
	        }
	        // Multiplications successives
	        for (int i = 0; i < n; i++) {
	            resultat *= x;
	        }

	        return resultat;

	}

}
