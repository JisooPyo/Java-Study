package Test07.Test0726_P;

import java.util.*;

public class Haena {
	public int[] solution(String today, String[] terms, String[] privacies) {
		// 오늘 날짜 -> int 배열
		int[] todayIntArr = new int[3];
		todayIntArr[0] = Integer.parseInt(today.substring(0, 4));
		todayIntArr[1] = Integer.parseInt(today.substring(5, 7));
		todayIntArr[2] = Integer.parseInt(today.substring(8));

		// {Key 약관 종류, Value 유효기간} Map
		Map<Character, Integer> termsMap = new HashMap<Character, Integer>();
		for (int i = 0; i < terms.length; i++) {
			termsMap.put(terms[i].charAt(0), Integer.parseInt(terms[i].substring(2)));
		}

		// 개인정보 수집일자 -> int 배열
		List<int[]> privaciesDates = new ArrayList<int[]>();
		for (int i = 0; i < privacies.length; i++) {
			int[] privaciesDate = new int[3];
			privaciesDate[0] = Integer.parseInt(privacies[i].substring(0, 4));
			privaciesDate[1] = Integer.parseInt(privacies[i].substring(5, 7));
			privaciesDate[2] = Integer.parseInt(privacies[i].substring(8, 10));
			privaciesDates.add(privaciesDate);
		}
		// 약관종류 -> char 배열
		char[] termsKey = new char[privacies.length];
		for (int i = 0; i < privacies.length; i++) {
			termsKey[i] = privacies[i].charAt(11);
		}

		// 개인정보 수집일자 -> 개인정보 유효 기간 바꾸기
		for (int i = 0; i < privaciesDates.size(); i++) {
			// 유효 기간
			int term = termsMap.get(termsKey[i]);
			privaciesDates.get(i)[1] += term;
			while (privaciesDates.get(i)[1] > 12) {
				privaciesDates.get(i)[0]++;
				privaciesDates.get(i)[1] -= 12;
			}
			if (privaciesDates.get(i)[2] == 1) {
				privaciesDates.get(i)[1]--;
				privaciesDates.get(i)[2] = 28;
			} else {
				privaciesDates.get(i)[2]--;
			}
		}

		// 오늘 날짜보다 개인정보 유효 기간이 지난 개인정보 번호 리스트 -> int 배열 만들기
		List<Integer> answerList = new ArrayList<>();
		for (int i = 0; i < privaciesDates.size(); i++) {
			if (todayIntArr[0] > privaciesDates.get(i)[0]) {
				answerList.add(i+1);
			} else if (todayIntArr[0] == privaciesDates.get(i)[0]) {
				if (todayIntArr[1] > privaciesDates.get(i)[1]) {
					answerList.add(i+1);
				} else if (todayIntArr[1] == privaciesDates.get(i)[1]) {
					if (todayIntArr[2] > privaciesDates.get(i)[2]) {
						answerList.add(i+1);
					}
				}
			}
		}
		int[] answer = new int[answerList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		Haena sol = new Haena();
		System.out.println(Arrays.toString(sol.solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})));
		System.out.println(Arrays.toString(sol.solution("2020.01.01", new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"})));
		System.out.println(Arrays.toString(sol.solution("2016.02.15", new String[]{"A 100"}, new String[]{"2000.06.16 A", "2008.02.15 A"})));
	}
}

/*
테스트 1 〉	통과 (0.18ms, 74.3MB)
테스트 2 〉	통과 (0.24ms, 75.7MB)
테스트 3 〉	통과 (0.25ms, 78.3MB)
테스트 4 〉	통과 (0.22ms, 86.7MB)
테스트 5 〉	통과 (0.17ms, 76.2MB)
테스트 6 〉	통과 (0.26ms, 73.5MB)
테스트 7 〉	통과 (0.21ms, 72.3MB)
테스트 8 〉	통과 (0.22ms, 76.7MB)
테스트 9 〉	통과 (0.53ms, 78.8MB)
테스트 10 〉	통과 (0.50ms, 76.2MB)
테스트 11 〉	통과 (0.34ms, 66.9MB)
테스트 12 〉	통과 (0.73ms, 77.7MB)
테스트 13 〉	통과 (0.85ms, 79.2MB)
테스트 14 〉	통과 (0.65ms, 69.4MB)
테스트 15 〉	통과 (0.55ms, 76.1MB)
테스트 16 〉	통과 (0.70ms, 79MB)
테스트 17 〉	통과 (0.65ms, 69.8MB)
테스트 18 〉	통과 (0.69ms, 75.9MB)
테스트 19 〉	통과 (0.67ms, 76.3MB)
테스트 20 〉	통과 (0.81ms, 71.4MB)
 */