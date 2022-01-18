
public class Weird_str {
	class Solution {
		public String solution(String s) {
			String answer = "";
			int N = s.length();
			String[] str = new String[N];

			for (int i = 0; i < N; i++) {
				str[i] = Character.toString(s.charAt(i));
			}

			int n = 0;
			for (int i = 0; i < N; i++) {
				if (str[i].equals(" ") == true) {
					n = 0;
					answer += " ";
				}

				else if (n % 2 == 1) {
					n++;
					answer += str[i].toLowerCase();
				}

				else {
					n++;
					answer += str[i].toUpperCase();
				}
			}

			return answer;
		}
	}
}
