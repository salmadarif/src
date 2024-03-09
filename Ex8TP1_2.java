package TP1_2;
import java.util.Scanner;
public class Ex8TP1_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Saisie de l'âge
        System.out.print("Entrez l'âge de l'habitant : ");
        int age = scanner.nextInt();
        // Saisie du sexe
        System.out.print("Entrez le sexe de l'habitant (M pour masculin, F pour féminin) : ");
        char sexe = scanner.next().charAt(0);
        // Vérification si l'habitant est imposable
        boolean imposable = false;
        if (sexe == 'M' || sexe == 'm') {
            if (age > 20) {
                imposable = true;
            }
        } else if (sexe == 'F' || sexe == 'f') {
            if (age >= 18 && age <= 35) {
                imposable = true;
            }
        }

        // Affichage du statut d'imposition
        if (imposable) {
            System.out.println("L'habitant est imposable.");
        } else {
            System.out.println("L'habitant n'est pas imposable.");
        }

        scanner.close();

	}

}
