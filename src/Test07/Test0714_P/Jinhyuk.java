package Test07.Test0714_P;

public class Jinhyuk {
    public static void main(String[] args) {

        Jinhyuk jinhyuk = new Jinhyuk();

        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        System.out.println(jinhyuk.solution(sizes));
    }

    public int solution(int[][] sizes) {
        int answer = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) { // 만약에 첫번째 수보다 2번째 수가 클경우
                int big = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = big;

            }
        }

        int maxGa_ro = sizes[0][0]; // 가_로
        int maxSe_ro = sizes[0][1]; // 세_로

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > maxGa_ro) { // 첫 번째 수중에서 가장 큰수를 찾고
                maxGa_ro = sizes[i][0];
            }
        }

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][1] > maxSe_ro) { // 두 번째 수중에서 가장 큰수를 찾는다
                maxSe_ro = sizes[i][1];
            }
        }



        answer = maxGa_ro * maxSe_ro; // 가로 곱하기 세로

        return answer;
    }

}
