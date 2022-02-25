import java.util.Arrays;

public class Sum_2pick {
	class Solution {
	    public int[] solution(int[] numbers) {
	        		int[] answer = {};
	        int leng = numbers.length;
	            
	        
	        int n = 0;
	        int[] arr = new int [leng * (leng-1) / 2];
	        
	        for (int i=0; i<leng; i++) {
	            for (int j=i+1; j<leng; j++){
	                arr[n] = numbers[i] + numbers[j];
	                n++;
	            }
	        }
	        
	        Arrays.sort(arr);
	        
	        n = 1;
	        int[] arr2 = new int [leng * (leng-1) / 2];
	        arr2[0] = arr[0];
	        
	        for (int i=1; i<arr.length; i++) {
	            if (arr2[n-1] != arr[i]){
	                arr2[n] = arr[i];
	                n++;
	            }
	        }
	        
	        n = 0;
	        
	        if (arr.length == 1) {
	        	answer = arr;
	        }
	        
	        else {
	        	for (int i=1; i<arr.length; i++){
	            	if (arr2[i] == 0) {
	                	break;
	            	}
	            	n++;
	        	}

	        	answer = new int [n+1];
	        
	        	for (int i=0; i<n+1; i++){
	            	answer[i] = arr2[i];
	        	}
	        }
	        
	        return answer;
	    }
	}
}
