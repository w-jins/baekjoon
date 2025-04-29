import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        int sum = 0;
        for (int a : list) {
            sum += a;
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int max = 0;
        for (int a : map.values()) {
            if (a > max) {
                max = a;
            }
        }
        for (int a : map.keySet()) {
            if (map.get(a) == max) {
                list2.add(a);
            }
        }

        bw.write(Math.round(((double) sum / N)) + "\n");
        bw.write(list.get((list.size() - 1) / 2) + "\n");
        if (list2.size() >= 2) {
            bw.write(list2.get(1) + "\n");
        } else {
            bw.write(list2.get(0) + "\n");
        }
        bw.write((list.get(list.size() - 1) - list.get(0)) + "");


        bw.flush();
        bw.close();
    }
}