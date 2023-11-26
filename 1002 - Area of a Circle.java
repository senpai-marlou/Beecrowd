import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		
		double R = scan.nextDouble();
		double n = 3.14159;
		double Area = 0;
		
		Area = n * (R * R);
		
		System.out.println("A="+df.format(Area));

	}

}
