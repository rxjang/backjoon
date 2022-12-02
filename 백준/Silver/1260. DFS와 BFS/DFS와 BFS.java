import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    private static int num;
    private static boolean[] visits;
    private static int[][] table;
    private static Queue<Integer> que;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        num = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        
        visits = new boolean[1001];
        table = new int[1001][1001];
        
        int a, b;
        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            table[a][b] = table[b][a] = 1;
        }
        dfs(start);
        System.out.println();
        Arrays.fill(visits, false);
        bfs(start);        
    }
    
    public static void dfs(int start) {
        visits[start] = true;
        System.out.print(start + " ");
        for (int i = 1; i <= num; i++) {
            if (table[start][i] == 1 && visits[i] == false) {
                dfs(i);
            }
        }
    }
    
    public static void bfs(int start) {
        que = new LinkedList<>();
        que.add(start);
        visits[start] = true;
        System.out.print(start + " ");
        
        while (!que.isEmpty()) {
            int temp = que.poll();
            for (int i = 1; i < table.length; i++) {
                if (table[temp][i] == 1 && visits[i] == false) {
                    que.add(i);
                    visits[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}