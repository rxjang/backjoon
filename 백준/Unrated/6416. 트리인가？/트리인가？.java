import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    
    private static boolean isTree = true;
    private static Set<Integer> setU = new HashSet<>();
    private static Set<Integer> setV = new HashSet<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = 1;
        
        loop: while (true) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
            
                if (u == 0) {
                    if(setV.size() != 0) {
                        int root = 0;
                        for (Integer integer : setU) {
                            if (!setV.contains(integer)) root++;
                        }
                        if(root != 1) isTree = false;
                    }             
                    sb.append(result(isTree, n++));
                    continue;
                }
                        
                if (u == -1) break loop;

                setU.add(u);
                if (!setV.add(v)) isTree = false;
            }
        }
        
        System.out.println(sb);
    }
    
    public static String result(boolean isTrue, int n) {
        String r = isTrue ? String.format("Case %d is a tree.\n", n)
            : String.format("Case %d is not a tree.\n", n);
        isTree = true;
        setU = new HashSet<>();
        setV = new HashSet<>();
        return r;
    }
}