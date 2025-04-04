import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer sto;

        ArrayList<Integer> gong = new ArrayList<>();

        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            sto = new StringTokenizer(br.readLine());
            String s = sto.nextToken();
            int x = 0;
            if (sto.countTokens() == 1) {
                x = Integer.parseInt(sto.nextToken());
            }
            switch (s) {
                case "add":
                    if (gong.contains(x)){
                        break;
                    }
                    gong.add(x);
                    break;
                case "remove":
                    if (gong.contains(x)){
                        gong.remove(Integer.valueOf(x));
                    } else {
                        break;
                    }
                    break;
                case "check":
                    if (gong.contains(x)){
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                case "toggle" :
                    if (gong.contains(x)){
                        gong.remove(Integer.valueOf(x));
                    } else {
                        gong.add(x);
                    }
                    break;
                case "all":
                    gong.clear();
                    for(int j = 1; j <= 20; j++) {
                        gong.add(j);
                    }
                    break;
                default:
                    gong.clear();
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
