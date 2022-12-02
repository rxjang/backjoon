import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int total = Integer.parseInt(st.nextToken());
        int questions = Integer.parseInt(st.nextToken());
        
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < total; i++) {
            String monster = br.readLine();
            list.add(monster);
            map.put(monster, i + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < questions; i++) {
            String question = br.readLine();
            try {
                int index = Integer.parseInt(question);
                sb.append(list.get(index - 1)).append('\n');
            } catch (NumberFormatException e) {
                sb.append(map.get(question)).append('\n');
            }
        }
        System.out.println(sb);
    }
}