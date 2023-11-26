import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int fnum = scan.nextInt();
		int snum = scan.nextInt();
		float tnum = scan.nextFloat();
		
		double sal = snum * tnum;
		
		System.out.println("NUMBER = "+fnum);
		System.out.println("SALARY = U$ "+df.format(sal));

	}

}
