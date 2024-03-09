package TP2_Boucle;
import java.util.Scanner;
public class EX6TP2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Entrée du nombre à tester
        System.out.print("Entrez un nombre pour tester s'il est premier : ");
        int nombre = scanner.nextInt();

        // Vérification si le nombre est premier
        boolean estPremier = estPremier(nombre);

        if (estPremier) {
            System.out.println(nombre + " est un nombre premier.");
        } else {
            System.out.println(nombre + " n'est pas un nombre premier.");
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
