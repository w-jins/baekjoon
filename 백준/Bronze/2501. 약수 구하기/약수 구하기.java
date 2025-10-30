import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        if (list.size() < k) {
            bw.write(0 + "");
        } else {
            bw.write(list.get(k - 1) + "");
        }

        bw.flush();
        bw.close();
    }
}