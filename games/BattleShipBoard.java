package oving4;

import java.lang.reflect.Field;

public class BattleShipBoard {
	
	private StringBuilder player1, player2;
	private int[][] boardMap = {{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 
							  {25, 27, 29, 31, 33, 35, 37, 39, 41, 43},
							  {48, 50, 52, 54, 56, 58, 60, 62, 64, 66},
							  {71, 73, 75, 77, 79, 81, 83, 85, 87, 89},
							  {94, 96, 98, 100, 102, 104, 106, 108, 110, 112}, 
							  {117, 119, 121, 123, 125, 127, 129, 131, 133, 135},
							  {140, 142, 144, 146, 148, 150, 152, 154, 156, 158}, 
							  {163, 165, 167, 169, 171, 173, 175, 177, 179, 181},
							  {186, 188, 190, 192, 194, 196, 198, 200, 202, 204},
							  {209, 211, 213, 215, 217, 219, 221, 223, 225, 227}};
	
	public BattleShipBoard(){
		
		player1 = new StringBuilder("");
		player1.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player1.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player1.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player1.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player1.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player1.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player1.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player1.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player1.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player1.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		
		StringBuilder player1Board = Levels.LEVEL_1;
		
		player2 = new StringBuilder("");
		player2.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player2.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player2.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player2.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player2.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player2.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player2.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player2.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player2.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		player2.append("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |\n");
		
		StringBuilder player2Board = Levels.LEVEL_1;
	}
	
	
	
	public void shoot(int x, int y, StringBuilder boardMask, StringBuilder boardPlayer){
		int pos = this.boardMap[x][y];
		if(legalMove(x,y,boardMask,boardPlayer)){
			if(boardPlayer.charAt(pos) == 'X'){
				boardMask.setCharAt(pos,'X');
			}else if(boardPlayer.charAt(pos) == '~'){
				boardMask.setCharAt(pos,'.' );
			} 
		}else{
			System.out.println("You have already tried at " + x + y);
		}
	}
	
	public boolean legalMove(int x, int y, StringBuilder boardMask, StringBuilder boardPlayer){
		int pos = this.boardMap[x][y];
		boolean ok = true;
		if(!(boardMask.charAt(pos) == '~')){
			ok = false;
		}
		return ok;
	}
	
	
	public String toString(){
		System.out.println("This is Player 1's board");
		System.out.println(player1);
		
		System.out.println("This is Player 2's board");
		System.out.println(player2);
		
		return "";
	}

}
