import java.util.Scanner;

public class LireEntiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Combien de nombres voulez-vous entrer ? ");
        int n = sc.nextInt();

        int[] nombres = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Entrez l'entier #" + (i + 1) + " : ");
            nombres[i] = sc.nextInt();
        }

        System.out.println("Les nombres que vous avez entrés sont :");
        for (int nombre : nombres) {
            System.out.println(nombre);
            sc.close();
        }
    }
}