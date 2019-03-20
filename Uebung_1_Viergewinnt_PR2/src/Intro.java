import java.util.*;
public class Intro {
	//Scanner
	Scanner objScanner= new Scanner (System.in);
	// Do-while until an accepted input is made
	public void startgame () {
		//Declaration of the variables
		String str_input;
		boolean bol_why = true;
		
		do {
			//Game start Yes/No
			System.out.println("Wollen Sie das Spiel starten? J/N");
			str_input = objScanner.next();
			//If J/j -> leave do-while
			if(str_input.equals("J")|| str_input.equals("j"))
			{
				bol_why = true;
				System.out.println("Spiel gestartet.");
			}
			else
			{
				//If N/n -> Exit Game
				if(str_input.equals("N")|| str_input.equals("n"))
				{
					System.out.println("Exit.");
					System.exit(0);
				}
			//If not N/n or J/j repeat the question for the player again
				else
				{
					System.out.println("Wrong Input!");
					bol_why = false;
				}
			}
		}while(bol_why == false);
	}
	public void auswahl () {
	//Declaration of the variables
	String decision;
	boolean bol_change = true ;
	do {
		System.out.println("Bitte wählen Sie aus (1-3): \n 1 = Spieler vs Spieler \r 2 = Spieler vs CPU \r 3 = CPU vs CPU");
		decision=objScanner.next();
		
		if(decision.equals("1"))
		{
			System.out.println("1");
			bol_change = true;
		}
		else if(decision.equals("2"))
		{
			System.out.println("2");
			bol_change = true;
		}
		else if(decision.equals("3"))
		{
			System.out.println("3");
			bol_change = true;
		}
		else
		{
			System.out.println("Falsche Eingabe, nur Zahlen von 1-3 möglich!");
			bol_change = false;
		}
	}while(bol_change == false);
		
	}
}
