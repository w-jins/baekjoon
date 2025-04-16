import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        LinkedList<Integer> q = new LinkedList<>();

        for (int i = 0 ; i< repeat; i ++) {
        String[] input = br.readLine().split(" ");
            switch(input[0]) {
                case "push" :
                    q.offer(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    if (q.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(q.poll() + "\n");
                    }
                    break;
                case "size":
                    bw.write(q.size() + "\n");
                    break;
                case "empty" :
                    if(q.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                case "front" :
                    if(q.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(q.getFirst() + "\n");
                    }
                    break;
                default:
                    if (q.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(q.getLast() + "\n");
                    }

                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}