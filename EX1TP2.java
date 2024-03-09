package TP2_Boucle;
import java.util.Scanner;
public class EX1TP2 {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

        // Entrée du nombre N
        System.out.print("Entrez le nombre N : ");
        int N = scanner.nextInt();

        int somme = 0;
        int produit = 1;
        double moyenne;
        int nombre;
        int i = 0;

        // Utilisation de la boucle while
        System.out.println("Utilisation de la boucle while : ");
        while (i < N) {
            System.out.print("Entrez le nombre entier " + (i + 1) + " : ");
            nombre = scanner.nextInt();
            somme += nombre;
            produit *= nombre;
            i++;
        }
        moyenne = (double) somme / N;
        afficherResultats(somme, produit, moyenne);

        // Utilisation de la boucle do-while
        i = 0;
        somme = 0;
        produit = 1;
        System.out.println("\nUtilisation de la boucle do-while : ");
        do {
            System.out.print("Entrez le nombre entier " + (i + 1) + " : ");
            nombre = scanner.nextInt();
            somme += nombre;
            produit *= nombre;
            i++;
        } while (i < N);
        moyenne = (double) somme / N;
        afficherResultats(somme, produit, moyenne);

        // Utilisation de la boucle for
        somme = 0;
        produit = 1;
        System.out.println("\nUtilisation de la boucle for : ");
        for (i = 0; i < N; i++) {
            System.out.print("Entrez le nombre entier " + (i + 1) + " : ");
            nombre = scanner.nextInt();
            somme += nombre;
            produit *= nombre;
        }
        moyenne = (double) somme / N;
        afficherResultats(somme, produit, moyenne);

        scanner.close();
    }

    public static void afficherResultats(int somme, int produit, double moyenne) {
        System.out.println("La somme est : " + somme);
        System.out.println("Le produit est : " + produit);
        System.out.println("La moyenne est : " + moyenne);
    	}

}
