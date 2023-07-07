package algorithm;

import java.util.Scanner;

public class _01_SumOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String list = sc.next();

        String[] numbers = list.split("");

        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += Integer.valueOf(numbers[i]);
        }
        System.out.println(answer);
    }
}
