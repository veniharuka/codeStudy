import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();

       
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i)); 
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false; 
                } else {
                    stack.pop(); 
                }
            }
        }

        
        return stack.isEmpty();
    }
}