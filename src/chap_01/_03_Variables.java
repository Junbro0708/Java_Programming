package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "Jun";
        int hour = 15;
        System.out.println(name + "님 배송이 시작됩니다. " + hour + "시에 배송이 시작됩니다.");

        name = "준형";
        double score = 90.5;
        char grade = 'A';
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        double d = 3.14;
        float f = 3.14f; // float 변수에 넣은 때는 f나 F를 붙여줘야함. double이 조금 더 정밀한 소수점 표현 가능

        long i = 1_000_000_000_000l; // 정수형이 엄청 클 경우에는 +-21억까지의 int 타입에 넣을 수 없음. long타입에 l을 붙여줘야함

        // int - long
        // float - double
        // char - String
        // boolean
    }
}
