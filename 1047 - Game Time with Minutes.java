import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int start1 = scan.nextInt(); //Start hour
		int start2 = scan.nextInt(); //Start minutes
		int end1 = scan.nextInt(); //End hour
		int end2 = scan.nextInt(); //End minutes
		
		int min = 0;
		int hour = 0;
		
	if (start1 >= 0 && start1 <= 24 && end1 >= 0
                	&& end1 <= 24 && start2 >= 0 && start2 <= 60
			&& end2 >= 0 && end2 <= 60) {
            	if (end2 > start2) {
                	min = end2 - start2;
            	}
            	else if (end2 < start2) {
                	min = end2- start2 + 60;
                	end1 = end1 - 1;
		    }
            	if (end1 >= start1) {
                	hour = end1 - start1;
            	}
            	else if (end1 < start1) {
                	hour = end1- start1 + 24;
            	}
            	if (hour == 0 && min == 0) {
               	 	hour = 24;
            	}
        }
	System.out.println("O JOGO DUROU " + hour + " HORA(S) E " + min + " MINUTO(S)");				

	}

}
