
public class Harshad_num {
	class Solution {
		public boolean solution(int x) {

			boolean answer = false;
			int sum_x = 0;
			int invol_x = (int) Math.log10(x);
			int x_2 = x;

			for (int i = 0; i < invol_x + 1; i++) {
				sum_x += x_2 % 10;
				x_2 = x_2 / 10;
			}

			if (x % sum_x == 0) {
				answer = true;
			}

			return answer;
		}
	}
}
