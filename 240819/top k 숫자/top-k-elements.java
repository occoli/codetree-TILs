import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        TreeSet<Integer> set = new TreeSet<>((a, b) -> Integer.compare(b, a));

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 0; i < k; i++){
            sb.append(set.first()).append(" ");
            set.remove(set.first());
        }

        System.out.println(sb);

    }
}