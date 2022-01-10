
public class Lottos_bestworst {
	class Solution {
		public int[] solution(int[] lottos, int[] win_nums) {
			
			int[] answer = new int[2];
			for (int i = 0; i < lottos.length; i++) {
				for (int j = 0; j < win_nums.length; j++) {
					if (lottos[i] == 0) {
						answer[0]++;
						break;
					} else if (lottos[i] == win_nums[j]) {
						answer[0]++;
						answer[1]++;
						break;
					}
				}
			}

			for (int i = 0; i < 2; i++) {
				switch (answer[i]) {
				case 0:
					answer[i] = 6;
					break;
				case 1:
					answer[i] = 6;
					break;
				case 2:
					answer[i] = 5;
					break;
				case 3:
					answer[i] = 4;
					break;
				case 4:
					answer[i] = 3;
					break;
				case 5:
					answer[i] = 2;
					break;
				case 6:
					answer[i] = 1;
					break;
				}
			}
			return answer;
		}
	}
}
