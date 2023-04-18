package vladimir;

import java.util.Scanner;

public class Case1Zadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ocena;

		System.out.println("Unesite ocenu");
		ocena = sc.nextInt();

		if (ocena == 5)
			System.out.println("Odlican 5");
		else if (ocena == 4)
			System.out.println("Vrlo dobar 4");
		else if (ocena == 3)
			System.out.println("Dobar 3");
		else if (ocena == 2)
			System.out.println("Dovoljan 2");
		else if (ocena == 1)
			System.out.println("Nedovoljan 1");
		else
			System.out.println("Uneta ocena ne postoji.");

		sc.close();
	}

}
