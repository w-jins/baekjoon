import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            if (n < 2 || n > 100000) throw new IOException("입력값이 범위에 맞지않습니다.");

            LinkedList<Integer> list = new LinkedList<>();
            int result = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    result += i;
                }
            }

            if (result == n) {
                bw.write(n + " = ");
                for (int i = 0; i < list.size(); i++) {
                    if (i == list.size() - 1) {
                        bw.write(list.get(i) + "");
                    } else {
                        bw.write(list.get(i) + " + ");
                    }
                }
                bw.write("\n");
            } else {
                bw.write(n + " is NOT perfect." + "\n");
            }

        }

        bw.flush();
        bw.close();
    }
}