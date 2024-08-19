import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0; i < testCase; i++){
            int N = Integer.parseInt(br.readLine());
            TreeSet<Integer> set = new TreeSet<>();

            for(int j = 0; j < N; j++){
                st = new StringTokenizer(br.readLine());
                String order = st.nextToken();
                if(order.equals("I")){
                    set.add(Integer.parseInt(st.nextToken()));
                } else if (order.equals("D")){
                    if(set.isEmpty()) continue;
                    int num = Integer.parseInt(st.nextToken());
                    if(num == 1){
                        set.remove(set.last());
                    } else{
                        set.remove(set.first());
                    }
                }
            }
            if(set.isEmpty()){
                sb.append("EMPTY").append("\n");
            } else {
                sb.append(set.last()).append(" ").append(set.first()).append("\n");
            }
        }
        
        System.out.println(sb);
    }
}