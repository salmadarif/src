package TP1_2;
import java.util.Scanner;
public class EX2TP1_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Demande à l'utilisateur d'entrer l'heure et les minutes
		System.out.print("Entrez l'heure : ");
		int heure = scanner.nextInt();
		System.out.print("Entrez les minutes : ");
		int minutes = scanner.nextInt();

		// Calcul de l'heure une minute plus tard
		minutes++;
		if (minutes == 60) {
		minutes = 0;
		heure = (heure + 1) % 24;
		}

		// Affichage de l'heure une minute plus tard
		System.out.println("Dans une minute, il sera " + heure + " heure(s) " + minutes + " minute(s).");

		scanner.close();
		}
	}
