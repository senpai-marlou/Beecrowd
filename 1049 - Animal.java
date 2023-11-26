import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String x1, x2, x3;
		
        	x1 = scan.next();
        	x2 = scan.next();
        	x3 = scan.next();

        	if(x1.equals("vertebrado")&& x2.equals("ave") && x3.equals("carnivoro")) {
            		System.out.println("aguia");
        	}
        	if(x1.equals("vertebrado")&& x2.equals("ave") && x3.equals("onivoro")) {
            		System.out.println("pomba");
        	}
        	if(x1.equals("vertebrado")&& x2.equals("mamifero") && x3.equals("onivoro")) {
            		System.out.println("homem");
        	}
        	if(x1.equals("vertebrado")&& x2.equals("mamifero") && x3.equals("herbivoro")) {
            		System.out.println("vaca");
        	}
        	if(x1.equals("invertebrado")&& x2.equals("inseto") && x3.equals("hematofago")) {
           		System.out.println("pulga");
        	}
        	if(x1.equals("invertebrado")&& x2.equals("inseto") && x3.equals("herbivoro")) {
            		System.out.println("lagarta");
        	}
        	if(x1.equals("invertebrado")&& x2.equals("anelideo") && x3.equals("hematofago")) {
            		System.out.println("sanguessuga");
        	}
        	if(x1.equals("invertebrado")&& x2.equals("anelideo") && x3.equals("onivoro")) {
            		System.out.println("minhoca");
       		}				

	}

}
