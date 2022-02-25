
public class Treat_arr {
	class Solution {
	    public boolean solution(String s) {
	    	
	        boolean answer = true;
	        int leng = s.length();
	        int c = 0;
	        
	        if (leng !=4 && leng !=6){
	            answer = false;
	        }
	        
	        try {
	            c = Integer.parseInt(s);
	        }
	        catch (Exception e){
	            answer = false;
	        }
	        
	        return answer;
	    }
	}
}
