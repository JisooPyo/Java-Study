package Test08.t0821;

// 신규 아이디 추천
public class Haena {
    public String solution(String new_id) {
        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        String lowerId = new_id.toLowerCase();

        //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        // 정규표현식에서 [] 사이에 '^' 추가하면 이하를 제외한 나머지 문자를 의미
        String removalRegexId = lowerId.replaceAll("[^a-z0-9\\-_.]", "");

        //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        // 정규표현식에서 '{2,}' 2번 이상의 반복을 나타냄
        String removalFullStopTwiceId = removalRegexId.replaceAll("\\.{2,}",".");

        //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        // 정규표현식에서 '^' 시작, '|' 또는, '$' 끝을 의미
        String removalFullStopBeinningAndEndId = removalFullStopTwiceId.replaceAll("^\\.+|\\.$", "");

        //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        String emptyCheckId = removalFullStopBeinningAndEndId.length() == 0 ? "a" : removalFullStopBeinningAndEndId;

        //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        String substringId = emptyCheckId.length() >= 16 ? emptyCheckId.substring(0, 15) : emptyCheckId;
        String removalFullStopEndId = substringId.replaceAll("\\.$","");

        //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        String answer = removalFullStopEndId;
        if (answer.length() <= 2) {
           StringBuilder sb = new StringBuilder(answer);
           while (sb.length() < 3) {
               sb.append(answer.charAt(answer.length() - 1));
           }
            answer = sb.toString();
        }

        return answer;
    }

    public static void main(String[] args) {
        Haena sol = new Haena();
        System.out.println(sol.solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(sol.solution("z-+.^."));
        System.out.println(sol.solution("=.="));
        System.out.println(sol.solution("123_.def"));
        System.out.println(sol.solution("abcdefghijklmn.p"));
    }
}

/*
테스트 1 〉	통과 (0.20ms, 80.5MB)
테스트 2 〉	통과 (0.29ms, 72.1MB)
테스트 3 〉	통과 (0.28ms, 77.3MB)
테스트 4 〉	통과 (0.25ms, 76.5MB)
테스트 5 〉	통과 (0.27ms, 73.8MB)
테스트 6 〉	통과 (0.26ms, 70.1MB)
테스트 7 〉	통과 (0.20ms, 71.8MB)
테스트 8 〉	통과 (0.43ms, 79.7MB)
테스트 9 〉	통과 (0.20ms, 74MB)
테스트 10 〉	통과 (0.25ms, 82.1MB)
테스트 11 〉	통과 (0.35ms, 81.2MB)
테스트 12 〉	통과 (0.35ms, 77.3MB)
테스트 13 〉	통과 (0.54ms, 71.7MB)
테스트 14 〉	통과 (0.41ms, 76.8MB)
테스트 15 〉	통과 (0.36ms, 74.2MB)
테스트 16 〉	통과 (0.64ms, 80.5MB)
테스트 17 〉	통과 (1.43ms, 74.7MB)
테스트 18 〉	통과 (2.42ms, 73.6MB)
테스트 19 〉	통과 (2.80ms, 77.9MB)
테스트 20 〉	통과 (3.11ms, 76.6MB)
테스트 21 〉	통과 (2.36ms, 77.5MB)
테스트 22 〉	통과 (3.24ms, 80.1MB)
테스트 23 〉	통과 (1.96ms, 74.3MB)
테스트 24 〉	통과 (1.94ms, 86.6MB)
테스트 25 〉	통과 (2.69ms, 73.9MB)
테스트 26 〉	통과 (1.61ms, 72.3MB)
 */