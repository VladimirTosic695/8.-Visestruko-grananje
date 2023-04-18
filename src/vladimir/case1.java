package vladimir;

import java.io.*;

public class case1 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int ocena;
		
		System.out.println("Unesite ocenu od 1 do 5.");
		ocena = Integer.parseInt(bf.readLine());
		
		switch (ocena) {
		case 1:{
			System.out.println("Nedovoljan.");
			break;
		}
		case 2:{
			System.out.println("Dovoljan.");
			break;
		}
		case 3: {
		System.out.println("Dobar.");
		break;
		}
		case 4: {
			System.out.println("Vrlo dobar.");
			break;
		}
		case 5: {
			System.out.println("Odlican.");
			break;
		}
		default:
			System.out.println("Neispravan unos. Vrednost nije 1-5.Unesite ocenu ponovo.");
			
		
			
		}
		

		

	}

}
