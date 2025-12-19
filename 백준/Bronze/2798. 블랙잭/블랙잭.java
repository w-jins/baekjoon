import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int max = 0;

        LinkedList<Integer> list = new LinkedList<>();
        String[] num = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(num[i]));
        }

        for (int i = 0; i < n - 2; i++) {
            if (max == m) {
                break;
            }
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = list.get(i) + list.get(j) + list.get(k);
                    if ((sum <= m) && (sum > max)) {
                        max = sum;
                    }
                }
            }
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}