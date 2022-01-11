import java.util.Hashtable;

public class Keypad_LorR {
	class Solution {
		public String solution(int[] numbers, String hand) {
			String answer = "";
			int N = numbers.length;
			int[][] position = new int[10][2];
			Hashtable<Integer, int[]> ht = new Hashtable<Integer, int[]>();

			position[0][0] = 3;
			position[0][1] = 1;
			ht.put(0, position[0]);

			for (int i = 0; i < 9; i++) {
				position[i + 1][1] = i % 3;

				if (i >= 0 && i <= 2) {
					position[i + 1][0] = 0;
				} else if (i >= 3 && i <= 5) {
					position[i + 1][0] = 1;
				} else if (i >= 6 && i <= 8) {
					position[i + 1][0] = 2;
				}

				ht.put(i + 1, position[i + 1]);
			}

			int[] hand_L = { 3, 0 };
			int[] hand_R = { 3, 2 };
			int[] target = new int[2];

			for (int i = 0; i < N; i++) {
				target = ht.get(numbers[i]);

				if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
					answer += "L";
					hand_L = target;
				} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
					answer += "R";
					hand_R = target;
				} else {
					double temp_l = distance(target, hand_L);
					double temp_r = distance(target, hand_R);

					if (temp_l > temp_r) {
						answer += "R";
						hand_R = target;
					} else if (temp_l < temp_r) {
						answer += "L";
						hand_L = target;
					} else {
						if (hand.equals("right")) {
							answer += "R";
							hand_R = target;
						} else {
							answer += "L";
							hand_L = target;
						}
					}
				}
			}

			return answer;
		}
	}

	static double distance(int[] n1, int[] n2) {
		double d = Math.abs(n1[0] - n2[0]) + Math.abs(n1[1] - n2[1]);
		return d;
	}
}
