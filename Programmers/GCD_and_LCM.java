
public class GCD_and_LCM {
	class Solution {
		public int[] solution(int n, int m) {
			int[] answer = new int[2];

			int min_num = Math.min(n, m);

			for (int i = 1; i <= min_num; i++) {
				if (n % i == 0 && m % i == 0) {
					answer[0] = i;
				}
			}

			answer[1] = n * m / answer[0];

			return answer;
		}
	}
}
