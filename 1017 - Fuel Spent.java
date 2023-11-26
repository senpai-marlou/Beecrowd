import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double hours = scan.nextDouble();
		double speed = scan.nextDouble();
		double liters = ((hours*speed)/12);
		
		String strDouble = String.format("%.3f", liters);
		System.out.println(strDouble);	

	}

}
