class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a%2==1 &&b%2==1){
            return answer=a*a+b*b;
        }else if(a%2==1 || b%2==1){
            return answer=2*(a+b);
        }else{
            return answer=Math.abs(a-b);
        }
        
       
        
    }
}