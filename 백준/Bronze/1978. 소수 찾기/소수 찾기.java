import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int repeat = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        LinkedList<Integer> list = new LinkedList<>();
        int result = 0;

        for (int i = 0; i < repeat; i++) {
            list.add(Integer.parseInt(input[i]));
        }
        for (Integer integer : list) {
            int sosu = 0;
            for (int j = 1; j <= integer; j++) {
                if (integer % j == 0) sosu++;
                if (sosu > 2) break;
            }
            if (sosu == 2) result++;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}