package programmers_Coding_Test;

public class Aliquot_count_sum {
	
	class Solution {
	    public int solution(int left, int right) {
	        int answer = 0;
	        int count_ali = 0;
	        
	        for (int i=left; i<=right; i++){
	            count_ali = 1;
	            
	            for (int j=1; j<i; j++){
	                if (i%j == 0){
	                    count_ali++;
	                }
	            }
	            
	            if (count_ali % 2 ==0){
	                answer = answer+i;
	            }
	            else{
	                answer = answer-i;
	            }
	            
	        }
	        
	        return answer;
	    }
	}

}
