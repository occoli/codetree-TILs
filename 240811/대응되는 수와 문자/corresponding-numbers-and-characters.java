import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // 숫자의 개수
        int m = scanner.nextInt(); // 조사할 값의 개수
        scanner.nextLine(); // 줄바꿈 처리
        
        // 번호 -> 문자열 매핑을 저장할 배열
        String[] numToString = new String[n + 1];
        
        // 문자열 -> 번호 매핑을 저장할 HashMap
        HashMap<String, Integer> stringToNum = new HashMap<>();
        
        // 문자열 입력 받아서 매핑 저장
        for (int i = 1; i <= n; i++) {
            String str = scanner.nextLine();
            numToString[i] = str;
            stringToNum.put(str, i);
        }
        
        // 조사할 값에 대해 결과 출력
        for (int i = 0; i < m; i++) {
            String query = scanner.nextLine();
            if (isNumeric(query)) {
                // 숫자인 경우
                int num = Integer.parseInt(query);
                System.out.println(numToString[num]);
            } else {
                // 문자열인 경우
                System.out.println(stringToNum.get(query));
            }
        }
    }
    
    // 문자열이 숫자인지 판단하는 메소드
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}