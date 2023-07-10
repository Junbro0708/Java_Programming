package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _05_Zumong {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        int start_idx = 0, end_idx = N - 1, cnt = 0;
        while(start_idx < end_idx){
            if(nums[start_idx] + nums[end_idx] < M){
                start_idx++;
            }else if(nums[start_idx] + nums[end_idx] > M){
                end_idx--;
            }else{
                cnt++;
                start_idx++;
            }
        }
        System.out.println(cnt);
    }
}
