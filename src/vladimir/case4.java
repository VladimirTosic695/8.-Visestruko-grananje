package vladimir;

import java.util.Scanner;

public class case4 {
	
	public static void main(String[] args) {
		// Napisati program kojim se ispisuju moguće vrednosti koordinata x i y zavisno 
		// od broja kvadranta koji se unosi.
		
		Scanner sc = new Scanner(System.in);
		
		int kvadrant;
		System.out.println("Unesite broj kvadranta.");
		kvadrant = sc.nextInt();
		
		switch(kvadrant) {
		case 1:{
			System.out.println("Moguce vrednosti koordinata x i y za "+kvadrant+". kvadrant su od 0 do 90 stepeni.");
		break;
		}
		case 2:{
			System.out.println("Moguce vrednosti koordinata x i y za "+kvadrant+". kvadrant su od 90 do 180 stepeni.");
		break;
		}
		case 3: {
			System.out.println("Moguce vrednosti koordinata x i y za "+kvadrant+". kvadrant su od 180 do 270 stepeni.");
		break;
		}
		case 4: {
			System.out.println("Moguce vrednosti koordinata x i y za "+kvadrant+". kvadrant su od 270 do 360 stepeni.");
		break;
		}
		default:
			System.out.println("Uneti broj kvadranta ne postoji. Unesite vrednost od 1 do 4.");
		sc.close();
		
		}
	
		
		
		
	}

}
