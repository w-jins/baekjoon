import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int min = n;

        for (int i = m; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i < 2) break;
                if (i % j == 0) count++;
                if (count > 1) break;
            }
            if (count == 1) {
                result += i;
                if (min > i) min = i;
            }
        }
        if (result == 0) bw.write("-1");
        else {
            bw.write(result + "\n");
            bw.write(min + "");
        }
        bw.flush();
        bw.close();
    }
}