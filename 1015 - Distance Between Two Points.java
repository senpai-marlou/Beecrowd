import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		DecimalFormat dc = new DecimalFormat("##.####");
		
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();		
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();	
		
		double Distance = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		System.out.println(dc.format(Distance));

	}

}
