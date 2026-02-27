import java.util.Scanner;
public class LireChar {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre nom ;");
		String str = sc.nextLine();
		System.out.println("Je m'appelle : " + str);
		sc.close();
	 } 
}