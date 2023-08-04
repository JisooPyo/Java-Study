package Test08.t0804;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        System.out.println(Arrays.toString(donghwan.solution("banana")));
        System.out.println(Arrays.toString(donghwan.solution("foobar")));
    }

    public int[] solution(String s) {
        int[] arr = new int[s.length()];

        for (int i=0; i<s.length(); i++) {
            if (s.indexOf(s.charAt(i))== i) {
                arr[i] = -1;
                System.out.println(arr[i]);
            }else {
                arr[i] = i - s.indexOf(s.charAt(i));
            }
        }
        return arr;
    }
}
