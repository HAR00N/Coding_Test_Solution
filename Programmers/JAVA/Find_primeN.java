
public class Find_primeN {
	class Solution {
		public int solution(int n) {
			int answer = n - 1;

			for (int i = 3; i < n + 1; i++) {
				for (int j = 2; j < (int) Math.sqrt(i) + 1; j++) {
					if (i % j == 0) {
						answer--;
						break;
					}
				}
			}
			return answer;
		}
	}
}
