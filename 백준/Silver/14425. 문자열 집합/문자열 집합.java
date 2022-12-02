import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int num = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            map.put(br.readLine(), 0);
        }
        
        int answer = 0;
        for (int i = 0; i < total; i++) {
            if(map.containsKey(br.readLine())) answer++;
        }
        
        System.out.println(answer);
    }
}