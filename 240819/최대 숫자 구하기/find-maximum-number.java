import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 1; i <= M; i++){
            set.add(i);
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            set.remove(Integer.parseInt(st.nextToken()));
            sb.append(set.last()).append("\n");
        }

        System.out.println(sb);
    }
}