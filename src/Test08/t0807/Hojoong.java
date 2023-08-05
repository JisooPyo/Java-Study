package Test08.t0807;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Hojoong {

    public static void main(String[] args) {

        Hojoong hojoong = new Hojoong();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(hojoong.solution(array, commands)));
    }


    public int[] solution(int[] array, int[][] commands) {
        //answer.length == commands.length
        int[] answer = new int[commands.length];

        //주어진 int배열의 Array를 substring 하기 위해 arraylist로 변환
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int element : array) {
            arrayList.add(element);
        }

        //for문을 돌며 commands[i] 에 있는 배열의 i,j,k를 뽑아서 숫자를 구함
        for (int i = 0; i < commands.length; i++) {


            //commands[i]번째의 배열을 따로 뽑아서, arrayList와 같이 getNumber 메서드에 보내 로직 수행
            int[] command = commands[i];
            int number = getNumber(arrayList, command);
            answer[i] = number;
        }

        return answer;

    }

    public static Integer getNumber(ArrayList<Integer> arrayList, int[] command) {
        //편의상 command 의 i,j,k 변수 선언
        int startIndex = command[0] - 1;
        int lastIndex = command[1];
        int getIndex = command[2] - 1;

        //for문을 통해 원하는 index 만큼만 substring
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = startIndex; i < lastIndex; i++) {
            list.add(arrayList.get(i));
        }

        //정렬 후
        Collections.sort(list);

        //k번째 숫자 리턴
        return list.get(getIndex);
    }

//    테스트 1 〉	통과 (0.22ms, 70.6MB)
//    테스트 2 〉	통과 (0.33ms, 76.7MB)
//    테스트 3 〉	통과 (0.23ms, 76.2MB)
//    테스트 4 〉	통과 (0.29ms, 74.7MB)
//    테스트 5 〉	통과 (0.26ms, 72.4MB)
//    테스트 6 〉	통과 (0.22ms, 74.8MB)
//    테스트 7 〉	통과 (0.21ms, 74.5MB)

}
