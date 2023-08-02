package Test08.t0804;

import java.util.Arrays;

public class Jisoo2 {
	public static void main(String[] args) {
		Jisoo2 jisoo = new Jisoo2();
		System.out.println(Arrays.toString(jisoo.solution("bananab")));
		System.out.println(Arrays.toString(jisoo.solution("foobar")));

	}

	public int[] solution(String s) {
		char[] chars = s.toCharArray();
		int[] answer = new int[s.length()];

		// index를 기록할 int배열
		int[] indexRecord = new int[26];

		for (int i = 0; i < chars.length; i++) {
			if (indexRecord[chars[i] - 'a'] == 0) { // 이전에 index가 없었을 때
				answer[i] = -1;
			} else {
				// 이전에 index가 있었을 때. index를 저장할 때 하나 더해서 저장해줬기 때문에 뺄 때 하나 더해준다.
				// ex. 1번 index에 있는 거는 2으로 저장이 되어 있어서,
				// 내가 현재 5번이라면 5 - 2 + 1 을 해줘야 맞다!
				answer[i] = i - indexRecord[chars[i] - 'a'] + 1;
			}

			// index 업데이트 -> i로 해주면 "banana"의 "b"같은 경우 0번 index라 0이 저장 되는데,
			// 그럼 다음번에 b가 나왔을 때 위의 조건문으로 인해 "b"는 나오지 않았다로 처리되기 때문.
			// i+1로 해서 0, 1, 2, 3, ...이 아니라 1, 2, 3, 4 순서대로 들어가게 한다.
			indexRecord[chars[i] - 'a'] = i + 1;
		}
		return answer;
	}
}

/*
정확성  테스트(0.01ms ~ 0.97ms)

테스트 1 〉통과 (0.02ms, 74.5MB)
테스트 2 〉통과 (0.03ms, 64.2MB)
테스트 3 〉통과 (0.04ms, 77.6MB)
테스트 4 〉통과 (0.11ms, 80MB)
테스트 5 〉통과 (0.71ms, 82.4MB)
테스트 6 〉통과 (0.42ms, 91MB)
테스트 7 〉통과 (0.59ms, 81.7MB)
테스트 8 〉통과 (0.35ms, 78.6MB)
테스트 9 〉통과 (0.53ms, 78MB)
테스트 10 〉통과 (0.14ms, 76MB)
테스트 11 〉통과 (0.58ms, 75.8MB)
테스트 12 〉통과 (0.03ms, 74.4MB)
테스트 13 〉통과 (0.01ms, 74.4MB)
테스트 14 〉통과 (0.05ms, 72.1MB)
테스트 15 〉통과 (0.02ms, 75.1MB)
테스트 16 〉통과 (0.03ms, 73.9MB)
테스트 17 〉통과 (0.02ms, 70.4MB)
테스트 18 〉통과 (0.14ms, 78.1MB)
테스트 19 〉통과 (0.15ms, 65.7MB)
테스트 20 〉통과 (0.06ms, 78.1MB)
테스트 21 〉통과 (0.02ms, 76.1MB)
테스트 22 〉통과 (0.51ms, 71MB)
테스트 23 〉통과 (0.05ms, 76MB)
테스트 24 〉통과 (0.08ms, 83MB)
테스트 25 〉통과 (0.09ms, 74.1MB)
테스트 26 〉통과 (0.02ms, 75.2MB)
테스트 27 〉통과 (0.07ms, 75.1MB)
테스트 28 〉통과 (0.11ms, 74.3MB)
테스트 29 〉통과 (0.02ms, 71.2MB)
테스트 30 〉통과 (0.97ms, 81.9MB)
 */