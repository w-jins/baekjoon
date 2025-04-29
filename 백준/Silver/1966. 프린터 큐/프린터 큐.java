import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            LinkedList<Integer> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int result = 0;
            int tem = M;


            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                q.offer(Integer.parseInt(st.nextToken()));
            }
            if (N == 1) {
                bw.write(1 + "\n");
                continue;
            }
            int max = Collections.max(q);
            int a = q.get(M);
            while (true) {
                int x = q.pop();
                if (x < max) {
                    q.offer(x);
                } else {
                    result++;
                    if (x == a) {
                        if (tem == 0) {
                            break;
                        }
                    }
                    max = Collections.max(q);
                }
                tem--;
                if (tem < 0) {
                    tem = q.size() - 1;
                }
            }
            bw.write(result + "\n");

        }

        bw.flush();
        bw.close();
    }
}