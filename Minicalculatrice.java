import java.util.Scanner;

public class Minicalculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le premier nombre :");
        double num1 = scanner.nextDouble();

        System.out.println("Entrez le deuxième nombre :");
        double num2 = scanner.nextDouble();

        System.out.println("Choisissez une opération :");
        System.out.println("1. Addition (+)");
        System.out.println("2. Soustraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        int choix = scanner.nextInt();
        scanner.close();

        double resultat = 0;
        String operation = "";

        switch (choix) {
            case 1:
                resultat = num1 + num2;
                operation = "+";
                break;
            case 2:
                resultat = num1 - num2;
                operation = "-";
                break;
            case 3:
                resultat = num1 * num2;
                operation = "*";
                break;
            case 4:
                if (num2 != 0) {
                    resultat = num1 / num2;
                    operation = "/";
                } else {
                    System.out.println("Erreur : division par zéro !");
                    return;
                }
                break;
            default:
                System.out.println("Erreur : choix invalide !");
                return;
        }

        System.out.println(num1 + " " + operation + " " + num2 + " = " + resultat);
    }
}