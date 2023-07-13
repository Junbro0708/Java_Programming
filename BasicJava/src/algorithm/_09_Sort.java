package algorithm;

import java.util.Scanner;

public class _09_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(nums[i]);        }
    }
}
