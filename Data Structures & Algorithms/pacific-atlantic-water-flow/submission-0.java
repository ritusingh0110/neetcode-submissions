class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=heights.length;
        int m=heights[0].length;
        boolean[][] pacificvis=new boolean[n][m];
        boolean[][] atlanticvis=new boolean[n][m];

        for(int i=0;i<n;i++){
            dfs(i,0,heights,pacificvis);
        }
        for(int j=0;j<m;j++){
            dfs(0,j,heights,pacificvis);
        }

        for(int i=0;i<n;i++){
            dfs(i,m-1,heights,atlanticvis);
        }
        for(int i=0;i<m;i++){
            dfs(n-1,i,heights,atlanticvis);
        }
        for(int i=0;i<n;i++){
           
            for(int j=0;j<m;j++){
                if(pacificvis[i][j]&&atlanticvis[i][j]){
                     List<Integer> li=new ArrayList<>();
                    li.add(i);
                    li.add(j);
                    ans.add(li);
                }
            }
        }
        return ans;
    }
    public void dfs(int i,int j,int[][]heights,boolean[][] vis){
        vis[i][j]=true;
        int[] dr={-1,0,1,0};
        int dc[]={0,1,0,-1};
        for(int k=0;k<4;k++){
            int nx=i+dr[k];
            int ny=j+dc[k];
            if(nx>=0&&ny>=0&&nx<heights.length&&ny<heights[0].length&&!vis[nx][ny]&& heights[nx][ny]>=heights[i][j]){
                dfs(nx,ny,heights,vis);
            }
        }
    }
}
