import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int maxNum = Integer.MIN_VALUE;
        int t = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < t; i++){
            String key = br.readLine();
            map.put(key, map.getOrDefault(key, 0) + 1);
            maxNum = Math.max(maxNum, map.get(key));
        }

        System.out.println(maxNum);
    }
}