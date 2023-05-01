//a tic tac toe game implemented in java 
public class Tic_Tac_Toe {
	static char letter = 'x', choice = 'y';
	public static void main(String[] args) {
		//2D array
		while (choice == 'y') {
			char[][] game = new char [3][3];
			for (int i = 0; i < game.length; i++) {
				for (int j = 0; j < game[i].length; j++) {
					game[i][j] = ' ';
				}
			}
			//play.
			do {
				//switch players.
				letter = letter == 'y' ? 'x' : 'y';
				prompt(game);
			}while (!(diagonal(game) || horizontal(game) || vertical(game)));
			display(game);
			System.out.println("Player " + letter + " won.");
			System.out.print("Would you like to play again? (y/n) : ");
			choice = new java.util.Scanner(System.in).next().charAt(0);
		}
	}
	//display grid contents. 
	public static void display(char[][] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println("-------------");
			System.out.print("| ");
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " | ");
			}
			System.out.println("");
		}
		System.out.println("-------------");
	}
	//get user input.
	public static void prompt(char[][] y) {
		display(y);
		System.out.print("Enter a row (0, 1, 2) for player " + letter + ": ");
		int r = new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter a column (0, 1, 2) for player " + letter + ": ");
		int c = new java.util.Scanner(System.in).nextInt();
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				y[r][c] = letter;
			}
		}
	}
	//if diagonally equal
	public static boolean diagonal(char[][] t) {
		if ((t[0][0] == t[1][1] && t[1][1] == t[2][2] && t[2][2] != ' ') ||
		 (t[2][0] == t[1][1] && t[1][1] == t[0][2] && t[0][2] != ' '))
			return true;
		else
			return false;
	}
	//if horizontally equal
	public static boolean horizontal(char[][] t) {
		if ((t[0][0] == t[1][0] && t[1][0] == t[2][0] && t[2][0] != ' ') ||
		 (t[0][1] == t[1][1] && t[1][1] == t[2][1] && t[2][1] != ' ') || 
		 (t[0][2] == t[1][2] && t[1][2] == t[2][2] && t[2][2] != ' '))
			return true;
		else 
			return false;
	}
	//if vertically equal
	public static boolean vertical(char[][] t) {
		if ((t[0][0] == t[0][1] && t[0][1] == t[0][2] && t[0][2] != ' ') || 
		(t[1][0] == t[1][1] && t[1][1] == t[1][2] && t[1][2] != ' ') || 
		(t[2][0] == t[2][1] && t[2][1] == t[2][2] && t[2][2] != ' '))
			return true;
		else 
			return false;
	}
}
