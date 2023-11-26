import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		float A = scan.nextFloat();
		float B = scan.nextFloat();
		float C = scan.nextFloat();
		
		float triangle = A+B+C;
		float trapezium = (C*(A+B))/2;
		
		if ((A+B) > C && (A+C)>B && (C+B)>A) {
			System.out.println("Perimetro = "+df.format(triangle));	
		}
		else {
			System.out.println("Area = "+df.format(trapezium));
		}		

	}

}
