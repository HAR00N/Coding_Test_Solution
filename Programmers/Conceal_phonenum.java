
public class Conceal_phonenum {
	class Solution {
		public String solution(String phone_number) {
			String answer = "";
			int num_leng = phone_number.length();

			for (int i = 0; i < num_leng - 4; i++) {
				answer += "*";
			}

			answer += phone_number.substring(num_leng - 4);

			return answer;
		}
	}
}
