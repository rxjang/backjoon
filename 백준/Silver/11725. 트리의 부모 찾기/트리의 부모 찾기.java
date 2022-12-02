import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Queue;

public class Main {
    
    private static int num;
    private static int[] parents;
    private static List<List<Integer>> list = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        
        parents = new int[num + 1];
        
        for (int i = 0; i <= num + 1; i++) {
            list.add(new ArrayList<Integer>());
        }
        
        int a, b;
        StringTokenizer st;        

        for (int i = 1; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }
        int start = 1;
        bfs(1);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < parents.length; i++) {
           sb.append(parents[i]).append('\n'); 
        }
        System.out.println(sb);
    }
    
    public static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(start);
        parents[start] = 1;
        
        while (!que.isEmpty()) {
            int parent = que.poll();
            for (int i : list.get(parent)) {
                if (parents[i] == 0) {
                    parents[i] = parent;
                    que.offer(i);
                }
            }
        }
    }
}