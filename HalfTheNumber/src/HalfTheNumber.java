import java.util.Scanner;

public class HalfTheNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total amnt ");
		double num=sc.nextDouble();
		System.out.println("half of total amnt="+halveTheNumber(num));
		sc.close();
	}
	public static double halveTheNumber(double num)
	{
		return num/2.0;
	}
}
