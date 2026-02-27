public class Resultat {
    public static void main(String[] args) {
        double note1 = 12;
        double note2 = 15;
        double note3 = 8;
        double moyenne = (note1 + note2 + note3) / 3;

        System.out.println("Moyenne : " + moyenne);

        if (moyenne >= 10) {
            System.out.println("Admis");
        } else {
            System.out.println("Ajourné");
        }
    }
}