import java.util.Stack;

public class Claw_machine {
	class Solution {
		public int solution(int[][] board, int[] moves) {
			int answer = 0;
			int leng_mov = moves.length;
			int leng_boa = board.length;

			Stack<Integer> stack = new Stack<>();

			int fri = 0;

			for (int i = 0; i < leng_mov; i++) {

				for (int j = 0; j < leng_boa; j++) {
					fri = board[j][moves[i] - 1];

					if (fri != 0) {
						board[j][moves[i] - 1] = 0;
						break;
					}
				}

				if (stack.empty() == true) {
					stack.push(fri);
				} else {
					if (fri != 0) {
						if (stack.peek() == fri) {
							stack.pop();
							answer += 2;
						} else {
							stack.push(fri);
						}
					}
				}
			}

			return answer;
		}
	}
}
