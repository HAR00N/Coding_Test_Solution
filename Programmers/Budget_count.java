import java.util.Arrays;

public class Budget_count {
	class Solution {
		public int solution(int[] d, int budget) {
			
			int answer = 0;
			int n = 0;
			Arrays.sort(d);

			for (int i = 0; i < d.length; i++) {
				n += d[i];

				if (n > budget) {
					break;
				}
				answer++;
			}

			return answer;
		}
	}
}
