package vladimir;

import java.util.Scanner;

public class case6 {

	public static void main(String[] args) {
		// Napisati program koji se učita znak za operaciju (+,-,*,/) 
		// i dva realna operanda, a zatim štampa rezultat.
		Scanner sc = new Scanner(System.in);
		double x,y;
		char operator;
		System.out.println("Unesite znak za operaciju (+,-,*,/).");
		operator = sc.next().charAt(0);
		
		System.out.println("Unesite prvi broj.");
		x = sc.nextDouble();
		System.out.println("Unesite drugi broj.");
		y = sc.nextDouble();
		
		switch (operator) {
		case '+':{
			double zbir = x+y;
			System.out.println("Zbir ovih brojeva je "+zbir);
			break;
		}
		case '-':{
			double razlika = Math.abs(x-y);
			System.out.println("Razlika ovih brojeva je "+razlika);
			break;
		}
		case '*':{
			double proizvod = x*y;
			System.out.println("Proizvod ovih brojeva je "+proizvod);
			break;
		}
		case '/':{
			double kolicnik = x/y;
			System.out.println("Kolicnik ovih brojeva je "+kolicnik);
		}
		default:
			System.out.println("Neispravan unos operatora.Unesite ponovo.");
			sc.close();
		}
		
	}

}
