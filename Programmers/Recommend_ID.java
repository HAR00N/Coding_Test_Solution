
public class Recommend_ID {
	class Solution {
		public String solution(String new_id) {
			String answer = "";
			
			// 1단계
			// ...!@bat#*..y.abcdefghijklm
			answer = new_id.toLowerCase();

			// 2단계
			// ...bat..y.abcdefghijklm
			for (int i = 0; i < answer.length(); i++) {
				if (answer.charAt(i) >= 'a' && answer.charAt(i) <= 'z') {
				} else if (answer.charAt(i) >= '0' && answer.charAt(i) <= '9') {
				} else if (answer.charAt(i) == '-' || answer.charAt(i) == '_' || answer.charAt(i) == '.') {
				}

				else {
					answer = answer.substring(0, i) + answer.substring(i + 1, answer.length());
					i--;
				}
			}

			// 3단계
			// .bat.y.abcdefghijklm
			for (int i = 1; i < answer.length(); i++) {

				if (answer.charAt(i) == '.') {
					if (answer.charAt(i - 1) == '.') {
						answer = answer.substring(0, i) + answer.substring(i + 1, answer.length());
						i--;
					}
				}
			}

			// 4단계
			// bat.y.abcdefghijklm
			if (answer.charAt(0) == '.') {
				answer = answer.substring(1);
			}

			if (answer.isBlank() == false) {
				if (answer.charAt(answer.length() - 1) == '.') {
					answer = answer.substring(0, answer.length() - 1);
				}
			}

			// 5단계
			if (answer.isBlank() == true) {
				answer += "a";
			}

			// 6단계
			// bat.y.abcdefghi
			if (answer.length() >= 16) {
				answer = answer.substring(0, 15);
			}
			if (answer.isBlank() == false) {
				if (answer.charAt(answer.length() - 1) == '.') {
					answer = answer.substring(0, answer.length() - 1);
				}
			}

			// 7단계
			// bat.y.abcdefghi
			while (answer.length() < 3) {
				answer += answer.substring(answer.length() - 1, answer.length());
			}

			return answer;
		}
	}
}
