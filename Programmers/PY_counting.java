
public class PY_counting {
	
	class Solution {
	  boolean solution(String s) {
	   
		  boolean answer = true;

	        int num_p = 0;
	        int num_y = 0;
	        
	        for (int i=0; i<s.length(); i++){
	        	
	            if (s.charAt(i) == 'p' || s.charAt(i) == 'P'){
	                num_p++;
	            }
	            else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
	                num_y++;
	            }
	        }
	        
	        if (num_p != num_y){
	            answer = false;
	        }
	        
	        System.out.println(answer);

	        return answer;
	    }
	}
}
