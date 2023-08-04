package Test08.t0804;

import java.util.Arrays;
import java.util.HashSet;

public class Jinhyuk {

    public static void main(String[] args) {

        Jinhyuk jinhyuk = new Jinhyuk();

        String s1 = "banana";
        String s2 = "foobar";

        System.out.println(Arrays.toString(jinhyuk.solution(s1)));
        System.out.println(Arrays.toString(jinhyuk.solution(s2)));
    }

    public int[] solution(String s) {

        int answer[] = new int[s.length()]; //정답 배열의 길이는 s의 길이과 같다.
        String splitS[] = s.split(""); //한글자씩 분리

        for (int i = 0; i < splitS.length; i++) { // 이중 포문을 사용

            boolean overlap = false; // 중복 여부를 확인하는 overlap 설정

            for (int j = i; j >= 0; j--) { // i부터 0까지
                if ((i != j) && (splitS[i].equals(splitS[j]))) { //같은 글자가 아닌데 같을 경우
                    answer[i] = i - j; // 중복된 경우 두 글자 사이의 거리를 저장
                    overlap = true; // 중복될시 true로 바꾸고
                    break; // 더 먼거 비교하기 전에 나가준다.
                }
            }
            if (!overlap) { // 중복이 아닌 경우
                answer[i] = -1; // -1을 저장한다.
            }
        }
        return answer; //결과 반환
    }
}