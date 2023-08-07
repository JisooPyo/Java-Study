package Test08.t0807;

import java.util.Arrays;

public class Haena {
	public int[] solution(int[] array, int[][] commands) {
		// 주어진 commands의 길이 만큼의 1차원 배열을 생성한다.(answer)
		int[] answer = new int[commands.length];

		// commands를 for문으로 돌면서 [start, end, k]를 확인한다.
		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0] - 1;
			int end = commands[i][1] - 1;
			int k = commands[i][2] - 1;

			// 주어진 array에 start번째부터 end번째까지 자른 배열을 만든다.
			int[] cutArr = new int[end - start + 1];
			for (int j = start, index = 0; j <= end; j++) {
				cutArr[index++] = array[j];
			}

			// 자른 배열을 정렬한다.
			Arrays.sort(cutArr);

			// 정렬된 배열에서 k번째 숫자를 찾아 answer에 차례대로 담는다.
			answer[i] = cutArr[k];
		}
		return answer;
	}

	public static void main(String[] args) {
		Haena sol = new Haena();
		System.out.println(Arrays.toString(sol.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
	}
}

/*
테스트 1 〉	통과 (0.54ms, 79.3MB)
테스트 2 〉	통과 (0.49ms, 75.1MB)
테스트 3 〉	통과 (0.43ms, 74.9MB)
테스트 4 〉	통과 (0.49ms, 74.9MB)
테스트 5 〉	통과 (0.33ms, 73.3MB)
테스트 6 〉	통과 (0.35ms, 74.8MB)
테스트 7 〉	통과 (0.43ms, 74.5MB)
 */