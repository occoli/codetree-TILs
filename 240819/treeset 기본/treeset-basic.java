import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < testCase; i++){
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            int num = 0;
            int ans = 0;

            switch (order) {
                case "add":
                    num = Integer.parseInt(st.nextToken());
                    set.add(num);
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    set.remove(num);
                    break;
                case "find":
                    num = Integer.parseInt(st.nextToken());
                    boolean check = set.contains(num);
                    sb.append(check).append("\n");
                    break;
                case "lower_bound":
                    num = Integer.parseInt(st.nextToken());
                    if(set.ceiling(num) == null){
                        sb.append("None").append("\n");
                    } else {
                        sb.append(set.ceiling(num)).append("\n");
                    }                    
                    break;
                case "upper_bound":
                    num = Integer.parseInt(st.nextToken());
                    if(set.higher(num) == null){
                        sb.append("None").append("\n");
                    } else{
                        sb.append(set.higher(num)).append("\n");
                    }
                    break;
                case "largest":
                    if(set.isEmpty()){
                        sb.append("None").append("\n");
                    } else{
                        sb.append(set.last()).append("\n");
                    }
                    break;
                case "smallest":
                    if(set.isEmpty()){
                        sb.append("None").append("\n");
                    } else{
                        sb.append(set.first()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}