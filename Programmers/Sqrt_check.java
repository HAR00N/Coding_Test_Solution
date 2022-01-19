
public class Sqrt_check {
	class Solution {
		public long solution(long n) {
			long answer = -1;

			long x = (long) Math.sqrt(n);

			if (n == x * x) {
				answer = (x + 1) * (x + 1);
			}

			return answer;
		}
	}
}
