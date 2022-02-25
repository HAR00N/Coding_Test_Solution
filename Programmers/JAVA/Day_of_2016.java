
public class Day_of_2016 {
	
class Solution {
		
	    public String solution(int a, int b) {
	        
	      int day_count = 0;
	        
	      for (int i = 1; i <= a; i++){
	          
	          int j = i - 1;

	          /* 31d - 1 3 5 7 8 10 12 */
	          switch (j) {
	          
	          case 0 : day_count = day_count + 0;
	          	break;
	          case 1 : day_count = day_count + 31;
	          	break;
	          case 2 : day_count = day_count + 29;
	          	break;
	          case 3 : day_count = day_count + 31;
	          	break;
	          case 4 : day_count = day_count + 30;
	          	break;
	          case 5 : day_count = day_count + 31;
	          	break;
	          case 6 : day_count = day_count + 30;
	          	break;
	          case 7 : day_count = day_count + 31;
	          	break;
	          case 8 : day_count = day_count + 31;
	          	break;
	          case 9 : day_count = day_count + 30;
	          	break;
	          case 10 : day_count = day_count + 31;
	          	break;
	          case 11 : day_count = day_count + 30;
	          	break;
	          }
	       }
	          
	          
	        day_count = day_count + b;
	        int day_check = day_count % 7;
	        
	        String answer = "";
	        
	        switch (day_check) {
	                
	            case 1 : answer = "FRI";
	                break;	                
	            case 2 : answer = "SAT";
	                break;
                case 3 : answer = "SUN";
	                break;
	            case 4 : answer = "MON";
	                break;
	            case 5 : answer = "TUE";
	                break;
	            case 6 : answer = "WED";
	                break;
	            case 0 : answer = "THU";
	                break;
	        }	        
	        
	        return answer;
	    }
	}
}
