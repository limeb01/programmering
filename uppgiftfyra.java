//Skriv ett program som beräknar summan av alla tal under 10 000 som är jämnt delbara med 7. 
//7, 14, 21, 28 osv
public class uppgiftfyra {

	public static void main(String[] args) {
		
	
	
	double tal=7;
	double summa=0;
	
	
	while(tal<=10000) {
		
		summa=tal+summa;
		tal=tal+7;
	}
	System.out.print("The summa is "+summa );
	}
}
