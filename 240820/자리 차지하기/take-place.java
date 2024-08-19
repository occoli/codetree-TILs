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
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 1; i <= M; i++){
            set.add(i);
        }

        for(int i = 0; i < N; i++){
            Integer num = set.floor(arr[i]);
            if(num != null){
                set.remove(num);
                cnt++;
            } else {
                break;
            }
        }

        System.out.println(cnt);
    }
}