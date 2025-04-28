import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("");
            int result = 0;
            LinkedList<String> list = new LinkedList<>(Arrays.asList(input));

            for (int j = 0; j < list.size(); j++) {
                String s = list.get(j);
                if (s.equals("(")) {
                    result++;
                } else if (s.equals(")")) {
                    result--;
                    if (result <= -1) {
                        break;
                    }
                }
            }
            if (result == 0) {
                bw.write("YES" + "\n");
            } else {
                bw.write("NO" + "\n");
            }
        }


        bw.flush();
        bw.close();
    }
}