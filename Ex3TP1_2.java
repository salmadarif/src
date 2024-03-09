package TP1_2;
import java.util.Scanner;
public class Ex3TP1_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Demande à l'utilisateur d'entrer un entier
        System.out.print("Entrez un entier : ");
        int nombre = scanner.nextInt();
        // Vérification si le nombre est parfait
        if (estParfait(nombre)) {
        System.out.println(nombre + " est un nombre parfait.");
        } else {
        System.out.println(nombre + " n'est pas un nombre parfait.");
        }
        scanner.close();
        }
	   public static boolean estParfait(int nombre) {
		if (nombre <= 1) { return false; } 
		int sommeDiviseurs = 0;
		// Parcours des diviseurs du nombre 
		for (int i = 1; i < nombre; i++) {
			if (nombre % i == 0) { sommeDiviseurs += i; 
			}
			
		} 
		// Vérification si la somme des diviseurs est égale au nombre
		return sommeDiviseurs == nombre;
		}
	
	}


