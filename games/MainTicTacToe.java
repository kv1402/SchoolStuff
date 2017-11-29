package oving4;

public class MainTicTacToe {
	public static void main(String[] args){
		
	
		
		TicTacToe board2 = new TicTacToe();
		
		System.out.println(board2);
	
		board2.setCell('x', 0, 2);
		
		System.out.println(board2);
		
		board2.setCell('o', 0, 2);
		System.out.println(board2.getCurrentPlayer());
	
	}

}
