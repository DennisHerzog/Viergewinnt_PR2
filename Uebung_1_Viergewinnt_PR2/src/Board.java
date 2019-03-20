
public class Board {
	char [][] field;
	char n = 7, m = 6; // n=horizontal(Spalte); m=vertikal(Zeilen)
	// erstellung des Boards

	public void initalizeboard() {
		field = new char[n][m];
		for (char a = 0; a < n; a++) {
			for (char b = 0; b < m; b++) {
			}
		}
	}

	// ausgabe des boards
	public void getfield() {
		for (char a = 0; a < n; a++) {
			for (char b = 0; b < m; b++) {
				System.out.print("[" + field[a][b] + "]"); // erstellung des feldes mit syso
			}
			System.out.println("\n"); // Zeilenumbruch
		}
	}
	public void checkboard (char field [][]) {
		for(int i=5;i>=0;i--) {
			if(field[i][Spalte]!=("[]")) 
			{
				
			
			}
			else 
			{
				Spiel.field[][Spalte]=this.Zeichen;
				break;
			}
		}

}
