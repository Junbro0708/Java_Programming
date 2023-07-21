package algorithm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class _07_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        Stack<Integer> list = new Stack<>();
        ArrayList<Character> answer = new ArrayList<>();

        int idx = 1;
        boolean flag = true;
        for (int i = 0; i < N; i++) {
            while(idx <= nums[i]){
                list.add(idx);
                idx++;
                answer.add('+');
            }
            if(list.peek() == nums[i]){
                list.pop();
                answer.add('-');
            }else if(list.peek() > nums[i]){
                flag = false;
                break;
            }
        }
        if(flag){
            for (char item: answer)  {
                System.out.println(item);
            }
        }else{
            System.out.println("NO");
        }
    }
}
