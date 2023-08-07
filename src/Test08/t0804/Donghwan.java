package Test08.t0804;

import java.util.ArrayList;
import java.util.Arrays;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        System.out.println(Arrays.toString(donghwan.solution("banana")));
        System.out.println(Arrays.toString(donghwan.solution("foobar")));
    }

    public int[] solution(String s) {
        int[] arr = new int[s.length()]; // s의 길이만큼 int 배열 생성
        ArrayList<Character> arrayList= new ArrayList<>();

        for (int i=0; i<s.length(); i++) { // s의 길이만큼 반복
            if (s.indexOf(s.charAt(i))== i) { // indexOf로 s.charAt으로 찾은 알파벳의 위치가 i와 대조
                arr[i] = -1; // 처음 들어온 값이라면 arr[i]에 값 저장.
            }else {
                arr[i] = i - arrayList.lastIndexOf(s.charAt(i)); // 중복된 값이 아니라면 arr[i]에 i에 찾아온 인덱스 값을 빼기.
            }
            arrayList.add(s.charAt(i));
        }
        return arr; // 리턴
    }
}
