package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _03_SumOfPart {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] sums = new long[N + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i < sums.length; ++i){
            sums[i] = sums[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; ++i){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(sums[b] - sums[a-1]);
        }
    }
}