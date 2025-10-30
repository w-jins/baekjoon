import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        while (true) {
            String[] input = br.readLine().split(" ");

            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);
            if (num1 == 0 && num2 == 0) break;

            if (num1 % num2 == 0) bw.write("multiple" + "\n");
            else if (num2 % num1 == 0) bw.write("factor" + "\n");
            else bw.write("neither" + "\n");
        }
        bw.flush();
        bw.close();
    }
}