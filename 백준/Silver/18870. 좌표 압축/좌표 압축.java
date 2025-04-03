import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer sto;

        int repeat = Integer.parseInt(br.readLine());
        sto = new StringTokenizer(br.readLine(), " ");
        long[] arr = new long[repeat];
        for (int i = 0; i < repeat; i++) {
            arr[i] = Integer.parseInt(sto.nextToken());
        }
        long[] sortArr = Arrays.stream(arr).distinct().sorted().toArray();

        for (long l : arr) {
            long count = Arrays.binarySearch(sortArr, l);
            if (count < 0) {
                count = -count - 1;
            }
            bw.write(count + " ");
        }
        bw.flush();
        bw.close();
    }
}
