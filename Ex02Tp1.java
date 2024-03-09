import java.util.Scanner;
public class Ex02Tp1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le rayon du cercle : ");
        double rayon = scanner.nextDouble();
        double surface = Math.PI * rayon * rayon;
        double perimetre = 2 * Math.PI * rayon;
        System.out.println("la surface est : " + surface);
        System.out.println("le Périmètre est: " + perimetre);
        scanner.close();
        }
	}
