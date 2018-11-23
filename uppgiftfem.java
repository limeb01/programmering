//Skapa ett program som med hjälp av loopar skriver ut följande mönster: sne pyramid
public class uppgiftfem {

	public static void main(String[] args) {
		
		int y=0;
		String x="x";
		
		while(y<=20){
			
			System.out.println(x);
			x=x+"x";
			y=y+1;
		}
		
	}
	
}
