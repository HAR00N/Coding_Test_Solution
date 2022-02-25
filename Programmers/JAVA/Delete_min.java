
public class Delete_min {
	class Solution {
		public int[] solution(int[] arr) {

			int arr_leng = arr.length;

			if (arr_leng == 1) {
				int[] answer = { -1 };
				return answer;
			}

			int min_arr = arr[0];
			int min_add = 0;

			for (int i = 1; i < arr_leng; i++) {

				if (min_arr > arr[i]) {

					min_arr = arr[i];
					min_add = i;

				}
			}

			int[] answer = new int[arr_leng - 1];

			for (int j = 0; j < min_add; j++) {
				answer[j] = arr[j];
			}
			for (int j = min_add + 1; j < arr_leng; j++) {
				answer[j - 1] = arr[j];
			}

			return answer;
		}
	}
}
