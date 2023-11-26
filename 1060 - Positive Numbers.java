import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double num1 = 0;
		int possitive = 0;
		
		for (int i = 0; i < 6; i++) {
			num1 = scan.nextDouble();
			if (num1 > 0) {
				possitive += 1;
			}
		}
		System.out.println(possitive+" valores positivos");				

	}

}
