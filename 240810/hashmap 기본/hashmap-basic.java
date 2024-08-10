import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());
        HashMap<Integer, String> map = new HashMap<>();
        for(int i= 0; i < testCase; i++){
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if(order.equals("add")){
                map.put(Integer.parseInt(st.nextToken()), st.nextToken());
            } else if (order.equals("find")){
                sb.append(map.getOrDefault(Integer.parseInt(st.nextToken()), "None")).append("\n");
            } else if (order.equals("remove")){
                map.remove(Integer.parseInt(st.nextToken()));
            }
        }
        System.out.println(sb);
    }
}