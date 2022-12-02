import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value == 0) {
                sb.append(heap.isEmpty() ? "0" : heap.poll())
                    .append('\n');
            } else {
                heap.add(value);
            }
        }
        
        System.out.println(sb);
    }
}