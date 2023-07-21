package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _06_DNA {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        // 
        String[] words = bf.readLine().split("");

        // A C G T
        String[] temp = bf.readLine().split(" ");
        int[] counts = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            counts[i] = Integer.parseInt(temp[i]);
        }
        
        int start_idx = 0, end_idx = M - 1, cnt = 0;
        int[] answer = new int[4];
        for (int i = start_idx; i <= end_idx; i++) {
            switch (words[i]){
                case "A":
                    answer[0]++;
                    break;
                case "C":
                    answer[1]++;
                    break;
                case "G":
                    answer[2]++;
                    break;
                case "T":
                    answer[3]++;
                    break;
            }
        }
        while(end_idx < N){
            boolean flag = true;
            for (int i = 0; i < answer.length; i++) {
                if(answer[i] < counts[i]){
                    flag = false;
                    break;
                }
            }
            if(flag) cnt++;

            switch (words[start_idx]){
                case "A":
                    answer[0]--;
                    break;
                case "C":
                    answer[1]--;
                    break;
                case "G":
                    answer[2]--;
                    break;
                case "T":
                    answer[3]--;
                    break;
            }
            if(end_idx+1 >= N) break;
            switch (words[end_idx+1]){
                case "A":
                    answer[0]++;
                    break;
                case "C":
                    answer[1]++;
                    break;
                case "G":
                    answer[2]++;
                    break;
                case "T":
                    answer[3]++;
                    break;
            }
            start_idx++;
            end_idx++;
        }
        System.out.println(cnt);
    }
}
