import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        TreeSet<Integer> set = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(br.readLine());
            if(set.ceiling(num) == null){
                sb.append("-1").append("\n");
            } else{
                sb.append(set.ceiling(num)).append("\n");
            }
        }

        System.out.println(sb);
    }
}