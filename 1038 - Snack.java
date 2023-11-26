import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double X,Y;
		
		X = scan.nextDouble();
		Y = scan.nextDouble();
		
		double A = 4.00;
		double B = 4.50;
		double C = 5.00;
		double D = 2.00;
		double E = 1.50;

		if(X == 1) {
			System.out.printf("Total: R$ " + "%.2f\n", A*Y);}
		
		if(X == 2) {
			System.out.printf("Total: R$ " + "%.2f\n", B*Y);}
		
		if(X == 3) {
			System.out.printf("Total: R$ " + "%.2f\n", C*Y);}
		
		if(X == 4) {
			System.out.printf("Total: R$ " + "%.2f\n", D*Y);}
		
		if(X == 5) {
			System.out.printf("Total: R$ " + "%.2f\n", E*Y);}

	}

}
