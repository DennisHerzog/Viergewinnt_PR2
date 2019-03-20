
Scanner eingabe = new Scanner(System.in);
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intro i1 = new Intro();
		i1.startgame();
		i1.auswahl();
		
		Board Spiel = new Board ();
		Spiel.initalizeboard();
		Spiel.getfield();
		Spiel.checkboard();
		
		Mensch m1= new Mensch();
		CPU c1 = new CPU();
		Spieler s1= m1;
		Spieler s2=c1;
		s2.turn(Spiel);
	}

}
