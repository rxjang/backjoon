import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int num = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        
        String[] s = new String[num];
        for (int i = 0; i < num; i++) {
            s[i] = br.readLine();
        }
        
        int answer = 0;
        
        for (int i = 0; i < total; i++) {
            String word = br.readLine();
            for (int j = 0; j < num; j++) {
                if (s[j].equals(word)) {
                    answer++;
                    continue;
                }
            }
        }
        
        System.out.println(answer);
    }
}