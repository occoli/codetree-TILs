import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int min_value = Integer.MAX_VALUE;
        int N = Integer.parseInt(br.readLine());
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            set.add(num);

            Integer left = set.lower(num);
            Integer right = set.higher(num);
            if(left != null){
                min_value = Math.min(min_value, num - left);
            }

            if(right != null){
                min_value = Math.min(min_value, right - num);
            }

            sb.append(min_value).append("\n");
        }

        System.out.println(sb);


    }
}