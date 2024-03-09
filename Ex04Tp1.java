import java.util.Scanner;
public class Ex04Tp1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez un réel x : ");
		double x = scanner.nextDouble();
		System.out.print("Entrez un entier n : ");
		int n = scanner.nextInt();

		double resultat = Math.pow(x, n);
		System.out.println( x + " à la puissance " + n + " est égal à : " + resultat);
		scanner.close();
		}
	}
