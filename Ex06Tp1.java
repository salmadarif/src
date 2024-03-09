import java.util.Scanner;
public class Ex06Tp1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez a : ");
		double a = scanner.nextDouble();
		System.out.print("Entrez b : ");
		double b = scanner.nextDouble();
		if (a != 0) {
		double solution = -b / a;
		System.out.println("L'équation admet une solution unique : " + solution);
		} else if (b == 0) {
		System.out.println("Tout réel est solution de cette équation.");
		} else {
		System.out.println("L'équation n'a pas de solution.");
		}
		scanner.close();
		}
	}
