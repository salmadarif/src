import java.util.Scanner;
public class Ex01Tp1 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier entier : ");
int a = scanner.nextInt();
System.out.print("Entrez le deuxième entier : ");
int b = scanner.nextInt();

System.out.println("Somme : " + (a + b));
System.out.println("Différence : " + (a - b));
System.out.println("Produit : " + (a * b));
        if (b != 0) {
System.out.println("Quotient : " + (a / b));
        }
        else {
System.out.println("Division par zéro impossible.");
        }
scanner.close();
    }

	}

