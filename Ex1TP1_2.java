package TP1_2;
import java.util.Scanner;
public class Ex1TP1_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Demande à l'utilisateur d'entrer un entier positif
		System.out.print("Entrez un entier positif : ");
		int nombre = scanner.nextInt();

		// Vérification de la positivité de l'entier
		if (nombre <= 0) {
		System.out.println("Veuillez entrer un entier positif.");
		} else {
		int sommeDiviseurs = 0;
		int nombreDiviseurs = 0;

		System.out.println("Les diviseurs de " + nombre + " sont : ");
		for (int i = 1; i <= nombre; i++) {
		if (nombre % i == 0) {
		System.out.print(i + " ");
		sommeDiviseurs += i;
		nombreDiviseurs++;
		}
		}
		System.out.println("\nLe nombre de diviseurs est : " + nombreDiviseurs);
		System.out.println("La somme des diviseurs est : " + sommeDiviseurs);
		}
		scanner.close();


	}

}
