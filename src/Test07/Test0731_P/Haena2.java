// 두 개 뽑아서 더하기
package Test07.Test0731_P;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Haena2 {
	public int[] solution(int[] numbers) {
		// 1. 중복이 허용되지 않는 Set을 만든다.
		Set<Integer> answerSet = new HashSet<>();

		// 2. 배열을 돌며 서로 다른 인덱스의 값를 더한 값을 set에 추가한다.
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				answerSet.add(numbers[i] + numbers[j]);
			}
		}

		// 3. 만들어진 Set을 int 배열로 반환한다.
		Integer[] answerInteger = answerSet.toArray(new Integer[0]);
		int[] answer = new int[answerInteger.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerInteger[i];
		}

		// 4. int 배열을 정렬한 후 반환한다.
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
테스트 1 〉	통과 (0.48ms, 71.3MB)
테스트 2 〉	통과 (1.09ms, 64.2MB)
테스트 3 〉	통과 (0.96ms, 73MB)
테스트 4 〉	통과 (0.96ms, 69.4MB)
테스트 5 〉	통과 (4.92ms, 94.9MB)
테스트 6 〉	통과 (1.58ms, 81MB)
테스트 7 〉	통과 (5.07ms, 78.5MB)
테스트 8 〉	통과 (1.24ms, 81MB)
테스트 9 〉	통과 (2.25ms, 78.1MB)
 */