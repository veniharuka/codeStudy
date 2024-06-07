class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] control_list=control.split("");
        
        for(int i=0; i<control_list.length; i++){
            if (control_list[i].equals("w")){
                answer=answer+1;
            }else if(control_list[i].equals("s")){
                answer=answer-1;
            }
            else if(control_list[i].equals("d")){
                answer=answer+10;
            }else if(control_list[i].equals("a")){
                answer=answer-10;
            }
            
        }
        
        return answer;
    }
}