import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            map.put(s, i);
            list.add(s);
        }

        for (int i = 0; i < M ; i++) {
            String s = br.readLine();
            if (map.containsKey(s)) {
                bw.write(map.get(s) + "\n");
            } else {
                bw.write(list.get(Integer.parseInt(s) - 1) + "\n");
            }


        }
        bw.flush();
        bw.close();
    }
}