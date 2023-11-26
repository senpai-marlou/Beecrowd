import java.util.Scanner;
import java.lang.Math;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if ((x + y) % Math.min(x, y) == 0) {
			System.out.println("Sao Multiplos");
		}
		
		else {
			System.out.println("Nao sao Multiplos");
		}		

	}

}
