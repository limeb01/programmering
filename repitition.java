import java.util.Scanner;

public class repitition{

	public static void main(String[] args) {

		// initierar variabler
		int tal1 = 0;
		int summa = 0;
		double average = 0;

		Scanner input = new Scanner(System.in);

		// skriver ut ett meddelande
		System.out.print("Please type 10 numbers: ");

		// summerar 10 tal som matats in fr�n konsolen
		for (int i = 1; i <= 10; i++) {
			
			tal1 = input.nextInt(); // l�ser in ett heltal fr�n konsolen

			// villkor som testar om talet �r negativt och utf�r utefter det
			if (tal1 < 0) {
				System.out.println("Your number in negative. Please type again! ");
				i--;
			}

			// SKRIV IN ETT VILLKOR S� ATT TAL > 20 INTE SKA SKRIVAS UT
			if (tal1 > 20) {
				System.out.println("Your number is to high. Please type again! ");
				i--;
			}
			// om talet �r positivt s� utf�r detta ist�llet
			else {
				summa += tal1;
			}
		}

		
		// while-loopen nedan g�r samma som for-loopen ovan
		int antalLoopar = 1;

		while (antalLoopar <= 10) {
			// tal1 += input.nextInt(); (f�r att slippa upprepa inmatning)
			antalLoopar++;
		}

		average = (double) summa / 10; // (double) g�r om int till double

		System.out.println(summa);
		System.out.println(average);

	}
}
