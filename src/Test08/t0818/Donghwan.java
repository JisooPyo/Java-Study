package Test08.t0818;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        int[] test1 = {3, 1, 2, 3};
        int[] test2 = {3, 3, 3, 2, 2, 4};
        int[] test3 = {3, 3, 3, 2, 2, 2};

        System.out.println(donghwan.solution(test1));
        System.out.println(donghwan.solution(test2));
        System.out.println(donghwan.solution(test3));
    }

    public int solution(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!arr.contains(nums[i])) {
                if (arr.size() < nums.length / 2) {
                    arr.add(nums[i]);
                }
            }
        }
        return arr.size();
    }
}
