package chap_02;

import java.util.Scanner;

public class _Quiz_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 120) System.out.println("키가 " + num + "cm 이므로 탑승이 불가합니다.");
        else System.out.println("키가 " + num + "cm 이므로 탑승이 가능합니다.");
    }
}
