import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);
            
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 4) == 1 &&
                    stack.get(size - 3) == 2 &&
                    stack.get(size - 2) == 3 &&
                    stack.get(size - 1) == 1) {
                    
                    // 햄버거를 만들 수 있는 경우
                    answer++;
                    // 마지막 네 개의 요소 제거
                    for (int j = 0; j < 4; j++) {
                        stack.pop();
                    }
                }
            }
        }
        return answer;
    }
}
