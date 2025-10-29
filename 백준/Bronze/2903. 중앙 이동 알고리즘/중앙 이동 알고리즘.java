import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int input = Integer.parseInt(br.readLine());
        if (input < 1 || input > 15) throw new IllegalArgumentException();

        int first = 4;
        if (input == 1) bw.write(9 + "");
        else {
            int square = (int) Math.pow(first, input);
            int count = (int) Math.sqrt(square) + 1;
            int result = (int) Math.pow(count, 2);

            bw.write(result + "");
        }

        bw.flush();
        bw.close();
    }
}