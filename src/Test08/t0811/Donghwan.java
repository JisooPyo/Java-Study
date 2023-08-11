package Test08.t0811;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        String[] name1 = {"may", "kein", "kain", "radi"};
        int[] yearning1 = {5, 10, 1, 3};
        String[][] photo1 = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        String[] name2 = {"kali", "mari", "don"};
        int[] yearning2 = {11, 1, 55};
        String[][] photo2 = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};

        String[] name3 = {"may", "kein", "kain", "radi"};
        int[] yearning3 = {5, 10, 1, 3};
        String[][] photo3 = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};

        System.out.println(Arrays.toString(donghwan.solution(name1, yearning1, photo1)));
        System.out.println(Arrays.toString(donghwan.solution(name2, yearning2, photo2)));
        System.out.println(Arrays.toString(donghwan.solution(name3, yearning3, photo3)));
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> human = new HashMap<>(); //해당하는 인물의 대한 점수를 Map으로 저장
        for (int i = 0; i < name.length; i++) {
            human.put(name[i], yearning[i]);
        }
        for (int i = 0; i < photo.length; i++) { //이중반복문을 사용해서 이중배열에 접근
            String[] person = photo[i];
            int total = 0; // 총 점수를 받기 위해 변수 선언 및 초기화.
            for (int j=0; j<person.length; j++){ //이중 배열에 접근
                String personName = person[j]; //인물이름을 반복문으로 받기
                if(human.containsKey(personName)){ // 인물이 해당하면 점수추가
                    total += human.get(personName); //토탈변수에 점수를 쌓아주기
                }
            }
            answer[i] = total; // 토탈점수를 answer에 반환.
        }
        return answer;
    }
}
