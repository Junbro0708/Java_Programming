package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Javascript.";

        // 문자열 변환
        System.out.println(s.replace(" and", ","));
        // 문자열 쪼개기
        System.out.println(s.substring(7));
        System.out.println(s.substring(7, s.length()-1));
        System.out.println(s.substring(s.indexOf("Java")));

        // 공백 제거
        s = "    I like Java and Python.      ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞 뒤 공백 제거

        // 문자열 결합
        String s1 = "Java", s2 = "Python";
        System.out.println(s1 + " " + s2);
        System.out.println(s1.concat(" ").concat(s2));
    }
}
