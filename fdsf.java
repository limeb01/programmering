package ngt; 
import java.util.Scanner;

public class fdsf {

private static String[] words = {"terminator", "ful", "computer", "cow", "rain", "water","globalwarmingisfakepoggers","heyguys","apelsin","banan","�pple","p�ron","kiwi","pogchamp","emil�rb�st","borsjtj","nationalencyklopedin","vattenmelon","n�tmelon","honungsmelon","toxic","salty","lol","svenskaraketligan","csgo",
"fjolla","nolla","steam","discord","warszawa","africa","sverige","schweize","usa","bordtennis","fotboll","handboll","landhockey","ishockey","tennis","simning","badminton","golf","minigolf","eurovisionsongcontest","wittlowry","raketligan","apa","rapa","gamer","idiot","bajs","toalett","toilet",
"noob","dafuq","idrott","programmering","matematik","fysik","kemi","historia","religion","teknik","abc123","69","kappa123","420","1337","kreygasm","nordv�stersj�kustartilleriflygspaningssimulatoranl�ggningsmaterielunderh�llsuppf�ljningssystemdiskussionsinl�ggsf�rberedelsearbeten","sj�r�varb�t","�ska" };
private static String word;
private static String Dashrisk;
private static int count = 0;

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

while(true) {
// slumpar ett ord fr�n arrayen words
word = words[(int) (Math.random() * words.length)];
Dashrisk = new String(new char[word.length()]).replace("\0", "-");
// ger count v�rdet 0 s� det g�r att spela igen
count = 0;

// loopar tills spelaren har gissat �ver 7 g�nger
while (count < 7 && Dashrisk.contains("-")) {
System.out.println("Detta �r ett h�nga gubben spel, gissa ordet!");
System.out.println(Dashrisk);
String guess = sc.next();
hang(guess);
}
System.out.println("");
System.out.println("You guessed " + count + " tries!");
System.out.println("");
System.out.println("Vill du k�ra en till omg�ng?");
System.out.println("[1] - Yes");
System.out.println("[2] - No");


char temp = sc.next().toLowerCase().charAt(0);
// om spelaren vill spela igen
if(temp == '2' || temp == 'n') {
break;
}

}
sc.close();
}

public static void hang(String guess) {
	String NewDash = "";

	//G�r igenom ordet
	//Om den gissade bokstaven finns s� l�gger den till den bokstaven i "NewDash"
	//Om anv�ndaren redan har gissat r�tt den bokstaven s� l�ggs den till i den r�tt gissade Stringen "NewDash"
	//annars s� l�ggs "-" till i "NewDash"
	for (int i = 0; i < word.length(); i++) {
		if (word.charAt(i) == guess.charAt(0)) {
			NewDash += guess.charAt(0);
		} else if (Dashrisk.charAt(i) != '-') {
			NewDash += word.charAt(i);
		} else {
			NewDash += "-";
		}
	}

	//om "NewDash" inte har �ndrats fr�n f�rra g�ngen s� l�gger den till en p� count och skriver ut h�nga gubben
	//annars s� g�r den "Dash" till "NewDash"
	if (Dashrisk.equals(NewDash)) {
		count++;
		hangmanImage();
	} else {
		Dashrisk = NewDash;
	}

	//om "Dash" �r samma som "word" s� vinner anv�ndaren
	if (Dashrisk.equals(word)) {
		System.out.println("Du vann! M�ste ha varit mycket tur men ordet var �nd� " + word);
	}
}

// Min h�nga gubben bild
public static void hangmanImage() {
switch (count) {
case 1:
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("_____");

System.out.println("");
System.out.println("F�rsta f�rs�ket!");
break;

case 2:
System.out.println("");
System.out.println(" |");
System.out.println(" |");
System.out.println(" |");
System.out.println(" |");
System.out.println(" |");
System.out.println(" |");
System.out.println("_|___");

System.out.println("Andra f�rs�ket!");
break;

case 3:
System.out.println(" ______");
System.out.println(" | /");
System.out.println(" |/");
System.out.println(" |");
System.out.println(" |");
System.out.println(" |");
System.out.println(" |");
System.out.println("_|___");

System.out.println("Andra f�rs�ket!");
break;

case 4:
System.out.println(" ______");
System.out.println(" | / |");
System.out.println(" |/");
System.out.println(" |");
System.out.println(" |");
System.out.println(" |");
System.out.println(" |");
System.out.println("_|___");

System.out.println("Fj�rde f�rs�ket!");
break;

case 5:
System.out.println(" ______");
System.out.println(" | / |");
System.out.println(" |/ O");
System.out.println(" | |");
System.out.println(" |");
System.out.println(" |");
System.out.println(" |");
System.out.println("_|___");

System.out.println("Femte f�rs�ket!");
break;

case 6:
System.out.println(" ______");
System.out.println(" | / |");
System.out.println(" |/ O");
System.out.println(" | |");
System.out.println(" | / \\");
System.out.println(" |");
System.out.println(" |");
System.out.println("_|___");

System.out.println("Sj�tte f�rs�ket, sista nu annars �r du en loser!");
break;

case 7:
System.out.println(" ______");
System.out.println(" | / |");
System.out.println(" |/ O");
System.out.println(" | /|\\");
System.out.println(" | / \\");
System.out.println(" |");
System.out.println(" |");
System.out.println("_|___");

System.out.println("GAME OVEEEER!!! AND YOU FAIL hahaha!, ordet �r: " + word + "!"); //Om man f�rlorar
break;
}
}
}
