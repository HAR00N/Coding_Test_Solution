
public class Sorted_N {
	class Solution {
		public int[] solution(long n) {

			int n_leng = (int) Math.log10(n) + 1;
			int[] answer = new int[n_leng];
			long[] arr = new long[n_leng];

			for (int i = 0; i < n_leng; i++) {
				arr[i] = n % 10;
				answer[i] = (int) arr[i];
				n = n / 10;
			}

			return answer;
		}
	}
}
