
public class Caesar_crypto {
	class Solution {
		public String solution(String s, int n) {
			String answer = "";

			int N = s.length();

			char[] arr = new char[N];

			for (int i = 0; i < N; i++) {
				arr[i] = s.charAt(i);

				if (arr[i] >= 65 && arr[i] <= 90) {
					if (arr[i] + n > 90) {
						arr[i] = (char) (arr[i] + n - 26);
					} else {
						arr[i] += n;
					}
				}

				else if (arr[i] >= 97 && arr[i] <= 122) {
					if (arr[i] + n > 122) {
						arr[i] = (char) (arr[i] + n - 26);
					} else {
						arr[i] += n;
					}
				}
			}

			for (int i = 0; i < N; i++) {
				answer += arr[i];
			}

			return answer;
		}
	}
}
