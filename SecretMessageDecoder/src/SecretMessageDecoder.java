import java.util.Scanner;

public class SecretMessageDecoder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		char c= scan.next().charAt(0);
		Secrect sc= new Secrect();
		System.out.println(sc.decodeCharacter(c));
		scan.close();	
		
		
	}
	
}
