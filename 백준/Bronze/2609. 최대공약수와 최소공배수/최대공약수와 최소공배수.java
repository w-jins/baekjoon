import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int GCD = 0;
        int LCM;

        for(int i = 1; i <= Math.max(a,b) ; i++) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
            }
        }

        LCM = (a * b) / GCD;
        bw.write(GCD + "\n");
        bw.write(LCM+ "");

        bw.flush();
        bw.close();
    }
}
