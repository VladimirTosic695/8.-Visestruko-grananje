package vladimir;

import java.util.Scanner;

public class case3 {

	public static void main(String[] args) {
	// Napisati program koji za uneti karakter stampa da li je samoglasnik ili suglasnik.
		Scanner sc = new Scanner(System.in);

		char slovo;
		System.out.println("Unesite slovo.");
		slovo = sc.next().charAt(0);
		
		switch(slovo) {
		case 'A','E','I','O','U':
		case 'a','e','i','o','u':
		{
			System.out.println("Slovo "+slovo+" je samoglasnik.");
			break;
		}
		default:
			System.out.println("Slovo "+slovo+" je suglasnik.");
			sc.close();
		}
	}

}
