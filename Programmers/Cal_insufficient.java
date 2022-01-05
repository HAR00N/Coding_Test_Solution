
public class Cal_insufficient {
	class Solution {
	    public long solution(long price, long money, long count) {
	        long answer = 0;
	        long cost = price * (1 + count) * count / 2;
	        
	            
	        if (cost <= money) {
	            answer = 0;
	        }
	        else {
	            answer = cost - money;
	        }
	            
	        return answer;
	    }
	}
}
