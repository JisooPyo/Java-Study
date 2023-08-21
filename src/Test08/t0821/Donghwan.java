package Test08.t0821;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        System.out.println(donghwan.solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(donghwan.solution("z-+.^."));
        System.out.println(donghwan.solution("=.="));
        System.out.println(donghwan.solution("123_.def"));
        System.out.println(donghwan.solution("abcdefghijklmn.p"));
    }

    public String solution(String new_id) {
        new_id = first(new_id);
        new_id = second(new_id);
        new_id = third(new_id);
        new_id = fourth(new_id);
        new_id = fifth(new_id);
        new_id = sixth(new_id);
        new_id = seventh(new_id);

        return new_id;
    }

    public String first(String new_id) {
        return new_id.toLowerCase();
    }

    public String second(String new_id) {
        return new_id.replaceAll("[^a-z0-9\\-_.]", "");
    }

    public String third(String new_id) {
        return new_id.replaceAll("\\.+", ".");
    }

    public String fourth(String new_id) {
        new_id = new_id.replaceAll("^\\.", "");  // 시작 부분의 마침표 제거
        new_id = new_id.replaceAll("\\.$", "");  // 끝 부분의 마침표 제거
        return new_id;
    }

    public String fifth(String new_id) {
        if (new_id.length() == 0) {
            return "a";
        }
        return new_id;
    }

    public String sixth(String new_id) {
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            return new_id.replaceAll("\\.$", "");  // 끝 부분의 마침표 제거
        }
        return new_id;
    }

    public String seventh(String new_id) {
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }
        return new_id;
    }
}

//        테스트 1 〉	통과 (0.24ms, 70MB)
//        테스트 2 〉	통과 (15.69ms, 77.4MB)
//        테스트 3 〉	통과 (28.35ms, 79MB)
//        테스트 4 〉	통과 (0.34ms, 77.6MB)
//        테스트 5 〉	통과 (0.24ms, 70.4MB)
//        테스트 6 〉	통과 (0.23ms, 73.3MB)
//        테스트 7 〉	통과 (0.23ms, 71.6MB)
//        테스트 8 〉	통과 (0.35ms, 73.8MB)
//        테스트 9 〉	통과 (12.94ms, 74.4MB)
//        테스트 10 〉	통과 (0.17ms, 77.8MB)
//        테스트 11 〉	통과 (0.35ms, 72.6MB)
//        테스트 12 〉	통과 (0.34ms, 69.8MB)
//        테스트 13 〉	통과 (15.82ms, 76.2MB)
//        테스트 14 〉	통과 (0.41ms, 81.1MB)
//        테스트 15 〉	통과 (0.46ms, 65.4MB)
//        테스트 16 〉	통과 (0.51ms, 72.9MB)
//        테스트 17 〉	통과 (1.36ms, 74.5MB)
//        테스트 18 〉	통과 (1.83ms, 67.8MB)
//        테스트 19 〉	통과 (2.99ms, 75.2MB)
//        테스트 20 〉	통과 (2.78ms, 76.9MB)
//        테스트 21 〉	통과 (3.84ms, 69.3MB)
//        테스트 22 〉	통과 (15.13ms, 76.2MB)
//        테스트 23 〉	통과 (13.50ms, 76.5MB)
//        테스트 24 〉	통과 (2.07ms, 78.1MB)
//        테스트 25 〉	통과 (2.06ms, 76.9MB)
//        테스트 26 〉	통과 (2.13ms, 73.3MB)