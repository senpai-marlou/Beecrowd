import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int days = scan.nextInt();
		
		int years = days/365;
		days = days % 365;
		int month = days / 30;
		days = days % 30;
		
		System.out.println(years+" ano(s)");
		System.out.println(month+" mes(es)");
		System.out.println(days+" dia(s)");

	}

}
