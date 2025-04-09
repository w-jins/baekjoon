import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(fac(a,b) + "\n");
        bw.flush();
        bw.close();
    }
    static int fac (int a, int b) {
        if (a == b || b == 0) return 1;

        return fac(a - 1, b) + fac(a - 1, b - 1);
    }

}
