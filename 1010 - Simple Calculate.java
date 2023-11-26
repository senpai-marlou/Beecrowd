import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int fnum = scan.nextInt();
		int num1 = scan.nextInt();
		float num2 = scan.nextFloat();
		
		int snum = scan.nextInt();
		int num3 = scan.nextInt();
		float num4 = scan.nextFloat();
		
		float tbp = (num1 * num2) + (num3 * num4);
		
		System.out.println("VALOR A PAGAR: R$ "+df.format(tbp));

	}

}
