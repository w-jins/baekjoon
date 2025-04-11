import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer sto;
        int repeat = Integer.parseInt(br.readLine());
        sto = new StringTokenizer(br.readLine());
        int[] arr = new int[repeat];
        double max = 0;
        double sum = 0;
        for( int i = 0; i < repeat; i++ ) {
            arr[i] = Integer.parseInt(sto.nextToken());
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for ( int i : arr) {
            sum += (i/max * 100);
        }

        bw.write(sum / repeat + "\n");
        bw.flush();
        bw.close();
    }
}