
import java.util.Arrays;

public class Sorted_Integer {

	class Solution {
		public long solution(long n) {
			long answer = 0;
			int n_leng = (int) Math.log10(n) + 1;
			int[] num = new int[n_leng];

			for (int i = 0; i < n_leng; i++) {
				num[i] = (int) (n % 10);
				n = n / 10;
			}
			Arrays.sort(num);

			for (int j = 0; j < n_leng; j++) {
				answer += num[n_leng - 1 - j] * Math.pow(10, n_leng - 1 - j);
			}

			return answer;
		}
	}
}
