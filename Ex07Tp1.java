import java.util.Scanner;
public class Ex07Tp1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez a : ");
        double a = scanner.nextDouble();
        System.out.print("Entrez b : ");
        double b = scanner.nextDouble();
        System.out.print("Entrez c : ");
        double c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (a == 0) {
        	System.out.println("Ce n'est pas une équation du second degré.");
        } else if (discriminant > 0) {
            double racineDiscriminant = Math.sqrt(discriminant);
            double x1 = (-b + racineDiscriminant) / (2 * a);
            double x2 = (-b - racineDiscriminant) / (2 * a);
            System.out.println("L'équation admet deux solutions distinctes : x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("L'équation admet une solution double : x = " + x);
        } else {
        	System.out.println("L'équation n'a pas de solution réelle.");
        }
        scanner.close();
        }
	}
