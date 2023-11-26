import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		double fnum = 3.5;
		double snum = 7.5;
		
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		
		double fnumA = (A*fnum);
		double snumB = (B*snum);
		double ave = (fnumA + snumB) / (fnum+snum);
		
	
		String strDouble = String.format("%.5f", ave);
	
		System.out.println("MEDIA = " + strDouble);

	}

}
