package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _04_TwoPointer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        int cnt = 0;
//        for(int i = num; i > 0; --i){
//            int temp = i, sum = 0;
//            while(sum < num){
//                sum += temp;
//                temp--;
//            }
//            if(sum == num) cnt++;
//        }

        int start_idx = 1, end_idx = 1, sum = 1;
        while(start_idx < num + 1 || end_idx < num + 1){
            if(sum < num){
                end_idx++;
                sum += end_idx;
            }else if (sum == num) {
                cnt++;
                end_idx++;
                sum += end_idx;
            }else{
                sum -= start_idx;
                start_idx++;
            }
        }
        System.out.println(cnt);
    }
}
