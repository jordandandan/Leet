package src;

import java.util.Arrays;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		boolean[] visited = new boolean[10];
		//row
		for(int i=0; i<9; i++) {
			Arrays.fill(visited, false);
			for(int j=0; j<9; j++) {
				if( !check(visited, board[i][j]) ) {
					return false;
				}
			}
		}
		//col
		for(int i=0; i<9; i++) {
			Arrays.fill(visited, false);
			for(int j=0; j<9; j++) {
				if( !check(visited, board[j][i]) ) {
					return false;
				}
			}
		}
		//sub matrix
		for(int i=0; i<9; i+=3) {
			for(int j=0; j<9; j+=3) {
				Arrays.fill(visited, false);
				for(int k=0; k<9; k++) {
					if( !check(visited, board[i+k/3][j+k%3]) ) {
						return false;
					}
				}
			}
		}
		return true;
    }
	
	private boolean check(boolean[] visited, char c) {
		if(c == '.') {
			return true;
		}
		int num = c - '0';
		if(num<1 || num>9 ||visited[num]) {
			return false;
		} else {
			visited[num] = true;
		}
		return true;
	}
	 
}
