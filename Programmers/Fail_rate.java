
public class Fail_rate {
	class Solution {
		public int[] solution(int N, int[] stages) {
			int[] answer = new int[N];
			for (int i = 0; i < N; i++) {
				answer[i] = i + 1;
			}

			int stages_leng = stages.length;
			double[] count_stg = new double[N + 1];
			for (int i = 0; i < stages_leng; i++) {
				count_stg[stages[i] - 1]++;
			}

			double[] rate = new double[N];
			double per;

			for (int i = 0; i < N; i++) {
				per = 0;
				for (int j = i; j < N + 1; j++) {
					per += count_stg[j];
				}
				rate[i] = count_stg[i] / per;
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N - i - 1; j++) {
					if (rate[j] < rate[j + 1]) {
						double temp_1 = rate[j + 1];
						rate[j + 1] = rate[j];
						rate[j] = temp_1;
						int temp_2 = answer[j + 1];
						answer[j + 1] = answer[j];
						answer[j] = temp_2;
					}
				}
			}

			return answer;
		}
	}
}
