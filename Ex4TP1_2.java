package TP1_2;
import java.util.Scanner;
public class Ex4TP1_2 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Saisie des deux entiers n et m
	        System.out.print("Entrez le premier entier : ");
	        int n = scanner.nextInt();
	        System.out.print("Entrez le deuxième entier : ");
	        int m = scanner.nextInt();

	        // Vérification si les entiers sont amis
	        if (sontAmis(n, m)) {
	            System.out.println(n + " et " + m + " sont des nombres amis.");
	        } else {
	            System.out.println(n + " et " + m + " ne sont pas des nombres amis.");
	        }

	        scanner.close();
	    }

	    public static boolean sontAmis(int n, int m) {
	        return (sommeDiviseurs(n) == m) && (sommeDiviseurs(m) == n);
	    }
	    public static int sommeDiviseurs(int nombre) {
	        int somme = 0;

	        // Parcours des diviseurs du nombre
	        for (int i = 2; i <= nombre / 2; i++) {
	            if (nombre % i == 0) {
	                somme += i;
	            }
	        }

	        return somme;

	}
}
