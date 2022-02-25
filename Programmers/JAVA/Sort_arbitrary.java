import java.util.Arrays;

public class Sort_arbitrary {
	class Solution {
		public String[] solution(String[] strings, int n) {
			String[] answer = {};
			int leng = strings.length;

			Arrays.sort(strings);

			for (int i = 0; i < leng; i++) {
				for (int j = 0; j < leng - i - 1; j++) {
					if (strings[j].charAt(n) > strings[j + 1].charAt(n)) {
						String temp = strings[j + 1];
						strings[j + 1] = strings[j];
						strings[j] = temp;
					}
				}
			}

			answer = strings;

			return answer;
		}
	}
}
