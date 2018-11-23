//Skapa ett program som läser in textrader från konsolen och avslutas när texten EXIT skrivs in.
import java.util.Scanner;

public class uppgifttva {
	
public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	
	String text="";
	
	System.out.println("Programmet avslutas när du skriver EXIT");
	
	
		
	
		while(!text.equals("EXIT")) {
		
	
			text=input.next();	
	}

	
	System.out.println("avslutat");	
		
	}
	
}