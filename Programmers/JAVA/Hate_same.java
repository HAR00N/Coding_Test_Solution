
public class Hate_same {

	public class Solution {
	
		public int[] solution(int []arr) {
	    
			int[] answer = {};
	        int leng = arr.length; 
	        
	        int[] sol = new int [leng];
	        sol[0] = arr[0];
	        int n = 0;
	        
	        for (int i=1; i < leng; i++){
	            if (sol[n] != arr[i]){
	                n++;
	                sol[n] = arr[i];
	            }
	            
	        }
	        
	        answer = new int [n+1];
	        for (int i=0; i<=n; i++){
	            answer[i] = sol[i];
	        }
	        	        
	        return answer;
	    }
	}	
}
