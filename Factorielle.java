import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = -1;

            // Boucle jusqu'à avoir un entier positif
            while (n < 0) {
                System.out.print("Entrez un entier positif : ");

                try {
                    n = sc.nextInt();
                    if (n < 0) {
                        System.out.println("Erreur : le nombre doit être positif.");
                    }
                } catch (Exception e) {
                    System.out.println("Erreur : saisie invalide. Entrez un entier.");
                    sc.nextLine(); // vider le buffer du Scanner
                }
            }

            // Calcul de la factorielle
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            System.out.println("La factorielle de " + n + " est : " + fact);
        }
    }
}