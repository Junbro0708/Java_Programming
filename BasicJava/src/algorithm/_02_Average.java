package algorithm;

import java.util.Collections;
import java.util.Scanner;

// 백준 1546번
public class _02_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scores = new int[N];

        int max = -1;
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
            if(max < scores[i]) max = scores[i];
        }
        double answer = 0;
        for (int i = 0; i < N; i++) {
            answer += ((double)scores[i]/max*100);
        }
        System.out.println(answer / N);
    }
}
