
public class Dartgame_result {
	class Solution {
		public int solution(String dartResult) {
			int answer = 0;
			int N = dartResult.length();

			int[] n_arr = new int[3];
			int n = 1;
			n_arr[0] = Integer.parseInt(dartResult.substring(0, 1));

			Character[] op_arr = new Character[3];
			int op = 0;
			String[] bo_arr = new String[3];

			for (int i = 1; i < N; i++) {
				if (Character.isDigit(dartResult.charAt(i)) == true) {
					if (Character.isDigit(dartResult.charAt(i - 1)) == true) {
						n_arr[n - 1] = 10;
					} else {
						n_arr[n] = Integer.parseInt(dartResult.substring(i, i + 1));
						n++;
					}
				}

				else if (dartResult.charAt(i) == 83 || dartResult.charAt(i) == 68 || dartResult.charAt(i) == 84) {
					op_arr[op] = dartResult.charAt(i);
					op++;
				}

				else {
					bo_arr[n - 1] = "";
					bo_arr[n - 1] += dartResult.charAt(i);
				}
			}

			int[] arr = new int[3];

			for (int i = 0; i < 3; i++) {
				if (op_arr[i] == 83) {
					arr[i] = n_arr[i];
				} else if (op_arr[i] == 68) {
					arr[i] = (int) (Math.pow(n_arr[i], 2));
				} else if (op_arr[i] == 84) {
					arr[i] = (int) (Math.pow(n_arr[i], 3));
				}

				if (bo_arr[i] != null) {
					if (bo_arr[i].equals("#")) {
						arr[i] *= -1;
					} else if (bo_arr[i].equals("*")) {
						arr[i] *= 2;

						if (i != 0) {
							arr[i - 1] *= 2;
						}
					}
				}
			}

			answer = arr[0] + arr[1] + arr[2];
			return answer;
		}
	}
}
