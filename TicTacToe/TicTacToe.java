import java. util.Scanner;
public class TicTacToe {
	
	private String[][] board;
	private static final int ROWS = 3; 
	private static final int COLS = 3;

	public TicTacToe(){
			board = new String[ROWS][COLS]; 
			for (int r = 0; r < ROWS; r++)
				for (int c = 0; c < COLS; c++) board[r][c] = " ";
}

public void makeMove(int r, int c, String symbol) {
board[r][c] = symbol; }



public String toString() {
String s = ""; 
for (int r = 0; r < ROWS; r++) {
s = s + "|";
for (int c = 0; c < COLS; c++)
s = s + board[r][c]; s = s + "|\n";}
return s;

}
public static void main (String[] args) {
	int d=0;
	TicTacToe game=new TicTacToe();
	
	Scanner input = new Scanner (System.in); 
	System.out.print("Enter you value ");
	int i=0;
	String playerA = "x";
	String playerB ="o";
	while (i<9) {
		int r=input.nextInt();
		int c=input.nextInt();
	
	if (i%2==0) {game.makeMove(r, c, playerA);}
	if (i%2==1) {game.makeMove(r, c, playerB);}
	
	i++;
	System.out.println(game.toString());
	if (game.board[0][0]=="o" && game.board[0][1]=="o"&& game.board[0][2]=="o") 
	{d++;}
	else if (game.board[1][0]=="o" && game.board[1][1]=="o"&& game.board[1][2]=="o") 
	{d++;}
	else if (game.board[2][0]=="o" && game.board[2][1]=="o"&& game.board[2][2]=="o") 
	{d++;}
	
	else if (game.board[0][0]=="x" && game.board[0][1]=="x"&& game.board[0][2]=="x") 
	{d+=3;}
	else if (game.board[1][0]=="x" && game.board[1][1]=="x"&& game.board[1][2]=="x") 
	{d+=3;}
	else if (game.board[2][0]=="x" && game.board[2][1]=="x"&& game.board[2][2]=="x") {
		d+=3;}
	
	if (game.board[0][0]=="o" && game.board[1][0]=="o"&& game.board[0][2]=="o")
	{d++;}
	else if (game.board[0][1]=="o" && game.board[1][1]=="o"&& game.board[1][2]=="o") 
	{d++;}
	else if (game.board[0][2]=="o" && game.board[1][2]=="o"&& game.board[2][2]=="o") 
	{d++;}
	
	else if (game.board[0][0]=="x" && game.board[1][0]=="x"&& game.board[0][2]=="x") 
	{d+=3;}
	else if (game.board[0][1]=="x" && game.board[1][1]=="x"&& game.board[1][2]=="x") 
	{d+=3;}
	else if (game.board[0][2]=="x" && game.board[1][2]=="x"&& game.board[2][2]=="x")
	{d+=3;}
	
		
	if (d==1) {System.out.println("player B wins"); d+=9;}
	else if (d==3) {System.out.println("player A wins"); d+=9;}
	}
	}
	}	

