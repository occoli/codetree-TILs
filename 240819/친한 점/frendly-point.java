import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        TreeSet<Node> set = new TreeSet<>(
            (a, b) -> {
                if(a.x != b.x){
                    return Integer.compare(a.x, b.x);
                } else {
                    return Integer.compare(a.y, b.y);
                }
            });
        
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            set.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            Node node2 = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            if(set.ceiling(node2) == null){
                sb.append("-1 -1").append("\n");
            } else{
                sb.append(set.ceiling(node2).x).append(" ").append(set.ceiling(node2).y).append("\n");
            }
        }

        System.out.println(sb);

    }
}

class Node{
    int x, y;

    Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}