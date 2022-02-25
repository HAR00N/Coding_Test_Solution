import java.util.Arrays;

public class Sorted_arr {
	
	class Solution {
	    public String solution(String s) {
	        
	    	String answer = "";
	        
	        int leng = s.length();
	        char[] chr = new char [leng];
	        
	        for (int i=0; i<leng; i++){
	            chr[i] = s.charAt(i);
	        }
	        
	        Arrays.sort(chr);
	        
	        for (int i=0; i<leng; i++){
	            answer += chr[leng-1-i];
	        }
	        
	        return answer;
	    }
	}
}
