package programmers_Coding_Test;

public class Make_prime {
	
	class Solution {
	    public int solution(int[] nums) {
	        
	        int answer = -0;
	        int nums_len = nums.length;
	        boolean isPrime = true;
	        
	        for (int i = 1; i <= nums_len - 2; i++){
	        
	        	int a = nums[i-1];
	        
	        	for (int j = i+1; j <= nums_len - 1; j++) {
	            
	        		int b = a;
	        		b += nums[j-1];    
	            
	        		for (int k = j+1; k <= nums_len; k++){
	        			
	        			int c = b;
	        			c = c + nums[k-1];
	                
	        			for (int l = 2; l < c; l++) {
	        				
	        				if (c%l == 0) {
	        					isPrime = false;
	        					break;
	        				}
	        			}
	               
	        			if (isPrime == true){
	        				answer = answer + 1;
	        			} 
	        			
	        			isPrime = true;
	        		}
	        	}
	        
	        }
	       
	        return answer;
	    }
	}

}
