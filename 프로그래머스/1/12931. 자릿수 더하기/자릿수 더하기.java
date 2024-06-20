public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (n > 0) {
            answer += n % 10;  // 일의 자리 숫자를 더함
            n /= 10;           // n을 10으로 나눠서 한 자리 낮춤
        }

        return answer;
    }
}
