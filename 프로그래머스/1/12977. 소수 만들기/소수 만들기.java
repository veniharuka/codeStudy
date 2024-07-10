class Solution {
    public int solution(int[] nums) {
        
        int sum = 0;    
        int counter=0;
        
        for(int i=0; i<nums.length-2; i++ ){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(isPrime(nums[i]+nums[j]+nums[k]))
                    counter++;
                }
            }
        }
            return counter;
        }
        
        
        
        private boolean isPrime(int sum) {
        for (int i = 2; i * i <= sum; i++) {
            if (sum % i == 0) return false;
        }
        return true;
    }
}