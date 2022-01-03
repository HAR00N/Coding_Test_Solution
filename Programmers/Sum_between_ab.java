
public class Sum_between_ab {

	class Solution {
	    public long solution(int a, int b) {
	    	
	        long answer = 0;
	        int min_ab = Math.min(a,b);
	        int max_ab = Math.max(a,b);
	        
	        if (a==b){
	            answer = a;
	        }
	        else {
	        	
	            for (int i=min_ab; i<=max_ab; i++){
	                answer += i;
	            }
	            
	        }
	                
	        return answer;
	    }
	}
}
