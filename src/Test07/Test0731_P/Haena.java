// 두 개 뽑아서 더하기
package Test07.Test0731_P;

import java.util.*;

public class Haena {
	public int[] solution(int[] numbers) {
		Set<Integer> answerSet = new HashSet<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j) {
					answerSet.add(numbers[i] + numbers[j]);
				}
			}
		}
		int[] answer = Arrays.stream(answerSet.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		Haena sol = new Haena();
		System.out.println(Arrays.toString(sol.solution(new int[]{2, 1, 3, 4, 1})));
		System.out.println(Arrays.toString(sol.solution(new int[]{5, 0, 2, 7})));
	}
}

/*
테스트 1 〉	통과 (6.13ms, 72.8MB)
테스트 2 〉	통과 (7.86ms, 74.8MB)
테스트 3 〉	통과 (3.59ms, 74.9MB)
테스트 4 〉	통과 (3.51ms, 77.2MB)
테스트 5 〉	통과 (4.73ms, 72.1MB)
테스트 6 〉	통과 (2.92ms, 85.4MB)
테스트 7 〉	통과 (4.40ms, 65.6MB)
테스트 8 〉	통과 (5.36ms, 74.2MB)
테스트 9 〉	통과 (4.30ms, 80.4MB)
 */