
public class Finding_Kim {
	class Solution {
	    public String solution(String[] seoul) {
	    	
	        String answer = "";
	        int str_leng = seoul.length;
	        
	        for (int i=0; i<str_leng; i++){
	        	
	            if (seoul[i].contains("Kim") == true){
	                answer = "�輭���� "+i+"�� �ִ�";
	                break;
	            }
	            
	        }
	        return answer;
	    }
	}
}
