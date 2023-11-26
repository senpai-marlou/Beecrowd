import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		DecimalFormat df = new DecimalFormat("0.0");
		
		double fnum = 0.2;
		double snum = 0.3;
		double tnum = 0.5;
		
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		
		double fnumA = (A*fnum);
		double snumB = (B*snum);
		double tnumC = (C*tnum);
		double ave = fnumA + snumB + tnumC;
	
		System.out.println("MEDIA = " + df.format(ave));

	}

}
