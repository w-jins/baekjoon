import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (true) {
                if (n % i == 0) {
                    list.add(i);
                    n /= i;
                } else {
                    break;
                }
            }
        }
        if (n == 1) bw.write("");
        else list.add(n);
        Collections.sort(list);
        for (Integer a : list) {
            bw.write(a + "\n");
        }
        bw.flush();
        bw.close();
    }
}