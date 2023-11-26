import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		float n1 = scan.nextFloat();
		float n2 = scan.nextFloat();
		float n3 = scan.nextFloat();
		float n4 = scan.nextFloat();
		
		float media = ((n1 * 2)+(n2 * 3)+( n3 * 4)+(n4 * 1))/10;
		System.out.println("Media: " + df.format(media));
		
		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		}
		else if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		}
		else if (media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			float n5 = scan.nextFloat();
				System.out.println("Nota do exame: " + n5);
					float avg = ((n5 + media) / 2);
					float avg2 = ((media + n5) / 2);
			if (avg >= 5.0) {
			System.out.println("Aluno aprovado.");
			}
			else if (avg <= 4.9) {
				System.out.println("Aluno reprovado.");
				}
			System.out.println("Media final: "+df.format(avg2));
		}	

	}

}
