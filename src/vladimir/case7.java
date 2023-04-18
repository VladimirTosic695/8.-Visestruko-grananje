package vladimir;

import java.util.Scanner;

public class case7 {

	public static void main(String[] args) {
		/*Ako se sa ulaza učitavaju tri prirodna broja k1, k2, k3 koji označavaju
		redni broj dana u godini, ispitati da li označavaju isti dan u nedelji.
		Na primer, isti dan iznačavaju: 2, 16 i 30 ili 344, 351, i 358.*/
		
		Scanner sc = new Scanner(System.in);
		
		int k1,k2,k3;
		System.out.println("Unesite tri puta redni broj dana u godini");
		k1 = sc.nextInt();
		k2 = sc.nextInt();
		k3 = sc.nextInt();
		
		if (k1%7==0 && k2%7==0 && k3%7==0) {
			System.out.println("Ovo su isti dani u nedelji.");
		} else if (k1%7==1 && k2%7==1 && k3%7==1)
			System.out.println("Ovo su isti dani u nedelji.");
		 else if (k1%7==2 && k2%7==2 && k3%7==2)
				System.out.println("Ovo su isti dani u nedelji.");
		 else if (k1%7==3 && k2%7==3 && k3%7==3)
				System.out.println("Ovo su isti dani u nedelji.");
		 else if (k1%7==4 && k2%7==4 && k3%7==4)
				System.out.println("Ovo su isti dani u nedelji.");
		 else if (k1%7==5 && k2%7==5 && k3%7==5)
				System.out.println("Ovo su isti dani u nedelji.");
		 else if (k1%7==6 && k2%7==6 && k3%7==6)
				System.out.println("Ovo su isti dani u nedelji.");
		else {
			System.out.println("Ovi dani nisu isti dani u nedelji.");
		}	sc.close();
	}

}
