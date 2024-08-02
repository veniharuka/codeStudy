import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
      boolean[] visited = new boolean[computers.length];
        int count =0;
      for(int i=0; i<n; i++){
          if(visited[i]==false) {
              dfs(n,computers,visited,i);
                count++;
          }
          
      }
        return count;
        
    }
    
    public void dfs(int n, int[][] computers,boolean[]visited, int cur ){
        visited[cur] = true;
        for(int i=0; i<n; i++){
            if(visited[i]==false && computers[cur][i]==1){
                dfs(n,computers,visited,i);
            }
        }
    }
}
