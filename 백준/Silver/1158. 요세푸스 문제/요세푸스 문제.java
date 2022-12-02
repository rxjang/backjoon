import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int num = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= num; i++) {
            que.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!que.isEmpty()) {
            for (int i = 0; i < n - 1; i++) {
                que.offer(que.poll());
            }
            sb.append(que.poll());
            if (!que.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}

