import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        List<List<String>> user = new ArrayList<>();
        for (int i = 0; i < repeat; i++) {
            String[] tokens = br.readLine().split(" ");
            user.add(new ArrayList<>(){{add(tokens[0]); add(tokens[1]);}});
        }
        user.sort(Comparator.comparingInt(o -> Integer.parseInt(o.get(0))));
        for (int i = 0; i < repeat; i++) {
            bw.write(user.get(i).get(0) + " " +user.get(i).get(1) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
