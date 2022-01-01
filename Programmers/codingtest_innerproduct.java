package programmers_Coding_Test;

public class codingtest_innerproduct {
	
	class Solution {
		public int solution(int[] a, int[] b) {
			
			int answer = 0;
			int arr_leng = a.length;

			for (int i=0; i<arr_leng; i++){
				answer += a[i] * b[i];
			}
			
			return answer;
			
		}
	}
}
