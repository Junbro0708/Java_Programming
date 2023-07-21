package chap_01;

public class _06_TypeCasting {
    public static void main(String[] args){
        // 정수형 -> 실수형 이렇게 타입의 형태를 바꾸는 것
        int score = 91 + (int) 90.5;
        System.out.println(score);
        System.out.println((int)(double) score);

        float score_f = 25.3f;
        double score_d = 25.3;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        // int -> long -> float -> double (자동 형변환)

        String s1 = String.valueOf(93); // 숫자를 문자열로 바꿀 때는 클래스의 도움을 받아야함.
        s1 = Integer.toString(100); // 위와 같은 기능
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(10.3);
        System.out.println(s2);

        // 문자열을 숫자로
        int n1 = Integer.parseInt("92");
        double n2 = Double.parseDouble("94.2");
        System.out.println(n1 + " " + n2);

        int error = Integer.parseInt("준형"); // 오류 발생
    }
}
