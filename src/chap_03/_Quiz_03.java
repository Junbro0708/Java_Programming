package chap_03;

import java.util.Scanner;

public class _Quiz_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.substring(0, s.indexOf("-")+2));
    }
}
