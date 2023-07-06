package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(2 / 4);
        System.out.println(4 % 3);

        // 증강 연산
        int v = 10;
        System.out.println(v);
        System.out.println(++v); // 더한 다음에 출력
        System.out.println(v++); // 출력한다음에 더하기
        System.out.println(v);
    }
}
