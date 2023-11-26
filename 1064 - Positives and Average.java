import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.0");
		Scanner scan = new Scanner(System.in);
		
		double num1 = 0;
		int possitive = 0;
		
		float num2 = 0;
		float avg = 0; 
		
		for (int i = 0; i < 6; i++) {
			num1 = scan.nextDouble();
			if (num1 > 0) {
				possitive += 1;
				num2 += num1;
			}
		}
		avg = num2 / possitive;
		System.out.println(possitive+" valores positivos");
		System.out.println(df.format(avg));					

	}

}
