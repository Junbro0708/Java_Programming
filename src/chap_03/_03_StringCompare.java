package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java", s2 = "Python";

        System.out.println(s1.equals(s2));
        s2 = "Java"; // 1. 같은 문자열이 있다면 이미 메모리에 있는 값의 주소를 참조
        System.out.println(s1.equals(s2)); // 대소문자 구분 O
        System.out.println(s1.equalsIgnoreCase("java")); // 대소문자 구분 X
        System.out.println(s1 == s2);

        // 문자열 비교 심화
        s1 = new String("1234"); // 2. 이거는 값이 같아도 새로운 객체를 만들기 때문에 주소 참조 x
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true 3. 같은 내용인지 확인
        System.out.println(s1 == s2); // false 4. 같은 메모리 주소인지 확인
    }
}
