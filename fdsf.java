package ngt; 
import java.util.Scanner;

public class fdsf {

private static String[] words = {"terminator", "ful", "computer", "cow", "rain", "water","globalwarmingisfakepoggers","heyguys","apelsin","banan","äpple","päron","kiwi","pogchamp","emilärbäst","borsjtj","nationalencyklopedin","vattenmelon","nätmelon","honungsmelon","toxic","salty","lol","svenskaraketligan","csgo",
"fjolla","nolla","steam","discord","warszawa","africa","sverige","schweize","usa","bordtennis","fotboll","handboll","landhockey","ishockey","tennis","simning","badminton","golf","minigolf","eurovisionsongcontest","wittlowry","raketligan","apa","rapa","gamer","idiot","bajs","toalett","toilet",
"noob","dafuq","idrott","programmering","matematik","fysik","kemi","historia","religion","teknik","abc123","69","kappa123","420","1337","kreygasm","nordvästersjökustartilleriflygspaningssimulatoranläggningsmaterielunderhållsuppföljningssystemdiskussionsinläggsförberedelsearbeten","sjörövarbåt","åska" };
private static String word;
private static String Dashrisk;
private static int count = 0;

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

while(true) {
// slumpar ett ord från arrayen words
word = words[(int) (Math.random() * words.length)];
Dashrisk = new String(new char[word.length()]).replace("\0", "-");
// ger count värdet 0 så det går att spela igen
count = 0;

// loopar tills spelaren har gissat över 7 gånger
while (count < 7 && Dashrisk.contains("-")) {
System.out.println("Detta är ett hänga gubben spel, gissa ordet!");
System.out.println(Dashrisk);
String guess = sc.next();
hang(guess);
}
System.out.println("");
System.out.println("You guessed " + count + " tries!");
System.out.println("");
System.out.println("Vill du köra en till omgång?");
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

	//Går igenom ordet
	//Om den gissade bokstaven finns så lägger den till den bokstaven i "NewDash"
	//Om användaren redan har gissat rätt den bokstaven så läggs den till i den rätt gissade Stringen "NewDash"
	//annars så läggs "-" till i "NewDash"
	for (int i = 0; i < word.length(); i++) {
		if (word.charAt(i) == guess.charAt(0)) {
			NewDash += guess.charAt(0);
		} else if (Dashrisk.charAt(i) != '-') {
			NewDash += word.charAt(i);
		} else {
			NewDash += "-";
		}
	}

	//om "NewDash" inte har ändrats från förra gången så lägger den till en på count och skriver ut hänga gubben
	//annars så gör den "Dash" till "NewDash"
	if (Dashrisk.equals(NewDash)) {
		count++;
		hangmanImage();
	} else {
		Dashrisk = NewDash;
	}

	//om "Dash" är samma som "word" så vinner användaren
	if (Dashrisk.equals(word)) {
		System.out.println("Du vann! Måste ha varit mycket tur men ordet var ändå " + word);
	}
}

// Min hänga gubben bild
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
System.out.println("Första försöket!");
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

System.out.println("Andra försöket!");
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

System.out.println("Andra försöket!");
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

System.out.println("Fjärde försöket!");
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

System.out.println("Femte försöket!");
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

System.out.println("Sjätte försöket, sista nu annars är du en loser!");
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

System.out.println("GAME OVEEEER!!! AND YOU FAIL hahaha!, ordet är: " + word + "!"); //Om man förlorar
break;
}
}
}
