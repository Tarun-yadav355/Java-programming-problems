import java.util.LinkedList;
import java.util.Queue;

public class prDSA52 {
    public static int[][] nearst(int[][] grid){
        int a = grid.length;
        int b = grid[0].length;
        boolean[][]vis = new boolean[a][b];
        
        Queue<int[]> ret = new LinkedList<>();
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(grid[i][j]==1){
                    ret.add(new int[]{i,j});
                    vis[i][j]=true;
                }
            }
        }
        int ans[][] = new int[a][b];
        int dirs[][] = {{1,0},{0,1},{-1,0},{0,-1}};
        int dis=0;
        while (!ret.isEmpty()) {
            int sz = ret.size();
            while (sz-->0) {
                int []idx= ret.remove();
                int x= idx[0];
                int y=idx[1];

                ans[x][y]=dis;
                for(int []dir:dirs){
                    int i = x+dir[0];
                    int j = y+dir[1];
                    if(i>=0 && j>=0 && i<a && j<b && vis[i][j]){
                        ret.add(new int[] {i,j});
                        vis[i][j] = true;
                    }
                }

                
            }
            dis++;
            
        }
        return ans;
    }
    public static void main(String[] args) {

        int[][] tet = {{0,1,1,0},{1,1,0,0},{0,0,1,1}};
        System.out.println("nava"+nearst(tet));
        
    }
}
