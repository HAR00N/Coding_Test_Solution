
public class Sum_matrix {
	class Solution {
		public int[][] solution(int[][] arr1, int[][] arr2) {

			int arr_leng1 = arr1.length;
			int arr_leng2 = arr1[0].length;
			int[][] answer = new int[arr_leng1][arr_leng2];

			for (int i = 0; i < arr_leng1; i++) {
				for (int j = 0; j < arr_leng2; j++) {
					answer[i][j] = arr1[i][j] + arr2[i][j];
				}
			}

			return answer;
		}
	}
}
