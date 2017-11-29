package oving4;

public class TicTacToe {
	private StringBuilder board;
	private int[][] boardArray = {{1, 5, 9}, {23, 27, 31}, {45, 49, 53}};
	private char player;
	
	public TicTacToe(){
		
		board = new StringBuilder("");
		board.append("   |   |   \n");
		board.append("-----------\n");
		board.append("   |   |   \n");
		board.append("-----------\n");
		board.append("   |   |   \n");
	}
	
	public char getCell(int x, int y){
		int pos = boardArray[x][y];
		char pos1 = board.charAt(pos);
		return pos1;
	}
	
	
	public boolean isOccupied(int x, int y){
		int pos = boardArray[x][y];
		boolean ok = false;
		if(board.charAt(pos) == 'x' || board.charAt(pos) == 'o' ){
			ok = true;
		}
		return ok;
	}
	
	
	//feil inni den
	public boolean setCell(char c, int x, int y){
		int pos = boardArray[x][y];
		
		if(c == 'x'){
			this.player = 'o';
		}else if (c == 'o'){
			this.player = 'x';
		}
	
		boolean set= true;
		if(isOccupied(x,y) ){
			System.out.println("Hey, it is not a legal move! ");
			this.player = c;
			set = false;
		}else{
			board.insert(pos, c);
		}
		return set;
	}
	
	
	public char getCurrentPlayer(){
		return this.player;
	}

	public int lenBoard(){
		return this.board.length();
	}
	
	public String toString(){
		System.out.println(board);
		return "";
	} 
}
