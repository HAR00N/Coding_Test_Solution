import java.util.HashMap;

public class Non_completion {
	class Solution {
		public String solution(String[] participant, String[] completion) {
			String answer = "";

			HashMap<String, Integer> hm = new HashMap<String, Integer>();

			String name;
			int count;

			for (int i = 0; i < participant.length; i++) {
				name = participant[i];

				if (hm.containsKey(name) == false) {
					hm.put(name, 1);
				} else {
					count = hm.get(name);
					hm.replace(name, count + 1);
				}
			}

			for (int i = 0; i < completion.length; i++) {
				name = completion[i];

				if (hm.get(name) == 1) {
					hm.remove(name);
				} else {
					count = hm.get(name);
					hm.replace(name, count - 1);
				}
			}

			String temp = hm.keySet().toString();
			answer = temp.substring(1, temp.length() - 1);

			return answer;
		}
	}
}
