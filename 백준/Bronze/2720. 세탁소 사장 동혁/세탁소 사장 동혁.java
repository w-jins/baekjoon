import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            int input = Integer.parseInt(br.readLine());
            int num = input;
            if (num / 25 != 0) {
                num = input % 25;
                bw.write(input / 25 + " ");
            } else {
                bw.write(0 + " ");
            }
            if (num / 10 != 0) {
                bw.write(num / 10 + " ");
                num = num % 10;
            } else {
                bw.write(0 + " ");
            }
            if (num / 5 != 0) {
                bw.write(num / 5 + " ");
                num = num % 5;
            } else {
                bw.write(0 + " ");
            }
            bw.write(num + "\n");
        }


        bw.flush();
        bw.close();
    }
}