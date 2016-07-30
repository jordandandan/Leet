
public class WordSearch {
	 public boolean exist(char[][] board, String word) {
	        char[] array = word.toCharArray();
	        if(word==null||word.length()==0	)
	        	return true;
	        boolean find = false;
	        for(int i=0;i<board.length;i++)
	        	for(int j=0;j<board[0].length;j++){
	        		if(dfs(board,array,i,j,0)){
	        			find = true;
	        			break;
	        		}
	        			
	        	}
	        return find;
	    }

	private boolean dfs(char[][] board, char[] array, int i, int j,int index) {
		// TODO Auto-generated method stub
		if(index==array.length){
			return true;
		}
		if(i<0||i>board.length-1||j<0||j>board[0].length-1)
			return false;
		if(board[i][j]!=array[index]){
			return false;
		}
		
		board[i][j] ^= 256;
		boolean exsit = false;
		exsit = dfs(board,array,i+1,j,index+1)||dfs(board,array,i-1,j,index+1)||dfs(board,array,i,j+1,index+1)||dfs(board,array,i,j-1,index+1);
		return exsit;
	}
}
