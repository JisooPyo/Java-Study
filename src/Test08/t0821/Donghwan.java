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
