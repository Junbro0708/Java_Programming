package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _08_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        while(list.size() != 1){
            list.poll();
            int temp = list.poll();
            list.add(temp);
        }
        System.out.println(list.poll());
    }
}
