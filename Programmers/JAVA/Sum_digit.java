
public class Sum_digit {
	public class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        int invol = (int)Math.log10(n);
	        
	        for (int i=invol; i>=0; i--){
	            int num_add = (int)Math.pow(10,i);
	            int num_index = n / num_add;
	            answer += num_index;
	            n -= num_index * num_add;
	            
	        }
	        
	        System.out.println(answer);

	        return answer;
	    }
	}
}
