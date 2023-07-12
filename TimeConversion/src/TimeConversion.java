import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter time in mins");
		int t=sc.nextInt();
		double hrs=convertToHours(t);
		System.out.println("time in hrs "+hrs);
		sc.close();
	}
	public static double convertToHours(int minutes)
	{	
		double t=minutes/60.0;
		return t;
	}

}
