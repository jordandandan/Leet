
public class NumberofIslands {
	//dfs solution
	 public int numIslands(char[][] grid) {
	        int count = 0;
	        for(int i=0;i<grid.length;i++){
	        	for(int j=0;j<grid[0].length;j++){
	        		if(grid[i][j]=='1'){
	        			count++;
	        			dfs(grid,i,j);
	        		}
	        	}
	        }
	        return count;
	    }

	private void dfs(char[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		if(grid[i][j]=='0'||grid[i][j]=='#')
			return;
		grid[i][j] = '#';
		if(i>0)dfs(grid,i-1,j);
		if(i<grid.length-1)dfs(grid,i+1,j);
		if(j>0)dfs(grid,i,j-1);
		if(j<grid[0].length-1)dfs(grid,i,j+1);
	}
	//Union Find solution
	public int numIslands1(char[][] grid) {
	    if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
	    UF uf = new UF(grid);
	    for (int i = 0; i < grid.length; i++) {
	        for (int j = 0; j < grid[0].length; j++) {
	            if (i > 0) if (uf.connect(i, j, i - 1, j)) uf.union(i, j, i - 1, j);
	            if (i < grid.length - 1) if (uf.connect(i, j, i + 1, j)) uf.union(i, j, i + 1, j);
	            if (j > 0) if (uf.connect(i, j, i, j - 1)) uf.union(i, j, i, j - 1);
	            if (j < grid[0].length - 1) if (uf.connect(i, j, i, j + 1)) uf.union(i, j, i, j + 1);
	        }
	    }
	    return uf.count;
	}
	class UF {
	    int[] id, size;
	    char[][] grid;
	    int count;
	    public UF(char[][] grid) {
	        this.grid = grid;
	        int x = grid.length, y = grid[0].length;
	        this.id = new int[x * y];
	        this.size = new int[x * y];
	        this.count = 0;
	        for (int i = 0; i < x; i++) {
	            for (int j = 0; j < y; j++) {
	                id[i * y + j] = i * y + j;
	                if (grid[i][j] == '1') {
	                    this.count++;
	                    this.size[i * y + j] = 1;
	                }
	            }
	        }
	    }
	    public boolean connect(int x1, int y1, int x2, int y2) {
	        return ((Math.abs(x1 - x2) == 1 || Math.abs(y1 - y2) == 1) && !(Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 1) && grid[x1][y1] == '1' && grid[x2][y2] == '1');
	    }
	    public int find(int x, int y) {
	        int index = x * grid[0].length + y;
	        while (index != id[index]) index = id[index];
	        return index;
	    }
	    public void union(int x1, int y1, int x2, int y2) {
	        int index1 = find(x1, y1), index2 = find(x2, y2);
	        if (index1 == index2) return;
	        if (size[index1] > size[index2]) {
	            size[index1] += size[index2];
	            id[index2] = index1;                
	        }
	        else {
	            size[index2] += size[index1];
	            id[index1] = index2;
	        }
	        count--;
	    }
	}
}
