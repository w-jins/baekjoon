import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        LinkedList<Integer> list = new LinkedList<>();
        long result = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            list.offer(Integer.parseInt(br.readLine()));
        }
        long avg = Math.round(list.size() * 0.15);
        list.sort(Collections.reverseOrder());
        for (int i = 0 ; i < avg; i++) {
            list.pollFirst();
            list.pollLast();
        }
        for (int i : list) {
            result += i;
        }
        bw.write(Math.round((double)result / list.size()) + " ");

        bw.flush();
        bw.close();
    }
}