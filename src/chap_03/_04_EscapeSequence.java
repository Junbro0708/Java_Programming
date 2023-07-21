package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수 문자
        // \n \t \\ \" \'

        System.out.println("I\nlike\nJava"); // 줄바꿈

        System.out.println("해물파전\t9000원");
        System.out.println("떡볶이\t2000원");
        System.out.println("감자전\t1000원"); // 탭

        System.out.println("C:\\Program_File\\Java"); // 하나의 역슬래시 문자

        System.out.println("He said like \"meow\"");
        System.out.println("He said like \'meow\'");
    }
}
