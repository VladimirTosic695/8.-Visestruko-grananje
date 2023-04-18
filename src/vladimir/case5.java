package vladimir;

import java.util.Scanner;

public class case5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Za kapacitet redne veze unesite 1, a za kapacitet paralelne veze 2.");
		int izbor = sc.nextInt();
		double Ce,c1,c2;
		System.out.println("Unesite kapacitet prvog kondenzatora (c1) ");
		c1 = sc.nextDouble();
		System.out.println("Unesite kapacitet drugog kondenzatora (c2) ");
		c2 = sc.nextDouble();
		
		switch (izbor) {
		case 1:{
			Ce = c1*c2/(c1+c2);
			System.out.println("Kapacitet redne veze Ce = "+Ce);
			break;
		}
		case 2:{
			Ce = c1+c2;
			System.out.println("Kapacitet paralelne veze Ce = "+ Ce);
			break;
		}
		default:
			System.out.println("Pogresan unos. Unesite 1 za rednu ili 2 za paralelnu vezu.");
		}
	
		
	sc.close();

	
	}

}
