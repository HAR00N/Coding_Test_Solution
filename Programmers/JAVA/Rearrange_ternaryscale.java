
public class Rearrange_ternaryscale {
	
	class Solution {
	    public int solution(long n) {
	    	
	        int answer = 0;
	        int log_3 = (int)(Math.log10(n) / Math.log10(3) );
	        int[] index = new int [log_3 + 1];
	        
	        for (int i=0; i<=log_3; i++){
	            index[i] = (int) (n / Math.pow(3, log_3-i));
	            n = n % (int)(Math.pow(3, log_3-i));
	        }
	        
	        for (int i=0; i<=log_3; i++){
	            answer += index[i] * (int)Math.pow(3, i);
	        }
	        
	        return answer;
	    }
	}
}
