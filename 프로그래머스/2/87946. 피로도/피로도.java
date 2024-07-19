public class Solution {
    int answer = 0;
    int n;
    boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        n = dungeons.length;
        visited = new boolean[n];
				
        backtrack(k, 0, dungeons);
        return answer;
    }

    public void backtrack(int k, int cnt, int[][] dungeons) {
				
        if (cnt > answer) {
            answer = cnt;
        }
				
        for (int i = 0; i < n; i++) {
					
            if (k >= dungeons[i][0] && !visited[i]) {						
                visited[i] = true;						
                backtrack(k - dungeons[i][1], cnt + 1, dungeons);				
                visited[i] = false;
            }
        }
    }
}