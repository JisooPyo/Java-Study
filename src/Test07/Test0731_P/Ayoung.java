// 두 개 뽑아서 더하기
package Test07.Test0731_P;
import java.util.ArrayList;
import java.util.Collections;
public class Ayoung {
    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        int[] input1 = {2, 1, 3, 4, 1};
        int[] input2 = {5, 0, 2, 7};

        System.out.println(Arrays.toString(ay.solution(input1)));
        // [2, 3, 4, 5, 6, 7]
        System.out.println(Arrays.toString(ay.solution(input2)));
        // [2, 5, 7, 9, 12]
    }

    public int[] solution(int[] numbers) {
        // 두 수의 합을 담을 가변 크기의 콜렉션 생성
        ArrayList<Integer> sums = new ArrayList<>();

        // i번째 인덱스 하나 당 i+1번째 ~ 마지막 인덱스 비교
        for(int i = 0 ; i< numbers.length-1 ; i++){
            for(int j = i+1 ; j < numbers.length; j++){
                // 두 수의 합이 이미 List에 있는 값이 아니라면 List에 추가
                if(!sums.contains(numbers[i]+numbers[j])){
                    sums.add(numbers[i]+numbers[j]);
                }
            }
        }

        // List 내의 값 오름차순 정렬
        Collections.sort(sums);

        // ArrayList > 배열 변환
        int[] answer = new int[sums.size()];
        for (int i = 0 ; i < sums.size() ; i++)
            answer[i] = sums.get(i).intValue();

        return answer;
    }
}
