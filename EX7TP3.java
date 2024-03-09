package TP3_Tableau;
import java.util.Scanner;
import java.util.Arrays;
public class EX7TP3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Crée un tableau avec la taille entrée par l'utilisateur
        int[] tableau = new int[taille];

        // Demande à l'utilisateur de remplir le tableau
        System.out.println("Veuillez entrer les éléments du tableau : ");
        for (int i = 0; i < taille; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        // Calcule la somme des éléments du tableau
        int somme = 0;
        for (int nombre : tableau) {
            somme += nombre;
        }

        // Calcule la moyenne des éléments du tableau
        double moyenne = (double) somme / taille;

        // Copie le tableau dans un deuxième tableau T2 et l'affiche
        int[] tableau2 = Arrays.copyOf(tableau, taille);
        System.out.println("Le deuxième tableau (T2) est : " + Arrays.toString(tableau2));

        // Trie les éléments du tableau dans un ordre croissant
        Arrays.sort(tableau);
        System.out.println("Le tableau trié dans l'ordre croissant est : " + Arrays.toString(tableau));

        // Affiche la somme et la moyenne des éléments du tableau
        System.out.println("Somme des éléments du tableau : " + somme);
        System.out.println("Moyenne des éléments du tableau : " + moyenne);

        scanner.close();	
	}

}
