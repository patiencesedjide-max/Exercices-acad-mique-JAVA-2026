import java.util.Scanner;

public class Bienvenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est votre prénom ?");
        String prenom = scanner.nextLine();

        System.out.println("Quel est votre âge ?");
        int age = scanner.nextInt();
        scanner.close();

        System.out.println("Bienvenue " + prenom + ". Vous avez " + age + " ans.");
    }
}