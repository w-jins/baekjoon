import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < repeat; i++) {
            list.add(br.readLine());
        }

        list.sort((x, y) -> x.length() - y.length());
        list.sort((x, y) -> {
            if (x.length() == y.length()) {
                return x.compareTo(y);
            }
            return 0;
        });
        list.stream().distinct().forEach(System.out::println);

        bw.flush();
        bw.close();
    }
}