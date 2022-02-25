
public class Least_rectangle {
	class Solution {
	    public int solution(int[][] sizes) {
	    	
	        int answer = 0;
	        int leng = sizes.length;
	        
	        int max_size = 0;
			int min_size = 0;
	        
	        for (int i=0; i<leng; i++) {
					max_size = Math.max(max_size, Math.max(sizes[i][0], sizes[i][1]));
					min_size = Math.max(min_size, Math.min(sizes[i][0], sizes[i][1]));
				}
			
			answer = max_size * min_size; 
	        
	        return answer;
	    }
	}
}
