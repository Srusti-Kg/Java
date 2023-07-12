import java.util.Scanner;

public class FinanceCalculatorApp {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal,rate,time ");
		double p=sc.nextDouble();
		double r=sc.nextDouble();
		double t=sc.nextDouble();
		FinanceCalculator f=new FinanceCalculator();
		System.out.println("intrest="+f.calculateSimpleInterest(p,r,t));
		sc.close();
	}

	
	}


