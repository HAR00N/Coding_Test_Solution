
public class Sum_aliquot {
	class Solution {
		public int solution(int n) {

			int sum_aliquot = 0;
			
			for (int i = 1; i <= n; i++) {

				if (n % i == 0) {
					sum_aliquot = sum_aliquot + i;
				}

			}

			int answer = sum_aliquot;

			return answer;

		}
	}
}
