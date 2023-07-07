package chap_06;

public class _04_Overloading {
    public static int Sum(int num1, int num2){
        return num1 + num2;
    }
    public static double Sum(double num1, double num2){
        return num1 + num2;
    }
    public static String Sum(String str1, String str2){
        return str1 + str2;
    }
    public static void main(String[] args) {
        System.out.println(Sum(1.4, 2.5));
        System.out.println(Sum(1, 2));
        System.out.println(Sum("Hi ", "Nice to meet you"));
    }
}
