package TP3_Tableau;
import java.util.Scanner;
public class EX2TP3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Déclaration du tableau de 10 éléments
        int[] tableau = new int[10];

        // Remplissage du tableau par l'utilisateur
        System.out.println("Veuillez entrer les 10 éléments du tableau : ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        // Affichage du tableau
        System.out.println("Le tableau que vous avez saisi est : ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Élément " + (i + 1) + " : " + tableau[i]);
        }

        scanner.close();
		
	}

}
