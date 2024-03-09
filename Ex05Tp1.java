import java.util.Scanner;
public class Ex05Tp1 {
   public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   System.out.print("Entrez un entier positif : ");
		   int n = scanner.nextInt();
           long resultat = 1;
           for (int i = 1; i <= n; i++) {
        	   resultat *= i;
        	   }
        	   System.out.println("La factorielle de " + n + " est : " + resultat);
        	   scanner.close();
        	   }
   }
