import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int num = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        
        for (int i = 1; i <= num ; i++) {
            
            if (num % i == 0) {
                target--;
            }
            
            if (target == 0) {
                System.out.println(i);
                break;
            }
        }
        if (target != 0) {
            System.out.println(0);
        }
    }
}