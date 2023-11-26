import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int hour = N / 3600;
		int minutes = (N % 3600) / 60;
		int seconds = ((N % 3600) % 60) / 1;
		
		System.out.println(hour+":"+minutes+":"+seconds);

	}

}
