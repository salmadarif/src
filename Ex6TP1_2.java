package TP1_2;
import java.util.Scanner;
public class Ex6TP1_2 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Saisie du poids en kg
	        System.out.print("Entrez votre poids en kg : ");
	        double poids = scanner.nextDouble();

	        // Saisie de la taille en mètres
	        System.out.print("Entrez votre taille en mètres : ");
	        double taille = scanner.nextDouble();

	        // Calcul de l'IMC
	        double imc = poids / (taille * taille);

	        // Affichage de l'IMC
	        System.out.println("Votre IMC est : " + imc);

	        // Détermination de l'état de poids en fonction du sexe
	        String etatPoids;
	        System.out.print("Entrez votre sexe (F pour Femme, H pour Homme) : ");
	        char sexe = scanner.next().charAt(0);

	        if (sexe == 'F' || sexe == 'f') {
	            etatPoids = determinerEtatPoidsFemme(imc);
	        } else if (sexe == 'H' || sexe == 'h') {
	            etatPoids = determinerEtatPoidsHomme(imc);
	        } else {
	            etatPoids = "Sexe non reconnu";
	        }

	        System.out.println("Votre état de poids est : " + etatPoids);

	        scanner.close();
	    }
	      public static String determinerEtatPoidsFemme(double imc) {
	        if (imc < 19) {
	            return "Maigreur";
	        } else if (imc >= 19 && imc < 24) {
	            return "Poids normal";
	        } else if (imc >= 24 && imc < 30) {
	            return "Surcharge pondérale";
	        } else if (imc >= 30 && imc < 40) {
	            return "Adiposité";
	        } else {
	            return "Obésité";
	        }
	    }

	    public static String determinerEtatPoidsHomme(double imc) {
	        if (imc < 20) {
	            return "Maigreur";
	        } else if (imc >= 20 && imc < 25) {
	            return "Poids normal";
	        } else if (imc >= 25 && imc < 30) {
	            return "Surcharge pondérale";
	        } else if (imc >= 30 && imc < 40) {
	            return "Adiposité";
	        } else {
	            return "Obésité";
	        }

	}

}
