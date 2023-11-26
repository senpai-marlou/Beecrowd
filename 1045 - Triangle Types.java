import java.util.Scanner;
import java.lang.Math;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		double A = Math.max(num1, Math.max(num2, num3));
		double B = 0;
		double C = 0;
		
		if (A == num1) {
			B =Math.max(num2, num3);
			C =Math.min(num2, num3);
		}
		if (A == num2) {
			B =Math.max(num1, num3);
			C =Math.min(num1, num3);
		}
		if (A == num3) {
			B =Math.max(num2, num1);
			C =Math.min(num2, num1);
		}
		
		if (A >= (B+C)) {
			System.out.println("NAO FORMA TRIANGULO");
			}
		else if ((A*A) == (B*B)+(C*C)) {
			System.out.println("TRIANGULO RETANGULO");	
		}
		else if ((A*A) > (B*B)+(C*C)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		else if ((A*A) < (B*B)+(C*C)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		
		if (A == B && A == C && B == C) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		else if (((A == B) && (A != C)) || ((A == C) && (A != B)) || ((B == C) && (B != A)) ) {
			System.out.println("TRIANGULO ISOSCELES");
		}		

	}

}
