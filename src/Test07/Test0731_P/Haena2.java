// 두 개 뽑아서 더하기
package Test07.Test0731_P;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Haena2 {
	public int[] solution(int[] numbers) {
		Set<Integer> answerSet = new HashSet<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j) {
					answerSet.add(numbers[i] + numbers[j]);
				}
			}
		}
		Integer[] answerInteger = answerSet.toArray(new Integer[0]);
		int[] answer = new int[answerInteger.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerInteger[i];
		}
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		Haena2 sol = new Haena2();
		System.out.println(Arrays.toString(sol.solution(new int[]{2, 1, 3, 4, 1})));
		System.out.println(Arrays.toString(sol.solution(new int[]{5, 0, 2, 7})));
	}
}

/*
테스트 1 〉	통과 (0.55ms, 82.1MB)
테스트 2 〉	통과 (0.64ms, 75.4MB)
테스트 3 〉	통과 (0.41ms, 74.4MB)
테스트 4 〉	통과 (0.48ms, 75.1MB)
테스트 5 〉	통과 (0.71ms, 80.5MB)
테스트 6 〉	통과 (0.73ms, 79.9MB)
테스트 7 〉	통과 (4.57ms, 78.8MB)
테스트 8 〉	통과 (2.09ms, 73.5MB)
테스트 9 〉	통과 (2.37ms, 71.8MB)
 */