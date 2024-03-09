import java.util.Scanner;
public class Ex03Tp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier entier : ");
        int a = scanner.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int b = scanner.nextInt();
        System.out.println("Avant permutation : a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Après permutation : a = " + a + ", b = " + b);
        scanner.close();
            }
        }
