
public class Finding_Kim {
	class Solution {
	    public String solution(String[] seoul) {
	    	
	        String answer = "";
	        int str_leng = seoul.length;
	        
	        for (int i=0; i<str_leng; i++){
	        	
	            if (seoul[i].contains("Kim") == true){
	                answer = "김서방은 "+i+"에 있다";
	                break;
	            }
	            
	        }
	        return answer;
	    }
	}
}
