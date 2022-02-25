
public class Secret_map {
	class Solution {
	    public String[] solution(int n, int[] arr1, int[] arr2) {
	       
	    	String[] answer = new String[n];
			String[][] map = new String[2][n];
			
			for (int i=0; i<n; i++) {
				map[0][i] = Integer.toBinaryString(arr1[i]);
				map[1][i] = Integer.toBinaryString(arr2[i]);
			
				int leng_1 = map[0][i].length();
				int leng_2 = map[1][i].length();
				
				if (leng_1 != 5) {				
					for (int j=0; j<5-leng_1; j++) {
						map[0][i] = "0" + map[0][i];
					}				
				}
				
				if (leng_2 != 5) {
					for (int j=0; j< (5-leng_2); j++) {
						map[1][i] = "0" + map[1][i];
					}				
				}		
			}
			
			long[] map_sum = new long[n];
			
			for (int i=0; i<n; i++) {
				map_sum[i] = Long.parseLong(map[0][i]) + Long.parseLong(map[1][i]);
			}
			
			int digit;
			for (int j=0; j<n; j++) {
				for (int i=0; i<n; i++) {
					digit = (int) (map_sum[i] % 10);
				
					if (digit != 0) {
						answer[i] = "#" + answer[i];
					}
					else {
						answer[i] = " " + answer[i];
					}
					map_sum[i] /= 10;
				}
				answer[j] = answer[j].replace("null","");	
			}
	        return answer;
	    }
	}
}
