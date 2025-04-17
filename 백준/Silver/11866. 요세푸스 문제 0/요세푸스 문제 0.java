import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        sb.append("<");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            list.offer(i);
        }

        while (list.size() > 1) {
            for (int i = 0 ; i < K - 1; i++ ) {
                int a = list.poll();
                list.offer(a);
            }
            sb.append(list.poll()).append(", ");
        }
        sb.append(list.poll()).append(">");
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}