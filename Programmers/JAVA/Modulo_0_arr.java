import java.util.Arrays;

public class Modulo_0_arr {

	class Solution {
	    public int[] solution(int[] arr, int divisor) {
	    	
	        int count = 0;
	        int arr_leng = arr.length;
	        int[] answer = {};
	        
	        int[] arr_c = new int[arr_leng];
	        
	        for (int i=0; i<arr_leng; i++){
	            if (arr[i]%divisor == 0){
	                arr_c[count] = arr[i];
	                count++;
	            }
	        }
	        
	        if (count == 0){
	            answer = new int[1];
	            answer[0] = -1;
	        }
	        else {
	        
	        	answer = new int [count];
	        
	            for (int j=0; j<count; j++){
	            answer[j] = arr_c[j];    
	            }
	        
	            Arrays.sort(answer);
	        }
	            return answer;
	    }
	}
	
}
