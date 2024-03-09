package TP2_Boucle;
import java.util.Scanner;
public class EX5TP2 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Entrée du nombre n
	        System.out.print("Entrez un entier n pour calculer n! : ");
	        int n = scanner.nextInt();

	        // Calcul de n! avec la boucle while
	        int resultatWhile = calculFactorielWhile(n);
	        System.out.println("n! avec la boucle while : " + resultatWhile);

	        // Calcul de n! avec la boucle for
	        int resultatFor = calculFactorielFor(n);
	        System.out.println("n! avec la boucle for : " + resultatFor);

	        scanner.close();
	    }

	    // Calcul de n! avec la boucle while
	    public static int calculFactorielWhile(int n) {
	        int resultat = 1;
	        int i = 1;
	        while (i <= n) {
	            resultat *= i;
	            i++;
	        }

	        return resultat;
	    }
	    // Calcul de n! avec la boucle for
	    public static int calculFactorielFor(int n) {
	        int resultat = 1;
	        for (int i = 1; i <= n; i++) {
	            resultat *= i;
	        }

	        return resultat;
	}

}
