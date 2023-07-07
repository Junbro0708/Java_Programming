package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Javascript.";

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("Java")); // 문자열 체크
        System.out.println(s.indexOf('d')); // 문자열 및 문자의 위치 정보
        System.out.println(s.lastIndexOf('a')); // 마지막 위치 정보
        System.out.println(s.startsWith("I like")); // 시작 정보 체크
    }
}
