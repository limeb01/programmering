//Skapa ett program som l�ser in textrader fr�n konsolen och avslutas n�r texten EXIT skrivs in.
import java.util.Scanner;

public class uppgifttva {
	
public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	
	String text="";
	
	System.out.println("Programmet avslutas n�r du skriver EXIT");
	
	
		
	
		while(!text.equals("EXIT")) {
		
	
			text=input.next();	
	}

	
	System.out.println("avslutat");	
		
	}
	
}