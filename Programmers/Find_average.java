
public class Find_average {
	class Solution {
		public double solution(int[] arr) {

			int arr_leng = arr.length;
			double sum_arr = 0;

			for (int i = 0; i < arr_leng; i++) {
				sum_arr = sum_arr + arr[i];
			}

			double answer = sum_arr / arr_leng;

			return answer;
		}
	}
}
