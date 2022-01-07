import java.util.Arrays;

public class Kth_num {

	class Solution {
	    public int[] solution(int[] array, int[][] commands) {

			int leng = commands.length;
	        int[] answer = new int [leng];
	        
	        int[] arr = {};
	        int n = 0;
	        
	        for (int i=0; i<leng; i++){
	            int ini = commands[i][0];
	            int fin = commands[i][1];
	            arr = new int [fin-ini+1];
	            n = 0;
	            
	            if (fin==ini) {
	            	answer[i] = array[ini-1];
	            }
	            
	            else {
	            	for (int j=ini-1; j<fin; j++){
	                	arr[n] = array[j];
	                	n++;
	           	 	}
	            	Arrays.sort(arr);
	            	answer[i] = arr[commands[i][2]-1];
	            }
	            
	        }
	        
	        return answer;
	    	}
		}
	}