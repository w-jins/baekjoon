import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");

            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            xMap.put(x, xMap.getOrDefault(x, 0) + 1);
            yMap.put(y, yMap.getOrDefault(y, 0) + 1);
        }
        int x = Collections.max(xMap.keySet()) - Collections.min(xMap.keySet());
        int y = Collections.max(yMap.keySet()) - Collections.min(yMap.keySet());

        if (n == 1) {
            bw.write(0 + "");
        } else {
            bw.write(x * y + "");
        }
        bw.flush();
        bw.close();
    }
}