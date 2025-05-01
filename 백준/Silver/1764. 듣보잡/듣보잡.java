import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N + M; i++) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) == 2) {
                list.add(key);
            }
        }
        Collections.sort(list);
        bw.write(list.size() + "\n");
        for (String a : list) {
            bw.write(a + "\n");
        }


        bw.flush();
        bw.close();
    }
}