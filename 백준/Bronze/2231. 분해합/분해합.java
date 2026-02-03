import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int input = Integer.parseInt(br.readLine());
        int result = 0;
        boolean flag = true;
        for (int i = 1; i < input; i++) {
            int cons = i + solution(i);

            if (cons == input) {
                result = i;
                flag = false;
                bw.write(result + "");
                break;
            }
        }
        if (flag) bw.write("0");
        bw.flush();
        bw.close();
    }

    public static int solution(int n) {
        int answer = 0;

        while (true) {
            answer += n % 10;
            if (n < 10) break;
            n /= 10;
        }
        return answer;
    }
}