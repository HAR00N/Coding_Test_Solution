
public class Sum_blank {
	
	class Solution {
	    public int solution(int[] numbers) {
	        int answer = 0;
	        
	        for (int i=0; i<numbers.length; i++) {
				
				switch (numbers[i]) {			
					case 1 : numbers[i] = 1;
							 answer += 1;
							 break;
					case 2 : numbers[i] = 2;
					 	 	 answer += 2;
					 	 	 break;
					case 3 : numbers[i] = 3;
					 		 answer += 3;
					 		 break;
					case 4 : numbers[i] = 4;
					 		 answer += 4;
					 		 break;
					case 5 : numbers[i] = 5;
							 answer += 5;
							 break;
					case 6 : numbers[i] = 6;
							 answer += 6;
							 break;
					case 7 : numbers[i] = 7;
					 		 answer += 7;
					 		 break;
					case 8 : numbers[i] = 8;
					  		 answer += 8;
					  		 break;
					case 9 : numbers[i] = 9;
					 		 answer += 9;
					 		 break;
				}
				
			}
			answer = 45 - answer;
	        
	        return answer;
	    }
	}
}
