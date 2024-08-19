import java.util.*;
import java.io.*;


public class Main {
    static int[] arr;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken()); // 사람 수
        M = Integer.parseInt(st.nextToken()); // 의자의 수
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = N;
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(check(mid)){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(left-1);
    }

    static boolean check(int m){
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 1; i <= M; i++){
            set.add(i);
        }

        for(int i = 0; i < m; i++){
            Integer num = set.floor(arr[i]);
            if(num == null){
                return false;
            } 
            set.remove(arr[i]);
        }
        return true;
    }
}