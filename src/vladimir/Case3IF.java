package vladimir;

import java.util.Scanner;

public class Case3IF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char slovo;
		System.out.println("Unesite slovo.");
		slovo = sc.next().charAt(0);
		
		if(slovo == 'A') 
			System.out.println("Slovo "+slovo+" je samoglasnik." );
		else if(slovo == 'E') 
			System.out.println("Slovo "+slovo+" je samoglasnik." );
		else if(slovo == 'O') 
			System.out.println("Slovo "+slovo+" je samoglasnik." );
		else if(slovo == 'I') 
			System.out.println("Slovo "+slovo+" je samoglasnik." );
		else if(slovo == 'U') 
			System.out.println("Slovo "+slovo+" je samoglasnik." );
		
		else if (slovo == 'a') 
			System.out.println("Slovo "+slovo+" je samoglasnik." );
		else if (slovo == 'e') 
			System.out.println("Slovo "+slovo+" je samoglasnik." );
		else if (slovo == 'o') 
			System.out.println("Slovo "+slovo+" je samoglasnik." );
		else if (slovo == 'i') 
			System.out.println("Slovo "+slovo+" je samoglasnik." );
		else if (slovo == 'u') 
			System.out.println("Slovo "+slovo+" je samoglasnik." );
		
			
			else 
				System.out.println("Slovo " +slovo+" je suglasnik.");
			sc.close();
		}
		

	}


