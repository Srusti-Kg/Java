import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double inche=sc.nextDouble();
		HeightConverter h=new HeightConverter();
		System.out.println(inche+"in feet = "+h.convertInchesToFeet(inche)+"foot");
		sc.close();


	}

}
