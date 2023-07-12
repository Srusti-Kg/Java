import java.util.Scanner;

public class PlanetExplorerApp {

	public static void main(String[] args) {
		
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter radius of sphere");
			double r=sc.nextFloat();
			PlanetExplorer p=new PlanetExplorer();
			System.out.println("area ="+p.calculateSurface(r));
			sc.close();
		

	}

}
