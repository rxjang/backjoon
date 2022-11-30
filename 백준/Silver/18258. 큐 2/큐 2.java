import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int last = 0;
         
        int num = Integer.parseInt(br.readLine());
        Deque<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
         
        for (int i = 0; i < num; i++) {
             String input = br.readLine();
             if (input.startsWith("push")) {
                 st = new StringTokenizer(input, " ");
                 st.nextToken();
                 last = Integer.parseInt(st.nextToken());
                 que.offer(last);
             } else if (input.startsWith("pop")) {
                 sb.append(que.isEmpty() ? -1 : que.poll())
                     .append('\n');
             } else if (input.startsWith("size")) {
                 sb.append(que.size())
                     .append('\n');
             } else if (input.startsWith("empty")) {
                 sb.append(que.isEmpty() ? 1 : 0)
                     .append('\n');
             } else if (input.startsWith("front")) {
                 sb.append(que.isEmpty() ? -1 : que.peek())
                     .append('\n');
             } else if (input.startsWith("back")) {
                 sb.append(que.isEmpty() ? -1 : que.peekLast())
                     .append('\n');
             } 
        }
        System.out.println(sb);
     }
}