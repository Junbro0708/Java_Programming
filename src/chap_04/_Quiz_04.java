package chap_04;

import java.util.Scanner;

public class _Quiz_04 {
    public static void main(String[] args) {
        System.out.print("""
                차량 종류를 입력하세요.
                1. 일반 차량\t2. 경차\t3. 장애인 차량
                """);
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("주차 시간을 입력하세요. 최대 24시간 주차입니다.");
        int hours = sc.nextInt();

        int cost;
        switch (number){
            case 1:
                cost = hours * 4000;
                if(cost >= 30000) cost = 30000;
                System.out.println("일반 차량 " + hours + "시간 주차 시 " + cost + " 원");
                break;
            case 2:
                cost = hours * 4000;
                if(cost >= 30000) cost = 30000;
                cost /= 2;
                System.out.println("경차 " + hours + "시간 주차 시 " + cost + " 원");
                break;
            case 3:
                cost = hours * 4000;
                if(cost >= 30000) cost = 30000;
                cost /= 2;
                System.out.println("장애인 차량 " + hours + "시간 주차 시 " + cost + " 원");
                break;
        }
    }
}
