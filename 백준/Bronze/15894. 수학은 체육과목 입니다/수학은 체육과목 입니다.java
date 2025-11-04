import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        long n = Integer.parseInt(br.readLine());
        if (n == 1) {
            bw.write(4 + "");
        } else {
            long a = (3 * (n - 1));
            long b = (5 + (n - 2));

            bw.write((a + b) + "");
        }

        bw.flush();
        bw.close();
    }
}